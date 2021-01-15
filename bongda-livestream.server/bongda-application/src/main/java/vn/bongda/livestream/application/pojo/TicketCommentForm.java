package vn.bongda.livestream.application.pojo;

import java.util.List;

public class TicketCommentForm {

  private String content;
  private String userPhone;
  private List<String> images;

  public TicketCommentForm() {
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }

  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }
}
