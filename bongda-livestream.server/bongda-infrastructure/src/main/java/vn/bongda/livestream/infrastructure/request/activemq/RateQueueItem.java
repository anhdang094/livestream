package vn.bongda.livestream.infrastructure.request.activemq;

import vn.bongda.livestream.infrastructure.configuration.FreshdeskConfig;

public class RateQueueItem extends BaseQueueItem {

  private int ticketId;
  private FreshdeskConfig freshdeskConfig;
  private String feedback;
  private int rate;
  private int rateId;

  public int getTicketId() {
    return ticketId;
  }

  public void setTicketId(int ticketId) {
    this.ticketId = ticketId;
  }

  public FreshdeskConfig getFreshdeskConfig() {
    return freshdeskConfig;
  }

  public void setFreshdeskConfig(FreshdeskConfig freshdeskConfig) {
    this.freshdeskConfig = freshdeskConfig;
  }

  public String getFeedback() {
    return feedback;
  }

  public void setFeedback(String feedback) {
    this.feedback = feedback;
  }

  public int getRate() {
    return rate;
  }

  public void setRate(int rate) {
    this.rate = rate;
  }

  public int getRateId() {
    return rateId;
  }

  public void setRateId(int rateId) {
    this.rateId = rateId;
  }
}
