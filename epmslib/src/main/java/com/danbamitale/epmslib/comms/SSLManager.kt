package com.danbamitale.epmslib.comms

import android.content.Context
import timber.log.Timber
import java.io.BufferedInputStream
import java.io.File
import java.io.InputStream
import java.security.KeyStore
import java.security.SecureRandom
import java.security.cert.CertificateException
import java.security.cert.CertificateFactory
import java.security.cert.X509Certificate
import javax.net.ssl.*

object SSLManager {

    fun getTrustManagerFactory(context: Context, certificateFile: File): TrustManagerFactory {
        // Load CAs from an InputStream (could be from a resource or ByteArrayInputStream or ...)
        val cf: CertificateFactory = CertificateFactory.getInstance("X.509")

        val certificateInputStream = certificateFile.inputStream()
        val bufferedInputStream = BufferedInputStream(certificateInputStream)

        val caInput: InputStream = bufferedInputStream
        val ca: X509Certificate = caInput.use {
            cf.generateCertificate(it) as X509Certificate
        }
        System.out.println("ca=" + ca.subjectDN)

        // Create a KeyStore containing our trusted CAs
        val keyStoreType = KeyStore.getDefaultType()
        val keyStore = KeyStore.getInstance(keyStoreType).apply {
            load(null, null)
            setCertificateEntry("ca", ca)
        }

        // Create a TrustManager that trusts the CAs inputStream our KeyStore
        val tmfAlgorithm: String = TrustManagerFactory.getDefaultAlgorithm()
        val tmf: TrustManagerFactory = TrustManagerFactory.getInstance(tmfAlgorithm).apply {
            init(keyStore)
        }

        return tmf
    }

    fun getTrustySSLSocketFactory(): SSLSocketFactory {
        val trustManager = object : X509TrustManager {

            @Throws(CertificateException::class)
            override fun checkClientTrusted(chain: Array<out X509Certificate>?, authType: String?) {
                checkCertTrusted(chain, authType, false, this)
            }

            override fun checkServerTrusted(chain: Array<out X509Certificate>?, authType: String?) {
                checkCertTrusted(chain, authType, false, this)
            }

            override fun getAcceptedIssuers(): Array<X509Certificate> {
                return arrayOf()
            }
        }

        return SSLContext.getInstance("TLS").apply {
            init(null, arrayOf(trustManager), SecureRandom())
        }.socketFactory
    }

    fun getSSLSocketFactory(
        trustManagerFactory: TrustManagerFactory,
        keyManagerFactory: KeyManagerFactory? = null,
        secureRandom: SecureRandom? = null,
    ): SSLSocketFactory {
        val context: SSLContext = SSLContext.getInstance("TLS").apply {
            init(keyManagerFactory?.keyManagers, trustManagerFactory.trustManagers, secureRandom)
        }

        return context.socketFactory
    }

    fun createSocket(sslSocketFactory: SSLSocketFactory, ipAddress: String, port: Int) =
        sslSocketFactory.createSocket(ipAddress, port)

    @Throws(CertificateException::class)
    fun checkCertTrusted(
        chain: Array<out X509Certificate>?,
        authType: String?,
        isServer: Boolean,
        trustManager: X509TrustManager
    ) {
        try {
            if (isServer) {
                trustManager.checkServerTrusted(
                    chain,
                    authType,
                )
            } else {
                trustManager.checkClientTrusted(chain, authType)
            }
        } catch (ae: CertificateException) {
            // if the cert is stored in our appTrustManager, we ignore expiredness
            Timber.tag("CERTIFICATE_EXCEPTION").d(ae.localizedMessage)
        }
    }
}
