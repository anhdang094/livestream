package vn.bongda.livestream.infrastructure.configuration;

public class UMVerifyConfig extends ApiConfig {

  public UMVerifyConfig(String url, String hashKey, int connectionTimeout, int socketTimeout,
      boolean useProxy, ProxyConfig proxyConfig) {
    super(url, hashKey, connectionTimeout, socketTimeout, useProxy, proxyConfig);
  }
}