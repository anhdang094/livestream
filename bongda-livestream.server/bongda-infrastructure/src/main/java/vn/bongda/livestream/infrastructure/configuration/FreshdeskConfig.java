package vn.bongda.livestream.infrastructure.configuration;

import java.io.Serializable;

public class FreshdeskConfig extends ApiConfig implements Serializable {

  private String ticketUrl;
  private String contactUrl;
  private String uploadCommentUrl;
  private String rateUrl;
  private String ticketFieldsUrl;

  public FreshdeskConfig() {
  }

  public FreshdeskConfig(String url, String hashKey, int connectionTimeout, int socketTimeout, boolean useProxy,
      ProxyConfig proxyConfig, String ticketUrl, String contactUrl, String uploadCommentUrl, String rateUrl, String ticketFieldsUrl) {
    super(url, hashKey, connectionTimeout, socketTimeout, useProxy, proxyConfig);
    this.ticketUrl = ticketUrl;
    this.contactUrl = contactUrl;
    this.uploadCommentUrl = uploadCommentUrl;
    this.rateUrl = rateUrl;
    this.ticketFieldsUrl = ticketFieldsUrl;
  }

  public String getTicketUrl() {
    return ticketUrl;
  }

  public void setTicketUrl(String ticketUrl) {
    this.ticketUrl = ticketUrl;
  }

  public String getContactUrl() {
    return contactUrl;
  }

  public void setContactUrl(String contactUrl) {
    this.contactUrl = contactUrl;
  }

  public String getUploadCommentUrl() {
    return uploadCommentUrl;
  }

  public void setUploadCommentUrl(String uploadCommentUrl) {
    this.uploadCommentUrl = uploadCommentUrl;
  }

  public String getRateUrl() {
    return rateUrl;
  }

  public void setRateUrl(String rateUrl) {
    this.rateUrl = rateUrl;
  }

  public String getTicketFieldsUrl() {
    return ticketFieldsUrl;
  }

  public void setTicketFieldsUrl(String ticketFieldsUrl) {
    this.ticketFieldsUrl = ticketFieldsUrl;
  }
}