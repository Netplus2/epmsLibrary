package com.isw.iswclient.iswapiclient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/isw/iswclient/iswapiclient/IswService;", "", "getToken", "Lio/reactivex/Single;", "Lcom/isw/iswclient/response/TokenPassportResponse;", "tokenPassportRequest", "Lcom/isw/iswclient/request/TokenPassportRequest;", "performTransaction", "Lcom/isw/iswclient/response/CashOutResponnse;", "token", "", "transferRequest", "Lcom/isw/iswclient/request/TransferRequest;", "epmslib_release"})
public abstract interface IswService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "kimonotms/requesttoken/perform-process")
    @retrofit2.http.Headers(value = {"content-type:application/xml"})
    public abstract io.reactivex.Single<com.isw.iswclient.response.TokenPassportResponse> getToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.isw.iswclient.request.TokenPassportRequest tokenPassportRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "amex")
    @retrofit2.http.Headers(value = {"content-type: application/xml", "Accept: application/xml"})
    public abstract io.reactivex.Single<com.isw.iswclient.response.CashOutResponnse> performTransaction(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.isw.iswclient.request.TransferRequest transferRequest);
}