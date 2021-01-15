package vn.bongda.livestream.infrastructure.notify;

public class NotifyInappTicket {

  private long userID;
  private Data data;
  private String title;
  private EmbedData embedData;
  private long systemId;
  private String key;

  public long getUserID() {
    return userID;
  }

  public void setUserID(long userID) {
    this.userID = userID;
  }

  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public EmbedData getEmbedData() {
    return embedData;
  }

  public void setEmbedData(EmbedData embedData) {
    this.embedData = embedData;
  }

  public long getSystemId() {
    return systemId;
  }

  public void setSystemId(long systemId) {
    this.systemId = systemId;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }
}
