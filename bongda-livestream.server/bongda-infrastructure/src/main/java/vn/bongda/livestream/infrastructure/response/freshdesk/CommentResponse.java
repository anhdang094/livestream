package vn.bongda.livestream.infrastructure.response.freshdesk;

import java.util.List;

public class CommentResponse {

  private String content;
  private List<String> imageUrls;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public List<String> getImageUrls() {
    return imageUrls;
  }

  public void setImageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
  }
}
