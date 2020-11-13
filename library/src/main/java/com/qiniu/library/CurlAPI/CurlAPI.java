package com.qiniu.library.CurlAPI;

public class CurlAPI {

    public static boolean isCurlLoad(){
        return (getCurlObject() != null) ||
                (getCurlConfigurationObject() != null) ||
                (getCurlConfigurationDnsResolverObject() != null) ||
                (getCurlConfigurationBuilderObject() != null) ||
                (getCurlRequestObject() != null);
    }

    public static ICurl getCurlObject(){
        ICurl curl = null;
        try {
            Class CurlClass = Class.forName("com.qiniu.library.CurlAPI.Curl");
            Object curlObject = CurlClass.newInstance();
            if (curlObject instanceof ICurl){
                curl = (ICurl)curlObject;
            }
        } catch (Exception ignore) {
        }
        return curl;
    }

    public static ICurlConfiguration getCurlConfigurationObject(){
        ICurlConfiguration curlConfiguration = null;
        try {
            Class CurlConfigurationClass = Class.forName("com.qiniu.library.CurlAPI.CurlConfiguration");
            Object curlConfigurationObject = CurlConfigurationClass.newInstance();
            if (curlConfigurationObject instanceof ICurlConfiguration){
                curlConfiguration = (ICurlConfiguration)curlConfigurationObject;
            }
        } catch (Exception ignore) {
        }
        return curlConfiguration;
    }

    public static ICurlConfiguration.IDnsResolver getCurlConfigurationDnsResolverObject(){
        ICurlConfiguration.IDnsResolver curlConfigurationDnsResolver = null;
        try {
            Class CurlConfigurationDnsResolverClass = Class.forName("com.qiniu.library.CurlAPI.CurlConfiguration");
            Object curlConfigurationDnsResolverObject = CurlConfigurationDnsResolverClass.newInstance();
            if (curlConfigurationDnsResolverObject instanceof ICurlConfiguration){
                curlConfigurationDnsResolver = (ICurlConfiguration.IDnsResolver)curlConfigurationDnsResolverObject;
            }
        } catch (Exception ignore) {
        }
        return curlConfigurationDnsResolver;
    }

    public static ICurlConfiguration.IBuilder getCurlConfigurationBuilderObject(){
        ICurlConfiguration.IBuilder  curlConfigurationBuilder = null;
        try {
            Class CurlConfigurationBuilderClass = Class.forName("com.qiniu.library.CurlAPI.CurlConfiguration");
            Object curlConfigurationBuilderObject = CurlConfigurationBuilderClass.newInstance();
            if (curlConfigurationBuilderObject instanceof ICurlConfiguration){
                curlConfigurationBuilder = (ICurlConfiguration.IBuilder)curlConfigurationBuilderObject;
            }
        } catch (Exception ignore) {
        }
        return curlConfigurationBuilder;
    }

    public static ICurlRequest getCurlRequestObject(){
        ICurlRequest curlRequest = null;
        try {
            Class CurlRequestClass = Class.forName("com.qiniu.library.CurlAPI.CurlRequest");
            Object curlRequestObject = CurlRequestClass.newInstance();
            if (curlRequestObject instanceof ICurlRequest){
                curlRequest = (ICurlRequest)curlRequestObject;
            }
        } catch (Exception ignore) {
        }
        return curlRequest;
    }
}
