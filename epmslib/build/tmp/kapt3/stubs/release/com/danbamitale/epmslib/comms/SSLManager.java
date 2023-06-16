package com.danbamitale.epmslib.comms;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ&\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016J&\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u0013\u00a8\u0006$"}, d2 = {"Lcom/danbamitale/epmslib/comms/SSLManager;", "", "()V", "checkCertTrusted", "", "chain", "", "Ljava/security/cert/X509Certificate;", "authType", "", "isServer", "", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;ZLjavax/net/ssl/X509TrustManager;)V", "createSocket", "Ljava/net/Socket;", "kotlin.jvm.PlatformType", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "ipAddress", "port", "", "getSSLSocketFactory", "trustManagerFactory", "Ljavax/net/ssl/TrustManagerFactory;", "keyManagerFactory", "Ljavax/net/ssl/KeyManagerFactory;", "secureRandom", "Ljava/security/SecureRandom;", "getTrustManagerFactory", "context", "Landroid/content/Context;", "certificateFile", "Ljava/io/File;", "getTrustySSLSocketFactory", "epmslib_release"})
public final class SSLManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.danbamitale.epmslib.comms.SSLManager INSTANCE = null;
    
    private SSLManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.net.ssl.TrustManagerFactory getTrustManagerFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File certificateFile) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.net.ssl.SSLSocketFactory getTrustySSLSocketFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.net.ssl.SSLSocketFactory getSSLSocketFactory(@org.jetbrains.annotations.NotNull()
    javax.net.ssl.TrustManagerFactory trustManagerFactory, @org.jetbrains.annotations.Nullable()
    javax.net.ssl.KeyManagerFactory keyManagerFactory, @org.jetbrains.annotations.Nullable()
    java.security.SecureRandom secureRandom) {
        return null;
    }
    
    public final java.net.Socket createSocket(@org.jetbrains.annotations.NotNull()
    javax.net.ssl.SSLSocketFactory sslSocketFactory, @org.jetbrains.annotations.NotNull()
    java.lang.String ipAddress, int port) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.security.cert.CertificateException.class})
    public final void checkCertTrusted(@org.jetbrains.annotations.Nullable()
    java.security.cert.X509Certificate[] chain, @org.jetbrains.annotations.Nullable()
    java.lang.String authType, boolean isServer, @org.jetbrains.annotations.NotNull()
    javax.net.ssl.X509TrustManager trustManager) throws java.security.cert.CertificateException {
    }
}