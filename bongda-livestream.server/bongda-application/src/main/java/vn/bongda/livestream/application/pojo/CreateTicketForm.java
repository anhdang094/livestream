package vn.bongda.livestream.application.pojo;

import java.util.List;
import javax.validation.constraints.NotEmpty;
import vn.bongda.livestream.infrastructure.constants.ValidateMessage;

public class CreateTicketForm {

  private long transID;
  @NotEmpty(message = ValidateMessage.REQUIRED)
  private String ticketPhone;
  @NotEmpty(message = ValidateMessage.REQUIRED)
  private String userPhone;
  @NotEmpty(message = ValidateMessage.REQUIRED)
  private String description;
  @NotEmpty(message = ValidateMessage.REQUIRED)
  private String title;
  @NotEmpty(message = ValidateMessage.REQUIRED)
  private String userName;
  private String email;
  private String service;
  private String source;
  private String request;
  private String transDescription;
  private long transAmount;
  private long transTime;
  private String transIcon;
  private List<String> images;

  public CreateTicketForm() {
  }

  public long getTransID() {
    return transID;
  }

  public void setTransID(long transID) {
    this.transID = transID;
  }

  public String getTicketPhone() {
    return ticketPhone;
  }

  public void setTicketPhone(String ticketPhone) {
    this.ticketPhone = ticketPhone;
  }

  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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

  public String getTransDescription() {
    return transDescription;
  }

  public void setTransDescription(String transDescription) {
    this.transDescription = transDescription;
  }

  public long getTransAmount() {
    return transAmount;
  }

  public void setTransAmount(long transAmount) {
    this.transAmount = transAmount;
  }

  public long getTransTime() {
    return transTime;
  }

  public void setTransTime(long transTime) {
    this.transTime = transTime;
  }

  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public String getTransIcon() {
    return transIcon;
  }

  public void setTransIcon(String transIcon) {
    this.transIcon = transIcon;
  }
}
