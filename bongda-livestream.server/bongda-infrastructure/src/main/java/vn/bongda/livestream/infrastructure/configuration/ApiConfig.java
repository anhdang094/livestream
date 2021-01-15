package vn.bongda.livestream.infrastructure.configuration;


import vn.bongda.livestream.infrastructure.utils.GsonUtils;

public class ApiConfig {

  protected String url;
  protected String hashKey;
  // Timeout for starting the TCP connection
  protected int connectionTimeout;
  // Timeout for incoming data flow;
  protected int socketTimeout;
  protected boolean useProxy;
  protected ProxyConfig proxyConfig;

  public ApiConfig() {}

  public ApiConfig(String url, String hashKey, int connectionTimeout, int socketTimeout,
      boolean useProxy, ProxyConfig proxyConfig) {
    this.url = url;
    this.hashKey = hashKey;
    this.connectionTimeout = connectionTimeout;
    this.socketTimeout = socketTimeout;
    this.useProxy = useProxy;
    this.proxyConfig = proxyConfig;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getHashKey() {
    return hashKey;
  }

  public void setHashKey(String hashKey) {
    this.hashKey = hashKey;
  }

  public int getConnectionTimeout() {
    return connectionTimeout;
  }

  public void setConnectionTimeout(int connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  public int getSocketTimeout() {
    return socketTimeout;
  }

  public void setSocketTimeout(int socketTimeout) {
    this.socketTimeout = socketTimeout;
  }

  public boolean isUseProxy() {
    return useProxy;
  }

  public void setUseProxy(boolean useProxy) {
    this.useProxy = useProxy;
  }

  public ProxyConfig getProxyConfig() {
    return proxyConfig;
  }

  public void setProxyConfig(ProxyConfig proxyConfig) {
    this.proxyConfig = proxyConfig;
  }

  public String toJsonString() {
    return GsonUtils.toJsonString(this);
  }

}
