package com.danbamitale.epmslib.entities;

import java.lang.System;

/**
 * @property originalTransactionType
 * @property originalAmount
 * @property originalAuthorizationCode
 * @property originalTransmissionTime
 * @property originalSTAN
 * @property originalRRN
 * @property originalAcquiringInstCode
 * @property originalForwardingInstCode
 */
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0010J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\t\u0010-\u001a\u00020\rH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003Jq\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0005H\u00c6\u0001J\t\u00100\u001a\u000201H\u00d6\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u00d6\u0003J\t\u00106\u001a\u000201H\u00d6\u0001J\t\u00107\u001a\u00020\u0007H\u00d6\u0001J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000201H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006="}, d2 = {"Lcom/danbamitale/epmslib/entities/OriginalDataElements;", "Landroid/os/Parcelable;", "originalTransactionType", "Lcom/danbamitale/epmslib/entities/TransactionType;", "originalAmount", "", "originalAuthorizationCode", "", "originalTransmissionTime", "originalSTAN", "originalRRN", "originalAcquiringInstCode", "reversalReasonCode", "Lcom/danbamitale/epmslib/utils/MessageReasonCode;", "originalForwardingInstCode", "originalInterSwitchThreshold", "(Lcom/danbamitale/epmslib/entities/TransactionType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/danbamitale/epmslib/utils/MessageReasonCode;Ljava/lang/String;J)V", "getOriginalAcquiringInstCode", "()Ljava/lang/String;", "getOriginalAmount", "()J", "getOriginalAuthorizationCode", "getOriginalForwardingInstCode", "setOriginalForwardingInstCode", "(Ljava/lang/String;)V", "getOriginalInterSwitchThreshold", "setOriginalInterSwitchThreshold", "(J)V", "getOriginalRRN", "getOriginalSTAN", "getOriginalTransactionType", "()Lcom/danbamitale/epmslib/entities/TransactionType;", "getOriginalTransmissionTime", "getReversalReasonCode", "()Lcom/danbamitale/epmslib/utils/MessageReasonCode;", "setReversalReasonCode", "(Lcom/danbamitale/epmslib/utils/MessageReasonCode;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "epmslib_release"})
public final class OriginalDataElements implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final com.danbamitale.epmslib.entities.TransactionType originalTransactionType = null;
    private final long originalAmount = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String originalAuthorizationCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String originalTransmissionTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String originalSTAN = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String originalRRN = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String originalAcquiringInstCode = null;
    @org.jetbrains.annotations.NotNull()
    private com.danbamitale.epmslib.utils.MessageReasonCode reversalReasonCode;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String originalForwardingInstCode;
    private long originalInterSwitchThreshold;
    public static final android.os.Parcelable.Creator<com.danbamitale.epmslib.entities.OriginalDataElements> CREATOR = null;
    
    /**
     * @property originalTransactionType
     * @property originalAmount
     * @property originalAuthorizationCode
     * @property originalTransmissionTime
     * @property originalSTAN
     * @property originalRRN
     * @property originalAcquiringInstCode
     * @property originalForwardingInstCode
     */
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.OriginalDataElements copy(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType originalTransactionType, long originalAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String originalAuthorizationCode, @org.jetbrains.annotations.NotNull()
    java.lang.String originalTransmissionTime, @org.jetbrains.annotations.NotNull()
    java.lang.String originalSTAN, @org.jetbrains.annotations.NotNull()
    java.lang.String originalRRN, @org.jetbrains.annotations.NotNull()
    java.lang.String originalAcquiringInstCode, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.utils.MessageReasonCode reversalReasonCode, @org.jetbrains.annotations.Nullable()
    java.lang.String originalForwardingInstCode, long originalInterSwitchThreshold) {
        return null;
    }
    
    /**
     * @property originalTransactionType
     * @property originalAmount
     * @property originalAuthorizationCode
     * @property originalTransmissionTime
     * @property originalSTAN
     * @property originalRRN
     * @property originalAcquiringInstCode
     * @property originalForwardingInstCode
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * @property originalTransactionType
     * @property originalAmount
     * @property originalAuthorizationCode
     * @property originalTransmissionTime
     * @property originalSTAN
     * @property originalRRN
     * @property originalAcquiringInstCode
     * @property originalForwardingInstCode
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @property originalTransactionType
     * @property originalAmount
     * @property originalAuthorizationCode
     * @property originalTransmissionTime
     * @property originalSTAN
     * @property originalRRN
     * @property originalAcquiringInstCode
     * @property originalForwardingInstCode
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public OriginalDataElements(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.TransactionType originalTransactionType, long originalAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String originalAuthorizationCode, @org.jetbrains.annotations.NotNull()
    java.lang.String originalTransmissionTime, @org.jetbrains.annotations.NotNull()
    java.lang.String originalSTAN, @org.jetbrains.annotations.NotNull()
    java.lang.String originalRRN, @org.jetbrains.annotations.NotNull()
    java.lang.String originalAcquiringInstCode, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.utils.MessageReasonCode reversalReasonCode, @org.jetbrains.annotations.Nullable()
    java.lang.String originalForwardingInstCode, long originalInterSwitchThreshold) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.TransactionType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.TransactionType getOriginalTransactionType() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getOriginalAmount() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalAuthorizationCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalTransmissionTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalSTAN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalRRN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalAcquiringInstCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.utils.MessageReasonCode component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.utils.MessageReasonCode getReversalReasonCode() {
        return null;
    }
    
    public final void setReversalReasonCode(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.utils.MessageReasonCode p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalForwardingInstCode() {
        return null;
    }
    
    public final void setOriginalForwardingInstCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long component10() {
        return 0L;
    }
    
    public final long getOriginalInterSwitchThreshold() {
        return 0L;
    }
    
    public final void setOriginalInterSwitchThreshold(long p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.danbamitale.epmslib.entities.OriginalDataElements> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.danbamitale.epmslib.entities.OriginalDataElements createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.danbamitale.epmslib.entities.OriginalDataElements[] newArray(int size) {
            return null;
        }
    }
}