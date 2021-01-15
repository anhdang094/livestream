package vn.bongda.livestream.application.dto;

import java.time.LocalDateTime;
import java.util.List;

public class CommentDto {

  private int id;
  private boolean isZaloPay;
  private String author;
  private LocalDateTime createdDate;
  private String content;
  private List<String> images;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean isZaloPay() {
    return isZaloPay;
  }

  public void setZaloPay(boolean zaloPay) {
    isZaloPay = zaloPay;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public LocalDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }
}
