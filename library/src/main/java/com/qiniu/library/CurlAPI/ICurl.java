package com.qiniu.library.CurlAPI;

public interface ICurl {

    boolean isCancel();

    long globalInit();

    void request(final ICurlRequest request,
                 final ICurlConfiguration curlConfiguration,
                 final ICurlHandler curlHandler);

    void cancel();
}
