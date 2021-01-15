package vn.bongda.livestream.infrastructure.response.freshdesk;

public class RatingResponse {

  private String id;
  private String user_id;
  private int ticket_id;
  private String created_at;
  private String updated_at;

  public RatingResponse() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUser_id() {
    return user_id;
  }

  public void setUser_id(String user_id) {
    this.user_id = user_id;
  }

  public int getTicket_id() {
    return ticket_id;
  }

  public void setTicket_id(int ticket_id) {
    this.ticket_id = ticket_id;
  }

  public String getCreated_at() {
    return created_at;
  }

  public void setCreated_at(String created_at) {
    this.created_at = created_at;
  }

  public String getUpdated_at() {
    return updated_at;
  }

  public void setUpdated_at(String updated_at) {
    this.updated_at = updated_at;
  }
}
