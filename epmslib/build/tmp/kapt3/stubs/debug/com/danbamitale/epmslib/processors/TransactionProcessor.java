package com.danbamitale.epmslib.processors;

import java.lang.System;

/**
 * @property hostConfig
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J2\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002J$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J2\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\r2\b\b\u0002\u0010\'\u001a\u00020\u0006J \u0010(\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*H\u0002J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/danbamitale/epmslib/processors/TransactionProcessor;", "", "hostConfig", "Lcom/danbamitale/epmslib/entities/HostConfig;", "(Lcom/danbamitale/epmslib/entities/HostConfig;)V", "amountTransactionFee", "", "pinCaptureMode", "posConditionCode", "posDataCode", "requestHandler", "Lcom/danbamitale/epmslib/comms/SocketRequest;", "requestIsoMessage", "Lcom/solab/iso8583/IsoMessage;", "transactionTimeInMillis", "", "getIsoMessageForReversal", "requestData", "Lcom/danbamitale/epmslib/entities/TransactionRequestData;", "cardData", "Lcom/danbamitale/epmslib/entities/CardData;", "getOriginalDataElementField90", "originalMTI", "acquiringInstCode", "forwardingInstCode", "originalSTAN", "originalTransmissionDateTime", "getReplacementAmountField95", "originalAmount", "newAmount", "processTransaction", "Lio/reactivex/Single;", "Lcom/danbamitale/epmslib/entities/TransactionResponse;", "context", "Landroid/content/Context;", "rollback", "reversalReasonCode", "Lcom/danbamitale/epmslib/utils/MessageReasonCode;", "initialIsoMessage", "sessionKey", "setBaseFields", "configData", "Lcom/danbamitale/epmslib/entities/ConfigData;", "setOriginalTransactionData", "", "isoMessage", "epmslib_debug"})
public final class TransactionProcessor {
    private final com.danbamitale.epmslib.entities.HostConfig hostConfig = null;
    private final java.lang.String posConditionCode = "00";
    private final java.lang.String pinCaptureMode = "12";
    private final java.lang.String amountTransactionFee = "D00000000";
    private final java.lang.String posDataCode = "510101511344101";
    private final com.danbamitale.epmslib.comms.SocketRequest requestHandler = null;
    private com.solab.iso8583.IsoMessage requestIsoMessage;
    private long transactionTimeInMillis = 0L;
    
    public TransactionProcessor(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.HostConfig hostConfig) {
        super();
    }
    
    private final com.solab.iso8583.IsoMessage setBaseFields(com.danbamitale.epmslib.entities.TransactionRequestData requestData, com.danbamitale.epmslib.entities.CardData cardData, com.danbamitale.epmslib.entities.ConfigData configData) {
        return null;
    }
    
    private final void setOriginalTransactionData(com.solab.iso8583.IsoMessage isoMessage, com.danbamitale.epmslib.entities.TransactionRequestData requestData) {
    }
    
    private final java.lang.String getOriginalDataElementField90(java.lang.String originalMTI, java.lang.String acquiringInstCode, java.lang.String forwardingInstCode, java.lang.String originalSTAN, java.lang.String originalTransmissionDateTime) {
        return null;
    }
    
    private final java.lang.String getReplacementAmountField95(long originalAmount, long newAmount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.solab.iso8583.IsoMessage getIsoMessageForReversal(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionRequestData requestData, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.CardData cardData) {
        return null;
    }
    
    /**
     * Send a payment request to processor
     *
     * @param context
     * @param requestData
     * @param cardData
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.danbamitale.epmslib.entities.TransactionResponse> processTransaction(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionRequestData requestData, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.CardData cardData) {
        return null;
    }
    
    /**
     * Roll back a transaction. If initialIsoMessage is specified, that rollback request
     * is built using that transaction, else the last sent transaction is rolled-back.
     *
     * @param context
     * @param initialIsoMessage Optional
     * @param sessionKey Optional
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.danbamitale.epmslib.entities.TransactionResponse> rollback(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.utils.MessageReasonCode reversalReasonCode, @org.jetbrains.annotations.NotNull()
    com.solab.iso8583.IsoMessage initialIsoMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionKey) {
        return null;
    }
}