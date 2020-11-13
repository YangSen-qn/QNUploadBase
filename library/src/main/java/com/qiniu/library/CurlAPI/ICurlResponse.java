package com.qiniu.library.CurlAPI;

import java.util.Map;

public interface ICurlResponse {

    String getUrl();
    int getStatusCode();
    Map<String, String> getAllHeaderFields();
    String getMimeType();
    long getExpectedContentLength();
    String getHttpVersion();
}
