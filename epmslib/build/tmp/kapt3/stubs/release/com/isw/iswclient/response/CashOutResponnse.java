package com.isw.iswclient.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0010H\u00c6\u0003J\t\u00106\u001a\u00020\u0010H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0007H\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\fH\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\u0081\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u00c6\u0001J\u0013\u0010@\u001a\u00020\u00102\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010B\u001a\u00020\fH\u00d6\u0001J\t\u0010C\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100\u00a8\u0006D"}, d2 = {"Lcom/isw/iswclient/response/CashOutResponnse;", "", "description", "", "field39", "authId", "amountAuthorized", "", "AmountOther", "atc", "iad", "rc", "", "referenceNumber", "transactionChannelName", "wasReceived", "", "wasSent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZ)V", "getAmountOther", "()J", "setAmountOther", "(J)V", "getAmountAuthorized", "setAmountAuthorized", "getAtc", "()Ljava/lang/String;", "setAtc", "(Ljava/lang/String;)V", "getAuthId", "setAuthId", "getDescription", "setDescription", "getField39", "setField39", "getIad", "setIad", "getRc", "()I", "setRc", "(I)V", "getReferenceNumber", "setReferenceNumber", "getTransactionChannelName", "setTransactionChannelName", "getWasReceived", "()Z", "setWasReceived", "(Z)V", "getWasSent", "setWasSent", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "epmslib_release"})
@org.simpleframework.xml.Root(strict = false, name = "transferResponse")
public final class CashOutResponnse {
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "description")
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "field39")
    private java.lang.String field39;
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "authId", required = false)
    private java.lang.String authId;
    @org.simpleframework.xml.Element(name = "AmountAuthorized", required = false)
    @org.simpleframework.xml.Path(value = "hostEmvData")
    private long amountAuthorized;
    @org.simpleframework.xml.Element(name = "AmountOther", required = false)
    @org.simpleframework.xml.Path(value = "hostEmvData")
    private long AmountOther;
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "atc", required = false)
    @org.simpleframework.xml.Path(value = "hostEmvData")
    private java.lang.String atc;
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "iad", required = false)
    @org.simpleframework.xml.Path(value = "hostEmvData")
    private java.lang.String iad;
    @org.simpleframework.xml.Element(name = "rc", required = false)
    @org.simpleframework.xml.Path(value = "hostEmvData")
    private int rc;
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "referenceNumber", required = false)
    private java.lang.String referenceNumber;
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "transactionChannelName", required = false)
    private java.lang.String transactionChannelName;
    @org.simpleframework.xml.Element(name = "wasReceived", required = false)
    private boolean wasReceived;
    @org.simpleframework.xml.Element(name = "wasSent", required = false)
    private boolean wasSent;
    
    @org.jetbrains.annotations.NotNull()
    public final com.isw.iswclient.response.CashOutResponnse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String field39, @org.jetbrains.annotations.NotNull()
    java.lang.String authId, long amountAuthorized, long AmountOther, @org.jetbrains.annotations.NotNull()
    java.lang.String atc, @org.jetbrains.annotations.NotNull()
    java.lang.String iad, int rc, @org.jetbrains.annotations.NotNull()
    java.lang.String referenceNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionChannelName, boolean wasReceived, boolean wasSent) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmOverloads()
    public CashOutResponnse() {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public CashOutResponnse(@org.jetbrains.annotations.NotNull()
    java.lang.String description) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public CashOutResponnse(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String field39) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public CashOutResponnse(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String field39, @org.jetbrains.annotations.NotNull()
    java.lang.String authId) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public CashOutResponnse(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String field39, @org.jetbrains.annotations.NotNull()
    java.lang.String authId, long amountAuthorized) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public CashOutResponnse(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String field39, @org.jetbrains.annotations.NotNull()
    java.lang.String authId, long amountAuthorized, long AmountOther) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public CashOutResponnse(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String field39, @org.jetbrains.annotations.NotNull()
    java.lang.String authId, long amountAuthorized, long AmountOther, @org.jetbrains.annotations.NotNull()
    java.lang.String atc) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public CashOutResponnse(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String field39, @org.jetbrains.annotations.NotNull()
    java.lang.String authId, long amountAuthorized, long AmountOther, @org.jetbrains.annotations.NotNull()
    java.lang.String atc, @org.jetbrains.annotations.NotNull()
    java.lang.String iad) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public CashOutResponnse(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String field39, @org.jetbrains.annotations.NotNull()
    java.lang.String authId, long amountAuthorized, long AmountOther, @org.jetbrains.annotations.NotNull()
    java.lang.String atc, @org.jetbrains.annotations.NotNull()
    java.lang.String iad, int rc) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public CashOutResponnse(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String field39, @org.jetbrains.annotations.NotNull()
    java.lang.String authId, long amountAuthorized, long AmountOther, @org.jetbrains.annotations.NotNull()
    java.lang.String atc, @org.jetbrains.annotations.NotNull()
    java.lang.String iad, int rc, @org.jetbrains.annotations.NotNull()
    java.lang.String referenceNumber) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public CashOutResponnse(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String field39, @org.jetbrains.annotations.NotNull()
    java.lang.String authId, long amountAuthorized, long AmountOther, @org.jetbrains.annotations.NotNull()
    java.lang.String atc, @org.jetbrains.annotations.NotNull()
    java.lang.String iad, int rc, @org.jetbrains.annotations.NotNull()
    java.lang.String referenceNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionChannelName) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public CashOutResponnse(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String field39, @org.jetbrains.annotations.NotNull()
    java.lang.String authId, long amountAuthorized, long AmountOther, @org.jetbrains.annotations.NotNull()
    java.lang.String atc, @org.jetbrains.annotations.NotNull()
    java.lang.String iad, int rc, @org.jetbrains.annotations.NotNull()
    java.lang.String referenceNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionChannelName, boolean wasReceived) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public CashOutResponnse(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String field39, @org.jetbrains.annotations.NotNull()
    java.lang.String authId, long amountAuthorized, long AmountOther, @org.jetbrains.annotations.NotNull()
    java.lang.String atc, @org.jetbrains.annotations.NotNull()
    java.lang.String iad, int rc, @org.jetbrains.annotations.NotNull()
    java.lang.String referenceNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionChannelName, boolean wasReceived, boolean wasSent) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getField39() {
        return null;
    }
    
    public final void setField39(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthId() {
        return null;
    }
    
    public final void setAuthId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getAmountAuthorized() {
        return 0L;
    }
    
    public final void setAmountAuthorized(long p0) {
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getAmountOther() {
        return 0L;
    }
    
    public final void setAmountOther(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAtc() {
        return null;
    }
    
    public final void setAtc(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIad() {
        return null;
    }
    
    public final void setIad(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getRc() {
        return 0;
    }
    
    public final void setRc(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReferenceNumber() {
        return null;
    }
    
    public final void setReferenceNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransactionChannelName() {
        return null;
    }
    
    public final void setTransactionChannelName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean getWasReceived() {
        return false;
    }
    
    public final void setWasReceived(boolean p0) {
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean getWasSent() {
        return false;
    }
    
    public final void setWasSent(boolean p0) {
    }
}