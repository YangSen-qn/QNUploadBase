package com.qiniu.library.CurlAPI;

import java.util.Map;

public interface ICurlRequest {

    void init(String urlString, int httpMethod, Map<String, String> allHeaders, byte[] httpBody, int timeout);

    String getUrlString();

    int getHttpMethod();

    Map<String, String> getAllHeaders();
    String[] getAllHeaderList();

    int getTimeout();

    byte[] getHttpBody();
}
