package com.danbamitale.epmslib.utils

import java.nio.charset.StandardCharsets
import java.security.SecureRandom
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec
import kotlin.experimental.and

object DataEncryptAndDecrypt {

    fun encrypt(plainText: String, key: String): String {
        val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
        val secretKey = SecretKeySpec(key.toByteArray(StandardCharsets.UTF_8), "AES")
        val initializationVector = ByteArray(cipher.blockSize)
        SecureRandom().nextBytes(initializationVector)

        cipher.init(Cipher.ENCRYPT_MODE, secretKey, IvParameterSpec(initializationVector))
        val encryptedBytes = cipher.doFinal(plainText.toByteArray(StandardCharsets.UTF_8))
        val encryptedData = ByteArray(initializationVector.size + encryptedBytes.size)
        System.arraycopy(initializationVector, 0, encryptedData, 0, initializationVector.size)
        System.arraycopy(
            encryptedBytes,
            0,
            encryptedData,
            initializationVector.size,
            encryptedBytes.size,
        )

        return hex2String(encryptedData)
    }

    fun decrypt(encryptedText: String, key: String): String {
        val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
        val secretKey = SecretKeySpec(key.toByteArray(StandardCharsets.UTF_8), "AES")
//        val encryptedData = Base64.getDecoder().decode(encryptedText)
        val encryptedData = string2Hex(encryptedText)
        val initializationVector = encryptedData.sliceArray(0 until cipher.blockSize)
        val encryptedBytes = encryptedData.sliceArray(cipher.blockSize until encryptedData.size)

        cipher.init(Cipher.DECRYPT_MODE, secretKey, IvParameterSpec(initializationVector))
        val decryptedBytes = cipher.doFinal(encryptedBytes)
        return String(decryptedBytes, StandardCharsets.UTF_8)
    }

    fun hex2String(data: ByteArray?): String {
        if (data == null) {
            return ""
        }
        var result = ""
        for (i in data.indices) {
            var tmp: Int = i shr (4)
            result += (tmp and 0x0F).toString(16)
            tmp = (data[i] and 0x0F).toInt()
            result += (tmp and 0x0F).toString(16)
        }
        return result
    }

    /**
     * Convert Hex String to byte array
     * @param data
     * @return
     */
    fun string2Hex(data: String): ByteArray {
        val result: ByteArray = ByteArray(data.length / 2)
        var i = 0
        while (i < data.length) {
            result[i / 2] = data.substring(i, i + 2).toInt(16).toByte()
            i += 2
        }
        return result
    }
}
