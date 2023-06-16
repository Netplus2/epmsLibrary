package com.danbamitale.epmslib.entities;

import java.lang.System;

/**
 * @param ipAddress
 * @param ipPort
 * @param isSSL
 * @param certFile
 */
@androidx.room.Entity()
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\t\u0010 \u001a\u00020\tH\u00c6\u0003J1\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006-"}, d2 = {"Lcom/danbamitale/epmslib/entities/ConnectionData;", "Landroid/os/Parcelable;", "ipAddress", "", "ipPort", "", "isSSL", "", "certFile", "Ljava/io/File;", "(Ljava/lang/String;IZLjava/io/File;)V", "getCertFile", "()Ljava/io/File;", "setCertFile", "(Ljava/io/File;)V", "id", "getId", "()I", "setId", "(I)V", "getIpAddress", "()Ljava/lang/String;", "setIpAddress", "(Ljava/lang/String;)V", "getIpPort", "setIpPort", "()Z", "setSSL", "(Z)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "epmslib_release"})
public final class ConnectionData implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String ipAddress;
    private int ipPort;
    private boolean isSSL;
    @org.jetbrains.annotations.NotNull()
    private java.io.File certFile;
    @androidx.room.PrimaryKey()
    private int id = 1;
    public static final android.os.Parcelable.Creator<com.danbamitale.epmslib.entities.ConnectionData> CREATOR = null;
    
    /**
     * @param ipAddress
     * @param ipPort
     * @param isSSL
     * @param certFile
     */
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.ConnectionData copy(@org.jetbrains.annotations.NotNull()
    java.lang.String ipAddress, int ipPort, boolean isSSL, @org.jetbrains.annotations.NotNull()
    java.io.File certFile) {
        return null;
    }
    
    /**
     * @param ipAddress
     * @param ipPort
     * @param isSSL
     * @param certFile
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * @param ipAddress
     * @param ipPort
     * @param isSSL
     * @param certFile
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param ipAddress
     * @param ipPort
     * @param isSSL
     * @param certFile
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ConnectionData() {
        super();
    }
    
    public ConnectionData(@org.jetbrains.annotations.NotNull()
    java.lang.String ipAddress, int ipPort, boolean isSSL, @org.jetbrains.annotations.NotNull()
    java.io.File certFile) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIpAddress() {
        return null;
    }
    
    public final void setIpAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getIpPort() {
        return 0;
    }
    
    public final void setIpPort(int p0) {
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean isSSL() {
        return false;
    }
    
    public final void setSSL(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getCertFile() {
        return null;
    }
    
    public final void setCertFile(@org.jetbrains.annotations.NotNull()
    java.io.File p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.danbamitale.epmslib.entities.ConnectionData> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.danbamitale.epmslib.entities.ConnectionData createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.danbamitale.epmslib.entities.ConnectionData[] newArray(int size) {
            return null;
        }
    }
}