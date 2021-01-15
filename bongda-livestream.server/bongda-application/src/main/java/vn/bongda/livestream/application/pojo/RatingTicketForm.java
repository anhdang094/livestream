package vn.bongda.livestream.application.pojo;

import javax.validation.constraints.NotEmpty;
import vn.bongda.livestream.infrastructure.constants.ValidateMessage;

public class RatingTicketForm {

  @NotEmpty(message = ValidateMessage.REQUIRED)
  private String author;
  private String content;
  private int rate;

  public RatingTicketForm() {
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getRate() {
    return rate;
  }

  public void setRate(int rate) {
    this.rate = rate;
  }
}
