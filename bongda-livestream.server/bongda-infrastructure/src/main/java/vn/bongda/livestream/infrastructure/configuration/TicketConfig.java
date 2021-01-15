package vn.bongda.livestream.infrastructure.configuration;

import java.io.Serializable;

public class TicketConfig implements Serializable {

  private long groupId;
  private String type;
  private int piority;
  private int status;
  private String source;
  private String request;
  private String service;
  private String customField;

  public TicketConfig() {
  }

  public long getGroupId() {
    return groupId;
  }

  public void setGroupId(long groupId) {
    this.groupId = groupId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getPiority() {
    return piority;
  }

  public void setPiority(int piority) {
    this.piority = piority;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
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

  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public String getCustomField() {
    return customField;
  }

  public void setCustomField(String customField) {
    this.customField = customField;
  }
}
