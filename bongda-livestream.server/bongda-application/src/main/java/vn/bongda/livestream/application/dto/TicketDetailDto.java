package vn.bongda.livestream.application.dto;

import java.util.List;

public class TicketDetailDto {

  private int id;
  private int status;
  private String title;
  private String transDescription;
  private long transAmount;
  private long transTime;
  private String transIcon;
  private String description;
  private String userPhone;
  private String ticketPhone;
  private long transID;
  private String service;
  private String userName;
  private String source;
  private String request;
  private boolean rated;
  private boolean readed;
  private List<String> images;
  private List<CommentDto> comments;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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

  public String getTransIcon() {
    return transIcon;
  }

  public void setTransIcon(String transIcon) {
    this.transIcon = transIcon;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public List<CommentDto> getComments() {
    return comments;
  }

  public void setComments(List<CommentDto> comments) {
    this.comments = comments;
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

  public long getTransID() {
    return transID;
  }

  public void setTransID(long transID) {
    this.transID = transID;
  }

  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
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

  public boolean isRated() {
    return rated;
  }

  public void setRated(boolean rated) {
    this.rated = rated;
  }

  public boolean isReaded() {
    return readed;
  }

  public void setReaded(boolean readed) {
    this.readed = readed;
  }
}
