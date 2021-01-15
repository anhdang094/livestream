package vn.bongda.livestream.infrastructure.request.freshdesk;

public class CustomFieldRequest {

  private String customeFieldKey;
  private String serviceKey;
  private String sourceKey;
  private String requestKey;

  private String service;
  private String source;
  private String request;

  public String getCustomeFieldKey() {
    return customeFieldKey;
  }

  public void setCustomeFieldKey(String customeFieldKey) {
    this.customeFieldKey = customeFieldKey;
  }

  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }

  public String getServiceKey() {
    return serviceKey;
  }

  public void setServiceKey(String serviceKey) {
    this.serviceKey = serviceKey;
  }

  public String getSourceKey() {
    return sourceKey;
  }

  public void setSourceKey(String sourceKey) {
    this.sourceKey = sourceKey;
  }

  public String getRequestKey() {
    return requestKey;
  }

  public void setRequestKey(String requestKey) {
    this.requestKey = requestKey;
  }
}
