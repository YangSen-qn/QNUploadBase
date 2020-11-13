package com.qiniu.library.CurlAPI;

public interface ICurlHandler {

    void receiveResponse(ICurlResponse response);
    byte[] sendData(long dataLength);
    void receiveData(byte[] data);
    void completeWithError(int errorCode, String errorInfo);
    void sendProgress(long bytesSent, long totalBytesSent, long totalBytesExpectedToSend);
    void receiveProgress(long bytesReceive, long totalBytesReceive, long totalBytesExpectedToReceive);
    void didFinishCollectingMetrics(ICurlTransactionMetrics metrics);
}
