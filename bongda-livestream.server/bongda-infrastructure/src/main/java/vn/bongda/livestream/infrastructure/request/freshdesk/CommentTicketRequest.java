package vn.bongda.livestream.infrastructure.request.freshdesk;

public class CommentTicketRequest {

  private String body;
  private long user_id;

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public long getUser_id() {
    return user_id;
  }

  public void setUser_id(long user_id) {
    this.user_id = user_id;
  }
}
