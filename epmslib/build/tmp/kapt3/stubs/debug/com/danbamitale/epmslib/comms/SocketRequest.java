package com.danbamitale.epmslib.comms;

import java.lang.System;

/**
 * @param connectionData
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/danbamitale/epmslib/comms/SocketRequest;", "", "connectionData", "Lcom/danbamitale/epmslib/entities/ConnectionData;", "(Lcom/danbamitale/epmslib/entities/ConnectionData;)V", "getConnection", "Ljavax/net/ssl/SSLSocket;", "context", "Landroid/content/Context;", "ip", "", "port", "", "certFileResId", "send", "isoStream", "", "socket", "Ljava/net/Socket;", "epmslib_debug"})
public final class SocketRequest {
    private final com.danbamitale.epmslib.entities.ConnectionData connectionData = null;
    
    public SocketRequest(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.ConnectionData connectionData) {
        super();
    }
    
    /**
     * @param isoStream byte[]
     * @param isSSL boolean
     * @param context Context
     * @return response String
     * @throws Exception
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public final java.lang.String send(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    byte[] isoStream) throws java.lang.Exception {
        return null;
    }
    
    /**
     * @param isoStream byte[]
     * @param socket Socket
     * @return response String
     * @throws Exception
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    private final java.lang.String send(byte[] isoStream, java.net.Socket socket) throws java.lang.Exception {
        return null;
    }
    
    /**
     * @param ip
     * @param port
     * @param context
     * @return SSLSocket
     * @throws IOException
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public final javax.net.ssl.SSLSocket getConnection(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String ip, int port, int certFileResId) throws java.io.IOException {
        return null;
    }
}