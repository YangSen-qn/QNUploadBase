package com.qiniu.library.CurlAPI;

import android.util.Log;

public class CurlAPI {

    public static boolean isCurlLoad() {
        return (getCurlObject() != null) &&
                (getCurlConfigurationObject() != null) &&
                (getCurlConfigurationDnsResolverObject() != null) &&
                (getCurlConfigurationBuilderObject() != null) &&
                (getCurlRequestObject() != null);
    }

    public static ICurl getCurlObject() {
        ICurl curl = null;
        Object object = newInstance("com.qiniu.curl.Curl");
        if (object instanceof ICurl) {
            curl = (ICurl) object;
        }
        return curl;
    }

    public static ICurlConfiguration getCurlConfigurationObject() {
        ICurlConfiguration curlConfiguration = null;
        Object object = newInstance("com.qiniu.curl.CurlConfiguration");
        if (object instanceof ICurlConfiguration) {
            curlConfiguration = (ICurlConfiguration) object;
        }
        return curlConfiguration;
    }

    public static ICurlConfiguration.IDnsResolver getCurlConfigurationDnsResolverObject() {
        ICurlConfiguration.IDnsResolver curlConfigurationDnsResolver = null;
        Object object = newInstance("com.qiniu.curl.CurlConfiguration$DnsResolver");
        if (object instanceof ICurlConfiguration.IDnsResolver) {
            curlConfigurationDnsResolver = (ICurlConfiguration.IDnsResolver) object;
        }
        return curlConfigurationDnsResolver;
    }

    public static ICurlConfiguration.IBuilder getCurlConfigurationBuilderObject() {
        ICurlConfiguration.IBuilder curlConfigurationBuilder = null;
        Object object = newInstance("com.qiniu.curl.CurlConfiguration$Builder");
        if (object instanceof ICurlConfiguration.IBuilder) {
            curlConfigurationBuilder = (ICurlConfiguration.IBuilder) object;
        }
        return curlConfigurationBuilder;
    }

    public static ICurlRequest getCurlRequestObject() {
        ICurlRequest curlRequest = null;
        Object object = newInstance("com.qiniu.curl.CurlRequest");
        if (object instanceof ICurlRequest) {
            curlRequest = (ICurlRequest) object;
        }
        return curlRequest;
    }

    private static Object newInstance(String className) {
        Object object = null;
        try {
            Class ObjectClass = Class.forName(className);
            object = ObjectClass.newInstance();
        } catch (Exception ignore) {
            Log.d("============", className + "not find");
        }
        return object;
    }
}
