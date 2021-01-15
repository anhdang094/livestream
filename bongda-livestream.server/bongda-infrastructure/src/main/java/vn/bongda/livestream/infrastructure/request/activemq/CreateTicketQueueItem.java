package vn.bongda.livestream.infrastructure.request.activemq;

import java.util.List;
import vn.bongda.livestream.infrastructure.configuration.TicketConfig;

public class CreateTicketQueueItem extends GenericTicketQueueItem {

  private TicketConfig ticketConfig;
  private String title;
  private long transID;
  private String userName;
  private String description;
  private String userPhone;
  private String ticketPhone;
  private String userID;
  private List<String> images;
  private String request;
  private String source;
  private String service;
  private String email;

  public TicketConfig getTicketConfig() {
    return ticketConfig;
  }

  public void setTicketConfig(TicketConfig ticketConfig) {
    this.ticketConfig = ticketConfig;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public long getTransID() {
    return transID;
  }

  public void setTransID(long transID) {
    this.transID = transID;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }

  public String getTicketPhone() {
    return ticketPhone;
  }

  public void setTicketPhone(String ticketPhone) {
    this.ticketPhone = ticketPhone;
  }

  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }

  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
