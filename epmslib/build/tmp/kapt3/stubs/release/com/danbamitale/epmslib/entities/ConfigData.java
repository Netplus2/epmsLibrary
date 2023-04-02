package com.danbamitale.epmslib.entities;

import java.lang.System;

@androidx.room.Entity()
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 92\u00020\u0001:\u00019BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003JY\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\t\u0010-\u001a\u00020\u001bH\u00d6\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u00d6\u0003J\t\u00102\u001a\u00020\u001bH\u00d6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u001bH\u00d6\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u000f\u00a8\u0006:"}, d2 = {"Lcom/danbamitale/epmslib/entities/ConfigData;", "Landroid/os/Parcelable;", "epmsDateTime", "", "cardAcceptorIdCode", "hostTimeOut", "currencyCode", "countryCode", "callHomeTime", "merchantNameLocation", "merchantCategoryCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCallHomeTime", "()Ljava/lang/String;", "setCallHomeTime", "(Ljava/lang/String;)V", "getCardAcceptorIdCode", "setCardAcceptorIdCode", "getCountryCode", "setCountryCode", "getCurrencyCode", "setCurrencyCode", "getEpmsDateTime", "setEpmsDateTime", "getHostTimeOut", "setHostTimeOut", "id", "", "getId", "()I", "setId", "(I)V", "getMerchantCategoryCode", "setMerchantCategoryCode", "getMerchantNameLocation", "setMerchantNameLocation", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "epmslib_release"})
public final class ConfigData implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String epmsDateTime;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cardAcceptorIdCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String hostTimeOut;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currencyCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String countryCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String callHomeTime;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String merchantNameLocation;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String merchantCategoryCode;
    @androidx.room.PrimaryKey()
    private int id = 1;
    @org.jetbrains.annotations.NotNull()
    public static final com.danbamitale.epmslib.entities.ConfigData.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private static final java.lang.String TAG_LEN_EPMS_DATE_TIME = "02014";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private static final java.lang.String TAG_LEN_CARD_ACCEPTOR_ID_CODE = "03015";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private static final java.lang.String TAG_LEN_TIMEOUT = "04002";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private static final java.lang.String TAG_LEN_CURRENCY_CODE = "05003";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private static final java.lang.String TAG_LEN_COUNTRY_CODE = "06003";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private static final java.lang.String TAG_LEN_CALL_HOME_TIME = "07002";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private static final java.lang.String TAG_LEN_MERCHANT_NAME_LOCATION = "52040";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private static final java.lang.String TAG_LEN_MERCHANT_CATEGORY_CODE = "08004";
    public static final android.os.Parcelable.Creator<com.danbamitale.epmslib.entities.ConfigData> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.ConfigData copy(@org.jetbrains.annotations.NotNull()
    java.lang.String epmsDateTime, @org.jetbrains.annotations.NotNull()
    java.lang.String cardAcceptorIdCode, @org.jetbrains.annotations.NotNull()
    java.lang.String hostTimeOut, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    java.lang.String callHomeTime, @org.jetbrains.annotations.NotNull()
    java.lang.String merchantNameLocation, @org.jetbrains.annotations.NotNull()
    java.lang.String merchantCategoryCode) {
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
    
    public ConfigData() {
        super();
    }
    
    public ConfigData(@org.jetbrains.annotations.NotNull()
    java.lang.String epmsDateTime, @org.jetbrains.annotations.NotNull()
    java.lang.String cardAcceptorIdCode, @org.jetbrains.annotations.NotNull()
    java.lang.String hostTimeOut, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    java.lang.String callHomeTime, @org.jetbrains.annotations.NotNull()
    java.lang.String merchantNameLocation, @org.jetbrains.annotations.NotNull()
    java.lang.String merchantCategoryCode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEpmsDateTime() {
        return null;
    }
    
    public final void setEpmsDateTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardAcceptorIdCode() {
        return null;
    }
    
    public final void setCardAcceptorIdCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHostTimeOut() {
        return null;
    }
    
    public final void setHostTimeOut(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrencyCode() {
        return null;
    }
    
    public final void setCurrencyCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountryCode() {
        return null;
    }
    
    public final void setCountryCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCallHomeTime() {
        return null;
    }
    
    public final void setCallHomeTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMerchantNameLocation() {
        return null;
    }
    
    public final void setMerchantNameLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMerchantCategoryCode() {
        return null;
    }
    
    public final void setMerchantCategoryCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.danbamitale.epmslib.entities.ConfigData> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.danbamitale.epmslib.entities.ConfigData createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.danbamitale.epmslib.entities.ConfigData[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/danbamitale/epmslib/entities/ConfigData$Companion;", "", "()V", "TAG_LEN_CALL_HOME_TIME", "", "getTAG_LEN_CALL_HOME_TIME", "()Ljava/lang/String;", "TAG_LEN_CARD_ACCEPTOR_ID_CODE", "getTAG_LEN_CARD_ACCEPTOR_ID_CODE", "TAG_LEN_COUNTRY_CODE", "getTAG_LEN_COUNTRY_CODE", "TAG_LEN_CURRENCY_CODE", "getTAG_LEN_CURRENCY_CODE", "TAG_LEN_EPMS_DATE_TIME", "getTAG_LEN_EPMS_DATE_TIME", "TAG_LEN_MERCHANT_CATEGORY_CODE", "getTAG_LEN_MERCHANT_CATEGORY_CODE", "TAG_LEN_MERCHANT_NAME_LOCATION", "getTAG_LEN_MERCHANT_NAME_LOCATION", "TAG_LEN_TIMEOUT", "getTAG_LEN_TIMEOUT", "epmslib_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG_LEN_EPMS_DATE_TIME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG_LEN_CARD_ACCEPTOR_ID_CODE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG_LEN_TIMEOUT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG_LEN_CURRENCY_CODE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG_LEN_COUNTRY_CODE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG_LEN_CALL_HOME_TIME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG_LEN_MERCHANT_NAME_LOCATION() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG_LEN_MERCHANT_CATEGORY_CODE() {
            return null;
        }
    }
}