package com.danbamitale.epmslib.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rJ\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0002\u00a8\u0006\u0015"}, d2 = {"Lcom/danbamitale/epmslib/utils/IsoAdapter;", "", "()V", "getResponseDataFromIndex", "", "isoMsg", "Lcom/solab/iso8583/IsoMessage;", "index", "", "logIsoMessage", "", "msg", "prepareByteStream", "", "isoMessage", "isoBytes", "processISOBitStreamWithJ8583", "context", "Landroid/content/Context;", "data", "unpackWith8583", "epmslib_release"})
public final class IsoAdapter {
    @org.jetbrains.annotations.NotNull()
    public static final com.danbamitale.epmslib.utils.IsoAdapter INSTANCE = null;
    
    private IsoAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.solab.iso8583.IsoMessage processISOBitStreamWithJ8583(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
    
    private final com.solab.iso8583.IsoMessage unpackWith8583(android.content.Context context, java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class, java.io.UnsupportedEncodingException.class})
    public final byte[] prepareByteStream(@org.jetbrains.annotations.NotNull()
    com.solab.iso8583.IsoMessage isoMessage) throws java.lang.Exception, java.io.UnsupportedEncodingException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public final byte[] prepareByteStream(@org.jetbrains.annotations.NotNull()
    byte[] isoBytes) throws java.lang.Exception {
        return null;
    }
    
    public final void logIsoMessage(@org.jetbrains.annotations.NotNull()
    com.solab.iso8583.IsoMessage msg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResponseDataFromIndex(@org.jetbrains.annotations.NotNull()
    com.solab.iso8583.IsoMessage isoMsg, int index) {
        return null;
    }
}