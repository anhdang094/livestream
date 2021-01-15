package vn.bongda.livestream.application.dto.request;

public class DefaultRequest {

  private int ticketId;

  public DefaultRequest() {
  }

  public DefaultRequest(int ticketId) {
    this.ticketId = ticketId;
  }

  public int getTicketId() {
    return ticketId;
  }

  public void setTicketId(int ticketId) {
    this.ticketId = ticketId;
  }
}
