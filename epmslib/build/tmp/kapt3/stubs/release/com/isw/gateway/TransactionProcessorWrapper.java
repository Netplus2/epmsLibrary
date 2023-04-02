package com.isw.gateway;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003H\u0002J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0002J\t\u0010*\u001a\u00020\u0003H\u0082 J\t\u0010+\u001a\u00020\u0003H\u0082 J\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010/\u001a\u000200J \u00101\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u000205H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/isw/gateway/TransactionProcessorWrapper;", "", "merchId", "", "terminalId", "amount", "", "otherAmount", "transactionRequestData", "Lcom/danbamitale/epmslib/entities/TransactionRequestData;", "keyHolder", "Lcom/danbamitale/epmslib/entities/KeyHolder;", "configData", "Lcom/danbamitale/epmslib/entities/ConfigData;", "(Ljava/lang/String;Ljava/lang/String;JJLcom/danbamitale/epmslib/entities/TransactionRequestData;Lcom/danbamitale/epmslib/entities/KeyHolder;Lcom/danbamitale/epmslib/entities/ConfigData;)V", "attempt", "", "getConfigData", "()Lcom/danbamitale/epmslib/entities/ConfigData;", "setConfigData", "(Lcom/danbamitale/epmslib/entities/ConfigData;)V", "getKeyHolder", "()Lcom/danbamitale/epmslib/entities/KeyHolder;", "setKeyHolder", "(Lcom/danbamitale/epmslib/entities/KeyHolder;)V", "posVasIp", "posVasPort", "transactionProcessor", "Lcom/danbamitale/epmslib/processors/TransactionProcessor;", "getTransactionRequestData", "()Lcom/danbamitale/epmslib/entities/TransactionRequestData;", "setTransactionRequestData", "(Lcom/danbamitale/epmslib/entities/TransactionRequestData;)V", "transactionRoute", "Lcom/danbamitale/epmslib/utils/TransactionRoute;", "getCVMMethod", "Lcom/danbamitale/epmslib/utils/CVMETHOD;", "cvmResult", "getConnectionData", "Lcom/danbamitale/epmslib/entities/ConnectionData;", "posMode", "Lcom/danbamitale/epmslib/entities/PosMode;", "getIp", "getPort", "processIswTransaction", "Lio/reactivex/Single;", "Lcom/danbamitale/epmslib/entities/TransactionResponse;", "cardData", "Lcom/danbamitale/epmslib/entities/CardData;", "rollback", "context", "Landroid/content/Context;", "reversalReasonCode", "Lcom/danbamitale/epmslib/utils/MessageReasonCode;", "epmslib_release"})
public final class TransactionProcessorWrapper {
    private final java.lang.String merchId = null;
    private final java.lang.String terminalId = null;
    private final long amount = 0L;
    private final long otherAmount = 0L;
    @org.jetbrains.annotations.Nullable()
    private com.danbamitale.epmslib.entities.TransactionRequestData transactionRequestData;
    @org.jetbrains.annotations.Nullable()
    private com.danbamitale.epmslib.entities.KeyHolder keyHolder;
    @org.jetbrains.annotations.Nullable()
    private com.danbamitale.epmslib.entities.ConfigData configData;
    private final java.lang.String posVasIp = null;
    private final int posVasPort = 0;
    private com.danbamitale.epmslib.utils.TransactionRoute transactionRoute;
    private com.danbamitale.epmslib.processors.TransactionProcessor transactionProcessor;
    private int attempt = 0;
    
    @kotlin.jvm.JvmOverloads()
    public TransactionProcessorWrapper(@org.jetbrains.annotations.NotNull()
    java.lang.String merchId, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalId, long amount) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public TransactionProcessorWrapper(@org.jetbrains.annotations.NotNull()
    java.lang.String merchId, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalId, long amount, long otherAmount) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public TransactionProcessorWrapper(@org.jetbrains.annotations.NotNull()
    java.lang.String merchId, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalId, long amount, long otherAmount, @org.jetbrains.annotations.Nullable()
    com.danbamitale.epmslib.entities.TransactionRequestData transactionRequestData) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public TransactionProcessorWrapper(@org.jetbrains.annotations.NotNull()
    java.lang.String merchId, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalId, long amount, long otherAmount, @org.jetbrains.annotations.Nullable()
    com.danbamitale.epmslib.entities.TransactionRequestData transactionRequestData, @org.jetbrains.annotations.Nullable()
    com.danbamitale.epmslib.entities.KeyHolder keyHolder) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public TransactionProcessorWrapper(@org.jetbrains.annotations.NotNull()
    java.lang.String merchId, @org.jetbrains.annotations.NotNull()
    java.lang.String terminalId, long amount, long otherAmount, @org.jetbrains.annotations.Nullable()
    com.danbamitale.epmslib.entities.TransactionRequestData transactionRequestData, @org.jetbrains.annotations.Nullable()
    com.danbamitale.epmslib.entities.KeyHolder keyHolder, @org.jetbrains.annotations.Nullable()
    com.danbamitale.epmslib.entities.ConfigData configData) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.danbamitale.epmslib.entities.TransactionRequestData getTransactionRequestData() {
        return null;
    }
    
    public final void setTransactionRequestData(@org.jetbrains.annotations.Nullable()
    com.danbamitale.epmslib.entities.TransactionRequestData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.danbamitale.epmslib.entities.KeyHolder getKeyHolder() {
        return null;
    }
    
    public final void setKeyHolder(@org.jetbrains.annotations.Nullable()
    com.danbamitale.epmslib.entities.KeyHolder p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.danbamitale.epmslib.entities.ConfigData getConfigData() {
        return null;
    }
    
    public final void setConfigData(@org.jetbrains.annotations.Nullable()
    com.danbamitale.epmslib.entities.ConfigData p0) {
    }
    
    private final native java.lang.String getIp() {
        return null;
    }
    
    private final native java.lang.String getPort() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.danbamitale.epmslib.entities.TransactionResponse> processIswTransaction(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.CardData cardData) {
        return null;
    }
    
    private final com.danbamitale.epmslib.utils.CVMETHOD getCVMMethod(java.lang.String cvmResult) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    public final io.reactivex.Single<com.danbamitale.epmslib.entities.TransactionResponse> rollback(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    public final io.reactivex.Single<com.danbamitale.epmslib.entities.TransactionResponse> rollback(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.utils.MessageReasonCode reversalReasonCode) {
        return null;
    }
    
    private final com.danbamitale.epmslib.entities.ConnectionData getConnectionData(com.danbamitale.epmslib.entities.PosMode posMode) {
        return null;
    }
}