package vn.bongda.livestream.infrastructure.request.activemq;

import vn.bongda.livestream.infrastructure.configuration.FreshdeskConfig;

public class GenericTicketQueueItem extends BaseQueueItem {

  protected FreshdeskConfig freshdeskConfig;
  protected int ticketId;

  public FreshdeskConfig getFreshdeskConfig() {
    return freshdeskConfig;
  }

  public void setFreshdeskConfig(FreshdeskConfig freshdeskConfig) {
    this.freshdeskConfig = freshdeskConfig;
  }

  public int getTicketId() {
    return ticketId;
  }

  public void setTicketId(int ticketId) {
    this.ticketId = ticketId;
  }
}
