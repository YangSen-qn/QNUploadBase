package com.qiniu.library.CurlAPI;

public interface ICurlConfiguration {
    String[] getDnsResolverArray();
    String getProxy();
    String getProxyUserPwd();
    String getCAPath();

    void init(IBuilder builder);

    interface IDnsResolver {
        void init(String host, String ip, int port);
        String toString();
    }

    interface IBuilder {

        String[] getDnsResolverArray();
        String getProxy();
        String getProxyUserPwd();
        String getCaPath();

        IBuilder setDnsResolverArray(IDnsResolver[] dnsResolverArray);
        IBuilder setProxy(String proxy);
        IBuilder setProxyUserPwd(String proxyUserPwd);
        IBuilder setCaPath(String caPath);

        ICurlConfiguration build();
    }
}
