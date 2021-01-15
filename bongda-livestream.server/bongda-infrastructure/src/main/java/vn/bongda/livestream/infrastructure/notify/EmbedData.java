package vn.bongda.livestream.infrastructure.notify;

public class EmbedData {

  private int ticketId;
  private String notificationType;

  public int getTicketId() {
    return ticketId;
  }

  public void setTicketId(int ticketId) {
    this.ticketId = ticketId;
  }

  public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }
}
