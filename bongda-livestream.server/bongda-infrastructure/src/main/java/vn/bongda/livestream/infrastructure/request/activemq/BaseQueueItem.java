package vn.bongda.livestream.infrastructure.request.activemq;

import java.io.Serializable;

public class BaseQueueItem implements Serializable {

  protected int queueCounter;
  protected String mailFrom;
  protected String mailTo;

  public int getQueueCounter() {
    return queueCounter;
  }

  public void setQueueCounter(int queueCounter) {
    this.queueCounter = queueCounter;
  }

  public String getMailFrom() {
    return mailFrom;
  }

  public void setMailFrom(String mailFrom) {
    this.mailFrom = mailFrom;
  }

  public String getMailTo() {
    return mailTo;
  }

  public void setMailTo(String mailTo) {
    this.mailTo = mailTo;
  }
}
