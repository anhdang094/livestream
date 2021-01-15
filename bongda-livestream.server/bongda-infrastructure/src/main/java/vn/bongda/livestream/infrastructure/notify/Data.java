package vn.bongda.livestream.infrastructure.notify;

public class Data {

  private String notificationtype;
  private String notificatinid;
  private String message;
  private String msg;
  private String messagecontent;
  private long timestamp;
  private EmbedData embeddata;

  public String getNotificationtype() {
    return notificationtype;
  }

  public void setNotificationtype(String notificationtype) {
    this.notificationtype = notificationtype;
  }

  public String getNotificatinid() {
    return notificatinid;
  }

  public void setNotificatinid(String notificatinid) {
    this.notificatinid = notificatinid;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getMessagecontent() {
    return messagecontent;
  }

  public void setMessagecontent(String messagecontent) {
    this.messagecontent = messagecontent;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  public EmbedData getEmbeddata() {
    return embeddata;
  }

  public void setEmbeddata(EmbedData embeddata) {
    this.embeddata = embeddata;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
