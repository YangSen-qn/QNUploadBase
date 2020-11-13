package com.qiniu.library.CurlAPI;

public interface ICurlTransactionMetrics {
    long getCountOfRequestHeaderBytesSent();
    long getCountOfRequestBodyBytesSent();
    long getCountOfResponseHeaderBytesReceived();
    long getCountOfResponseBodyBytesReceived();
    String getLocalAddress();
    long getLocalPort();
    String getRemoteAddress();
    long getRemotePort();
    long getStartTimestamp();
    long getNameLookupTime();
    long getConnectTime();
    long getAppConnectTime();
    long getPreTransferTime();
    long getStartTransferTime();
    long getTotalTime();
    long getRedirectTime();
}
