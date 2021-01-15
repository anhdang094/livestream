package vn.bongda.livestream.domain.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.data.annotation.CreatedDate;
import vn.bongda.livestream.domain.annotation.DomainEntity;

@DomainEntity
@Entity
@Table(name = "Comment")
public class Comment extends GenericEntity {

  @Column(name = "author")
  private String author;

  @Column(name = "matchId")
  private int matchId;

  @Column(name = "message")
  private String message;

  @Column(name = "createdAt")
  @CreatedDate
  private LocalDateTime createdAt;

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getMatchId() {
    return matchId;
  }

  public void setMatchId(int matchId) {
    this.matchId = matchId;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }
}
