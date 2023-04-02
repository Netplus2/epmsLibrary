package com.isw.iswclient.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0003\b\u0092\u0001\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001e\u0010\'\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001e\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001e\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001e\u00100\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001e\u00103\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001e\u00106\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001e\u0010<\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001e\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001e\u0010B\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001e\u0010E\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001e\u0010H\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001e\u0010K\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001e\u0010N\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001e\u0010Q\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001e\u0010T\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001e\u0010W\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001e\u0010Z\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR\u001e\u0010]\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\bR \u0010`\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR \u0010c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR \u0010f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR \u0010i\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR\u001e\u0010l\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0015\"\u0004\bn\u0010\u0017R\u001e\u0010o\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR\u001e\u0010r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\bR\u001e\u0010u\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0006\"\u0004\bw\u0010\bR\u001e\u0010x\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u0006\"\u0004\bz\u0010\bR\u001e\u0010{\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u0006\"\u0004\b}\u0010\bR\u001f\u0010~\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\u0006\"\u0005\b\u0080\u0001\u0010\bR!\u0010\u0081\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0006\"\u0005\b\u0083\u0001\u0010\bR!\u0010\u0084\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010\u0006\"\u0005\b\u0086\u0001\u0010\bR!\u0010\u0087\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u0006\"\u0005\b\u0089\u0001\u0010\bR!\u0010\u008a\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010\u0006\"\u0005\b\u008c\u0001\u0010\bR!\u0010\u008d\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010\u0006\"\u0005\b\u008f\u0001\u0010\bR!\u0010\u0090\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010\u0006\"\u0005\b\u0092\u0001\u0010\bR!\u0010\u0093\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010\u0006\"\u0005\b\u0095\u0001\u0010\bR!\u0010\u0096\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010\u0006\"\u0005\b\u0098\u0001\u0010\bR!\u0010\u0099\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010\u0006\"\u0005\b\u009b\u0001\u0010\bR!\u0010\u009c\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010\u0006\"\u0005\b\u009e\u0001\u0010\bR!\u0010\u009f\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a0\u0001\u0010\u0006\"\u0005\b\u00a1\u0001\u0010\bR!\u0010\u00a2\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a3\u0001\u0010\u0006\"\u0005\b\u00a4\u0001\u0010\b\u00a8\u0006\u00a5\u0001"}, d2 = {"Lcom/isw/iswclient/request/TransferRequest;", "", "()V", "amountAuthorized", "", "getAmountAuthorized", "()Ljava/lang/String;", "setAmountAuthorized", "(Ljava/lang/String;)V", "amountOther", "getAmountOther", "setAmountOther", "applicationInterchangeProfile", "getApplicationInterchangeProfile", "setApplicationInterchangeProfile", "atc", "getAtc", "setAtc", "batteryInformation", "", "getBatteryInformation", "()I", "setBatteryInformation", "(I)V", "cardSequenceNumber", "getCardSequenceNumber", "setCardSequenceNumber", "cryptogram", "getCryptogram", "setCryptogram", "cryptogramInformationData", "getCryptogramInformationData", "setCryptogramInformationData", "currencyCode", "getCurrencyCode", "setCurrencyCode", "cvmResults", "getCvmResults", "setCvmResults", "dedicatedFileName", "getDedicatedFileName", "setDedicatedFileName", "destinationAccountNumber", "getDestinationAccountNumber", "setDestinationAccountNumber", "expiryMonth", "getExpiryMonth", "setExpiryMonth", "expiryYear", "getExpiryYear", "setExpiryYear", "extendedTransactionType", "getExtendedTransactionType", "setExtendedTransactionType", "fromAccount", "getFromAccount", "setFromAccount", "header", "getHeader", "setHeader", "iad", "getIad", "setIad", "keyLabel", "getKeyLabel", "setKeyLabel", "ksn", "getKsn", "setKsn", "ksnd", "getKsnd", "setKsnd", "languageInfo", "getLanguageInfo", "setLanguageInfo", "merchantId", "getMerchantId", "setMerchantId", "merchantLocation", "getMerchantLocation", "setMerchantLocation", "minorAmount", "getMinorAmount", "setMinorAmount", "originalTransmissionDate", "getOriginalTransmissionDate", "setOriginalTransmissionDate", "pan", "getPan", "setPan", "pinBlock", "getPinBlock", "setPinBlock", "pinType", "getPinType", "setPinType", "posConditionCode", "getPosConditionCode", "setPosConditionCode", "posDataCode", "getPosDataCode", "setPosDataCode", "posEntryMode", "getPosEntryMode", "setPosEntryMode", "posGeoCode", "getPosGeoCode", "setPosGeoCode", "printerStatus", "getPrinterStatus", "setPrinterStatus", "receivingInstitutionId", "getReceivingInstitutionId", "setReceivingInstitutionId", "rrn", "getRrn", "setRrn", "stan", "getStan", "setStan", "surcharge", "getSurcharge", "setSurcharge", "terminalCapabilities", "getTerminalCapabilities", "setTerminalCapabilities", "terminalCountryCode", "getTerminalCountryCode", "setTerminalCountryCode", "terminalId", "getTerminalId", "setTerminalId", "terminalType", "getTerminalType", "setTerminalType", "terminalType2", "getTerminalType2", "setTerminalType2", "terminalVerficationResult", "getTerminalVerficationResult", "setTerminalVerficationResult", "toAccount", "getToAccount", "setToAccount", "track2", "getTrack2", "setTrack2", "transactionCurrencyCode", "getTransactionCurrencyCode", "setTransactionCurrencyCode", "transactionType", "getTransactionType", "setTransactionType", "transationDate", "getTransationDate", "setTransationDate", "transmissionDate", "getTransmissionDate", "setTransmissionDate", "uniqueId", "getUniqueId", "setUniqueId", "unpredictableNumber", "getUnpredictableNumber", "setUnpredictableNumber", "epmslib_debug"})
@org.simpleframework.xml.Root(strict = false, name = "transferRequest")
public final class TransferRequest {
    @org.simpleframework.xml.Element(name = "batteryInformation", required = false)
    @org.simpleframework.xml.Path(value = "terminalInformation")
    private int batteryInformation = 0;
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "currencyCode", required = false)
    @org.simpleframework.xml.Path(value = "terminalInformation")
    private java.lang.String currencyCode = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "languageInfo", required = false)
    @org.simpleframework.xml.Path(value = "terminalInformation")
    private java.lang.String languageInfo = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "merchantId", required = false)
    @org.simpleframework.xml.Path(value = "terminalInformation")
    private java.lang.String merchantId = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "merhcantLocation")
    @org.simpleframework.xml.Path(value = "terminalInformation")
    private java.lang.String merchantLocation = "";
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Element(name = "posConditionCode")
    @org.simpleframework.xml.Path(value = "terminalInformation")
    private java.lang.String posConditionCode;
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Element(name = "posDataCode")
    @org.simpleframework.xml.Path(value = "terminalInformation")
    private java.lang.String posDataCode;
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Element(name = "posEntryMode")
    @org.simpleframework.xml.Path(value = "terminalInformation")
    private java.lang.String posEntryMode;
    @org.jetbrains.annotations.Nullable()
    @org.simpleframework.xml.Element(name = "posGeoCode")
    @org.simpleframework.xml.Path(value = "terminalInformation")
    private java.lang.String posGeoCode;
    @org.simpleframework.xml.Element(name = "printerStatus")
    @org.simpleframework.xml.Path(value = "terminalInformation")
    private int printerStatus = 0;
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "terminalId")
    @org.simpleframework.xml.Path(value = "terminalInformation")
    private java.lang.String terminalId = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "terminalType")
    @org.simpleframework.xml.Path(value = "terminalInformation")
    private java.lang.String terminalType = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "transmissionDate")
    @org.simpleframework.xml.Path(value = "terminalInformation")
    private java.lang.String transmissionDate = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "uniqueId")
    @org.simpleframework.xml.Path(value = "terminalInformation")
    private java.lang.String uniqueId = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "cardSequenceNumber")
    @org.simpleframework.xml.Path(value = "cardData")
    private java.lang.String cardSequenceNumber = "0";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "AmountAuthorized")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String amountAuthorized = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "AmountOther")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String amountOther = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "ApplicationInterchangeProfile")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String applicationInterchangeProfile = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "atc")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String atc = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "Cryptogram")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String cryptogram = "";
    @org.simpleframework.xml.Element(name = "CryptogramInformationData")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private int cryptogramInformationData = 0;
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "CvmResults")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String cvmResults = "0";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "iad")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String iad = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "TransactionCurrencyCode")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String transactionCurrencyCode = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "TerminalVerificationResult")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String terminalVerficationResult = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "TerminalCountryCode")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String terminalCountryCode = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "TerminalType")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String terminalType2 = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "TerminalCapabilities")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String terminalCapabilities = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "TransactionDate")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String transationDate = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "TransactionType")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String transactionType = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "UnpredictableNumber")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String unpredictableNumber = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "DedicatedFileName")
    @org.simpleframework.xml.Path(value = "cardData/emvData")
    private java.lang.String dedicatedFileName = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "pan")
    @org.simpleframework.xml.Path(value = "cardData/track2")
    private java.lang.String pan = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "expiryMonth")
    @org.simpleframework.xml.Path(value = "cardData/track2")
    private java.lang.String expiryMonth = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "expiryYear")
    @org.simpleframework.xml.Path(value = "cardData/track2")
    private java.lang.String expiryYear = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "track2")
    @org.simpleframework.xml.Path(value = "cardData/track2")
    private java.lang.String track2 = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "originalTransmissionDateTime")
    private java.lang.String originalTransmissionDate = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "stan")
    private java.lang.String stan = "0";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "retrievalReferenceNumber")
    private java.lang.String rrn = "0";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "fromAccount")
    private java.lang.String fromAccount = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "toAccount")
    private java.lang.String toAccount = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "minorAmount")
    private java.lang.String minorAmount = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "receivingInstitutionId")
    private java.lang.String receivingInstitutionId = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "surcharge")
    private java.lang.String surcharge = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "ksnd")
    @org.simpleframework.xml.Path(value = "pinData")
    private java.lang.String ksnd = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "ksn")
    @org.simpleframework.xml.Path(value = "pinData")
    private java.lang.String ksn = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "pinType")
    @org.simpleframework.xml.Path(value = "pinData")
    private java.lang.String pinType = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "pinBlock")
    @org.simpleframework.xml.Path(value = "pinData")
    private java.lang.String pinBlock = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "keyLabel")
    private java.lang.String keyLabel = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "destinationAccountNumber")
    private java.lang.String destinationAccountNumber = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String header = "";
    @org.jetbrains.annotations.NotNull()
    @org.simpleframework.xml.Element(name = "extendedTransactionType")
    private java.lang.String extendedTransactionType = "";
    
    public TransferRequest() {
        super();
    }
    
    public final int getBatteryInformation() {
        return 0;
    }
    
    public final void setBatteryInformation(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrencyCode() {
        return null;
    }
    
    public final void setCurrencyCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguageInfo() {
        return null;
    }
    
    public final void setLanguageInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMerchantId() {
        return null;
    }
    
    public final void setMerchantId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMerchantLocation() {
        return null;
    }
    
    public final void setMerchantLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosConditionCode() {
        return null;
    }
    
    public final void setPosConditionCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosDataCode() {
        return null;
    }
    
    public final void setPosDataCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosEntryMode() {
        return null;
    }
    
    public final void setPosEntryMode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosGeoCode() {
        return null;
    }
    
    public final void setPosGeoCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getPrinterStatus() {
        return 0;
    }
    
    public final void setPrinterStatus(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTerminalId() {
        return null;
    }
    
    public final void setTerminalId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTerminalType() {
        return null;
    }
    
    public final void setTerminalType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransmissionDate() {
        return null;
    }
    
    public final void setTransmissionDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUniqueId() {
        return null;
    }
    
    public final void setUniqueId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardSequenceNumber() {
        return null;
    }
    
    public final void setCardSequenceNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAmountAuthorized() {
        return null;
    }
    
    public final void setAmountAuthorized(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAmountOther() {
        return null;
    }
    
    public final void setAmountOther(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApplicationInterchangeProfile() {
        return null;
    }
    
    public final void setApplicationInterchangeProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAtc() {
        return null;
    }
    
    public final void setAtc(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCryptogram() {
        return null;
    }
    
    public final void setCryptogram(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCryptogramInformationData() {
        return 0;
    }
    
    public final void setCryptogramInformationData(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCvmResults() {
        return null;
    }
    
    public final void setCvmResults(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIad() {
        return null;
    }
    
    public final void setIad(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransactionCurrencyCode() {
        return null;
    }
    
    public final void setTransactionCurrencyCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTerminalVerficationResult() {
        return null;
    }
    
    public final void setTerminalVerficationResult(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTerminalCountryCode() {
        return null;
    }
    
    public final void setTerminalCountryCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTerminalType2() {
        return null;
    }
    
    public final void setTerminalType2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTerminalCapabilities() {
        return null;
    }
    
    public final void setTerminalCapabilities(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransationDate() {
        return null;
    }
    
    public final void setTransationDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransactionType() {
        return null;
    }
    
    public final void setTransactionType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUnpredictableNumber() {
        return null;
    }
    
    public final void setUnpredictableNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDedicatedFileName() {
        return null;
    }
    
    public final void setDedicatedFileName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPan() {
        return null;
    }
    
    public final void setPan(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExpiryMonth() {
        return null;
    }
    
    public final void setExpiryMonth(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExpiryYear() {
        return null;
    }
    
    public final void setExpiryYear(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTrack2() {
        return null;
    }
    
    public final void setTrack2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalTransmissionDate() {
        return null;
    }
    
    public final void setOriginalTransmissionDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStan() {
        return null;
    }
    
    public final void setStan(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRrn() {
        return null;
    }
    
    public final void setRrn(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromAccount() {
        return null;
    }
    
    public final void setFromAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToAccount() {
        return null;
    }
    
    public final void setToAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMinorAmount() {
        return null;
    }
    
    public final void setMinorAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReceivingInstitutionId() {
        return null;
    }
    
    public final void setReceivingInstitutionId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSurcharge() {
        return null;
    }
    
    public final void setSurcharge(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKsnd() {
        return null;
    }
    
    public final void setKsnd(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKsn() {
        return null;
    }
    
    public final void setKsn(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPinType() {
        return null;
    }
    
    public final void setPinType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPinBlock() {
        return null;
    }
    
    public final void setPinBlock(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyLabel() {
        return null;
    }
    
    public final void setKeyLabel(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDestinationAccountNumber() {
        return null;
    }
    
    public final void setDestinationAccountNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeader() {
        return null;
    }
    
    public final void setHeader(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExtendedTransactionType() {
        return null;
    }
    
    public final void setExtendedTransactionType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}