package vn.bongda.livestream.infrastructure.request.activemq;

import java.util.List;
import vn.bongda.livestream.infrastructure.configuration.FreshdeskConfig;

public class CommentQueueItem extends BaseQueueItem {

  private int ticketId;
  private FreshdeskConfig freshdeskConfig;
  private String userID;
  private List<String> images;
  private String description;
  private String phone;
  private int commentId;


  public int getTicketId() {
    return ticketId;
  }

  public void setTicketId(int ticketId) {
    this.ticketId = ticketId;
  }

  public FreshdeskConfig getFreshdeskConfig() {
    return freshdeskConfig;
  }

  public void setFreshdeskConfig(FreshdeskConfig freshdeskConfig) {
    this.freshdeskConfig = freshdeskConfig;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public int getCommentId() {
    return commentId;
  }

  public void setCommentId(int commentId) {
    this.commentId = commentId;
  }
}
