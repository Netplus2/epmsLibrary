package com.danbamitale.epmslib.comms;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ&\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0016\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bJ\u0006\u0010\u0017\u001a\u00020\u0007\u00a8\u0006\u0018"}, d2 = {"Lcom/danbamitale/epmslib/comms/SSLManager;", "", "()V", "createSocket", "Ljava/net/Socket;", "kotlin.jvm.PlatformType", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "ipAddress", "", "port", "", "getSSLSocketFactory", "trustManagerFactory", "Ljavax/net/ssl/TrustManagerFactory;", "keyManagerFactory", "Ljavax/net/ssl/KeyManagerFactory;", "secureRandom", "Ljava/security/SecureRandom;", "getTrustManagerFactory", "context", "Landroid/content/Context;", "certificateResourceId", "getTrustySSLSocketFactory", "epmslib_debug"})
public final class SSLManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.danbamitale.epmslib.comms.SSLManager INSTANCE = null;
    
    private SSLManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.net.ssl.TrustManagerFactory getTrustManagerFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int certificateResourceId) {
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
}