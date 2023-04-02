package com.danbamitale.epmslib.entities;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000b\u0010\u0006\u001a\u00070\u0007\u00a2\u0006\u0002\b\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\u000e\u0010\u0018\u001a\u00070\u0007\u00a2\u0006\u0002\b\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J6\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\r\b\u0002\u0010\u0006\u001a\u00070\u0007\u00a2\u0006\u0002\b\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u00070\u0007\u00a2\u0006\u0002\b\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006("}, d2 = {"Lcom/danbamitale/epmslib/entities/HostConfig;", "Landroid/os/Parcelable;", "terminalId", "", "connectionData", "Lcom/danbamitale/epmslib/entities/ConnectionData;", "keyHolder", "Lcom/danbamitale/epmslib/entities/KeyHolder;", "Lkotlinx/android/parcel/RawValue;", "configData", "Lcom/danbamitale/epmslib/entities/ConfigData;", "(Ljava/lang/String;Lcom/danbamitale/epmslib/entities/ConnectionData;Lcom/danbamitale/epmslib/entities/KeyHolder;Lcom/danbamitale/epmslib/entities/ConfigData;)V", "getConfigData", "()Lcom/danbamitale/epmslib/entities/ConfigData;", "getConnectionData", "()Lcom/danbamitale/epmslib/entities/ConnectionData;", "getKeyHolder", "()Lcom/danbamitale/epmslib/entities/KeyHolder;", "setKeyHolder", "(Lcom/danbamitale/epmslib/entities/KeyHolder;)V", "getTerminalId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "epmslib_debug"})
public final class HostConfig implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String terminalId = null;
    @org.jetbrains.annotations.NotNull()
    private final com.danbamitale.epmslib.entities.ConnectionData connectionData = null;
    @org.jetbrains.annotations.NotNull()
    private com.danbamitale.epmslib.entities.KeyHolder keyHolder;
    @org.jetbrains.annotations.NotNull()
    private final com.danbamitale.epmslib.entities.ConfigData configData = null;
    public static final android.os.Parcelable.Creator<com.danbamitale.epmslib.entities.HostConfig> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.HostConfig copy(@org.jetbrains.annotations.NotNull()
    java.lang.String terminalId, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.ConnectionData connectionData, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.KeyHolder keyHolder, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.ConfigData configData) {
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
    
    public HostConfig(@org.jetbrains.annotations.NotNull()
    java.lang.String terminalId, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.ConnectionData connectionData, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.KeyHolder keyHolder, @org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.ConfigData configData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTerminalId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.ConnectionData component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.ConnectionData getConnectionData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.KeyHolder component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.KeyHolder getKeyHolder() {
        return null;
    }
    
    public final void setKeyHolder(@org.jetbrains.annotations.NotNull()
    com.danbamitale.epmslib.entities.KeyHolder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.ConfigData component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.danbamitale.epmslib.entities.ConfigData getConfigData() {
        return null;
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
    public static final class Creator implements android.os.Parcelable.Creator<com.danbamitale.epmslib.entities.HostConfig> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.danbamitale.epmslib.entities.HostConfig createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.danbamitale.epmslib.entities.HostConfig[] newArray(int size) {
            return null;
        }
    }
}