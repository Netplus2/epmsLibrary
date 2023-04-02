package com.danbamitale.epmslib.entities;

import java.lang.System;

/**
 * Payment request data.
 * otherAmount property is required for PURCHASE WITH CASHBACK transactions
 * For SALES COMPLETION, REFUND and REVERSAL transactions, originalDataElements property is required
 *
 * @property transactionType
 * @property amount
 * @property otherAmount
 * @property accountType
 * @property additionalTransParams optional
 * @property echoData optional
 * @property originalDataElements  conditional
 */
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\fB7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fBe\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u0013J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\bH\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003Jm\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001J\t\u0010>\u001a\u00020?H\u00d6\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CH\u00d6\u0003J\t\u0010D\u001a\u00020?H\u00d6\u0001J\t\u0010E\u001a\u00020\nH\u00d6\u0001J\u0019\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020?H\u00d6\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103\u00a8\u0006K"}, d2 = {"Lcom/danbamitale/epmslib/entities/TransactionRequestData;", "Landroid/os/Parcelable;", "transactionType", "Lcom/danbamitale/epmslib/entities/TransactionType;", "amount", "", "otherAmount", "accountType", "Lcom/danbamitale/epmslib/utils/IsoAccountType;", "RRN", "", "STAN", "(Lcom/danbamitale/epmslib/entities/TransactionType;JJLcom/danbamitale/epmslib/utils/IsoAccountType;Ljava/lang/String;Ljava/lang/String;)V", "originalDataElements", "Lcom/danbamitale/epmslib/entities/OriginalDataElements;", "(Lcom/danbamitale/epmslib/entities/TransactionType;JJLcom/danbamitale/epmslib/utils/IsoAccountType;Lcom/danbamitale/epmslib/entities/OriginalDataElements;)V", "additionalTransParams", "Lcom/danbamitale/epmslib/entities/AdditionalTransParams;", "echoData", "(Lcom/danbamitale/epmslib/entities/TransactionType;JJLcom/danbamitale/epmslib/utils/IsoAccountType;Ljava/lang/String;Ljava/lang/String;Lcom/danbamitale/epmslib/entities/AdditionalTransParams;Ljava/lang/String;Lcom/danbamitale/epmslib/entities/OriginalDataElements;)V", "getRRN", "()Ljava/lang/String;", "setRRN", "(Ljava/lang/String;)V", "getSTAN", "setSTAN", "getAccountType", "()Lcom/danbamitale/epmslib/utils/IsoAccountType;", "getAdditionalTransParams", "()Lcom/danbamitale/epmslib/entities/AdditionalTransParams;", "getAmount", "()J", "setAmount", "(J)V", "getEchoData", "iswParameters", "Lcom/isw/iswclient/request/IswParameters;", "getIswParameters", "()Lcom/isw/iswclient/request/IswParameters;", "setIswParameters", "(Lcom/isw/iswclient/request/IswParameters;)V", "getOriginalDataElements", "()Lcom/danbamitale/epmslib/entities/OriginalDataElements;", "getOtherAmount", "processingProperties", "Lcom/isw/iswclient/request/ProcessingProperties;", "getProcessingProperties", "()Lcom/isw/iswclient/request/ProcessingProperties;", "setProcessingProperties", "(Lcom/isw/iswclient/request/ProcessingProperties;)V", "getTransactionType", "()Lcom/danbamitale/epmslib/entities/TransactionType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "epmslib_release"})
public final class TransactionRequestData implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final com.danbamitale.epmslib.entities.TransactionType transactionType = null;
    private long amount;
    private final long otherAmount = 0L;
    @org.jetbrains.annotations.NotNull()
    private final com.danbamitale.epmslib.utils.IsoAccountType accountType = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String RRN;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String STAN;
    @org.jetbrains.annotations.Nullable()
    private final com.danbamitale.epmslib.entities.AdditionalTransParams additionalTransParams = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String echoData = null;
    @org.jetbrains.annotations.Nullable()
    private final com.danbamitale.epmslib.entities.OriginalDataElements originalDataElements = null;
    @org.jetbrains.annotations.Nullable()
    private com.isw.iswclient.request.IswParameters iswParameters;
    @org.jetbrains.annotations.Nullable()
    private com.isw.iswclient.request.ProcessingProperties processingProperties;
    public static final android.os.Parcelable.Creator<com.danbamitale.epmslib.entities.TransactionRequestData> CREATOR = null;
    
    /**
     * Payment request data.
     * otherAmount property is required for PURCHASE WITH CASHBACK transactions
     * For SALES COMPLETION, REFUND and REVERSAL transactions, originalDataElements property is required
     *
     * @property transactionType
     * @property amount
     * @property otherAmount
     * @property accountType
     * @property additionalTransParams optional
     * @property echoData optional
     * @property originalDataElements  conditional
     */
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.TransactionRequestData copy(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, long amount, long otherAmount, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.utils.IsoAccountType accountType, @org.jetbrains.annotations.Nullable()
    java.lang.String RRN, @org.jetbrains.annotations.Nullable()
    java.lang.String STAN, @org.jetbrains.annotations.Nullable()
    com.danbamitale.epmslib.entities.AdditionalTransParams additionalTransParams, @org.jetbrains.annotations.Nullable()
    java.lang.String echoData, @org.jetbrains.annotations.Nullable()
    com.danbamitale.epmslib.entities.OriginalDataElements originalDataElements) {
        return null;
    }
    
    /**
     * Payment request data.
     * otherAmount property is required for PURCHASE WITH CASHBACK transactions
     * For SALES COMPLETION, REFUND and REVERSAL transactions, originalDataElements property is required
     *
     * @property transactionType
     * @property amount
     * @property otherAmount
     * @property accountType
     * @property additionalTransParams optional
     * @property echoData optional
     * @property originalDataElements  conditional
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Payment request data.
     * otherAmount property is required for PURCHASE WITH CASHBACK transactions
     * For SALES COMPLETION, REFUND and REVERSAL transactions, originalDataElements property is required
     *
     * @property transactionType
     * @property amount
     * @property otherAmount
     * @property accountType
     * @property additionalTransParams optional
     * @property echoData optional
     * @property originalDataElements  conditional
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Payment request data.
     * otherAmount property is required for PURCHASE WITH CASHBACK transactions
     * For SALES COMPLETION, REFUND and REVERSAL transactions, originalDataElements property is required
     *
     * @property transactionType
     * @property amount
     * @property otherAmount
     * @property accountType
     * @property additionalTransParams optional
     * @property echoData optional
     * @property originalDataElements  conditional
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public TransactionRequestData(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, long amount, long otherAmount, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.utils.IsoAccountType accountType, @org.jetbrains.annotations.Nullable()
    java.lang.String RRN, @org.jetbrains.annotations.Nullable()
    java.lang.String STAN, @org.jetbrains.annotations.Nullable()
    com.danbamitale.epmslib.entities.AdditionalTransParams additionalTransParams, @org.jetbrains.annotations.Nullable()
    java.lang.String echoData, @org.jetbrains.annotations.Nullable()
    com.danbamitale.epmslib.entities.OriginalDataElements originalDataElements) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.TransactionType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.TransactionType getTransactionType() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getAmount() {
        return 0L;
    }
    
    public final void setAmount(long p0) {
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getOtherAmount() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.utils.IsoAccountType component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.utils.IsoAccountType getAccountType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRRN() {
        return null;
    }
    
    public final void setRRN(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSTAN() {
        return null;
    }
    
    public final void setSTAN(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.danbamitale.epmslib.entities.AdditionalTransParams component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.danbamitale.epmslib.entities.AdditionalTransParams getAdditionalTransParams() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEchoData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.danbamitale.epmslib.entities.OriginalDataElements component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.danbamitale.epmslib.entities.OriginalDataElements getOriginalDataElements() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.isw.iswclient.request.IswParameters getIswParameters() {
        return null;
    }
    
    public final void setIswParameters(@org.jetbrains.annotations.Nullable()
    com.isw.iswclient.request.IswParameters p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.isw.iswclient.request.ProcessingProperties getProcessingProperties() {
        return null;
    }
    
    public final void setProcessingProperties(@org.jetbrains.annotations.Nullable()
    com.isw.iswclient.request.ProcessingProperties p0) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public TransactionRequestData(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public TransactionRequestData(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, long amount) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public TransactionRequestData(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, long amount, long otherAmount) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public TransactionRequestData(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, long amount, long otherAmount, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.utils.IsoAccountType accountType) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public TransactionRequestData(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, long amount, long otherAmount, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.utils.IsoAccountType accountType, @org.jetbrains.annotations.Nullable()
    java.lang.String RRN) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public TransactionRequestData(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, long amount, long otherAmount, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.utils.IsoAccountType accountType, @org.jetbrains.annotations.Nullable()
    java.lang.String RRN, @org.jetbrains.annotations.Nullable()
    java.lang.String STAN) {
        super();
    }
    
    public TransactionRequestData(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType transactionType, long amount, long otherAmount, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.utils.IsoAccountType accountType, @org.jetbrains.annotations.Nullable()
    com.danbamitale.epmslib.entities.OriginalDataElements originalDataElements) {
        super();
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.danbamitale.epmslib.entities.TransactionRequestData> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.danbamitale.epmslib.entities.TransactionRequestData createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.danbamitale.epmslib.entities.TransactionRequestData[] newArray(int size) {
            return null;
        }
    }
}