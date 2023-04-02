package com.danbamitale.epmslib.processors;

import java.lang.System;

/**
 * @param connectionData
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J>\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0012J@\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0012J2\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJ2\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00160\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJ\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tJ,\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJ,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJ,\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJ.\u0010 \u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\t0\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\tH\u0002JB\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/danbamitale/epmslib/processors/TerminalConfigurator;", "", "connectionData", "Lcom/danbamitale/epmslib/entities/ConnectionData;", "(Lcom/danbamitale/epmslib/entities/ConnectionData;)V", "requestHandler", "Lcom/danbamitale/epmslib/comms/SocketRequest;", "doNetworkParamDownload", "Lio/reactivex/Single;", "", "context", "Landroid/content/Context;", "transactionType", "Lcom/danbamitale/epmslib/entities/TransactionType;", "terminalID", "sessionKey", "terminalSerial", "responseDataIndex", "", "doNetworkParamDownloadExtended", "field62TlvData", "downloadNibssAID", "", "Lcom/danbamitale/epmslib/entities/NibssAID;", "downloadNibssCAPK", "Lcom/danbamitale/epmslib/entities/NibssCA;", "downloadNibssKeys", "Lcom/danbamitale/epmslib/entities/KeyHolder;", "downloadTerminalParameters", "Lcom/danbamitale/epmslib/entities/ConfigData;", "nibssCallHome", "nibssEOD", "nibssKeyRequest", "kotlin.jvm.PlatformType", "type", "Lcom/danbamitale/epmslib/processors/TerminalConfigurator$KeyType;", "parseField62", "field62String", "sendNetworkManagementRequest", "field62Data", "transactionCode", "KeyType", "epmslib_release"})
public final class TerminalConfigurator {
    private final com.danbamitale.epmslib.comms.SocketRequest requestHandler = null;
    
    public TerminalConfigurator(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.ConnectionData connectionData) {
        super();
    }
    
    private final com.danbamitale.epmslib.entities.ConfigData parseField62(java.lang.String field62String) {
        return null;
    }
    
    private final io.reactivex.Single<java.lang.String> nibssKeyRequest(android.content.Context context, com.danbamitale.epmslib.processors.TerminalConfigurator.KeyType type, java.lang.String terminalID) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    private final io.reactivex.Single<java.lang.String> sendNetworkManagementRequest(android.content.Context context, java.lang.String terminalID, java.lang.String sessionKey, java.lang.String field62Data, java.lang.String transactionCode, int responseDataIndex) {
        return null;
    }
    
    /**
     * Send Network Management Request to Processor
     * On success it returns the content of the specified response index or if none is specified, the response code
     * On error throws Exception
     *
     * @param context
     * @param transactionType
     * @param terminalID
     * @param sessionKey
     * @param terminalSerial
     * @param responseDataIndex  expected ISO 8583 field index
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.String> doNetworkParamDownload(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalID, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionKey, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalSerial, int responseDataIndex) {
        return null;
    }
    
    /**
     * Send Network Management Request to Processor
     * On success it returns the content of the specified response index or if none is specified, the response code
     * On error throws Exception
     *
     * @param context
     * @param transactionType
     * @param terminalID
     * @param sessionKey
     * @param responseDataIndex  expected ISO 8583 field index
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.String> doNetworkParamDownloadExtended(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalID, @org.jetbrains.annotations.Nullable()
    java.lang.String sessionKey, @org.jetbrains.annotations.NotNull()
    java.lang.String field62TlvData, int responseDataIndex) {
        return null;
    }
    
    /**
     * Download Key configuration from processor
     * on success: KeyHolder
     *
     * @param context
     * @param terminalID
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.danbamitale.epmslib.entities.KeyHolder> downloadNibssKeys(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalID) {
        return null;
    }
    
    /**
     * Download terminal configurations from processor
     * on success: ConfigData
     *
     * @param context
     * @param terminalID
     * @param sessionKey
     * @param terminalSerial
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.danbamitale.epmslib.entities.ConfigData> downloadTerminalParameters(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalID, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionKey, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalSerial) {
        return null;
    }
    
    /**
     * Download dynamic CA Public Key from processor
     * on success: List<NibssCA>
     *
     * @param context
     * @param terminalID
     * @param sessionKey
     * @param terminalSerial
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<com.danbamitale.epmslib.entities.NibssCA>> downloadNibssCAPK(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalID, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionKey, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalSerial) {
        return null;
    }
    
    /**
     * Download dynamic Application Identifiers (AID) from processor
     * on success: List<NibssAID>
     *
     * @param context
     * @param terminalID
     * @param sessionKey
     * @param terminalSerial
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<com.danbamitale.epmslib.entities.NibssAID>> downloadNibssAID(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalID, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionKey, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalSerial) {
        return null;
    }
    
    /**
     * Send CallHome request to processor
     * on success: response code
     *
     * @param context
     * @param terminalID
     * @param sessionKey
     * @param terminalSerial
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.String> nibssCallHome(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalID, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionKey, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalSerial) {
        return null;
    }
    
    /**
     * Send EOD request to processor
     * on success: response code
     *
     * @param context
     * @param terminalID
     * @param sessionKey
     * @param terminalSerial
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.String> nibssEOD(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalID, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionKey, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalSerial) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/danbamitale/epmslib/processors/TerminalConfigurator$KeyType;", "", "(Ljava/lang/String;I)V", "MASTER", "SESSION", "PIN", "epmslib_release"})
    static enum KeyType {
        /*public static final*/ MASTER /* = new MASTER() */,
        /*public static final*/ SESSION /* = new SESSION() */,
        /*public static final*/ PIN /* = new PIN() */;
        
        KeyType() {
        }
    }
}