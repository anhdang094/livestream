package vn.bongda.livestream.application.configuration.base;

public class ApplicationInfo {

  private String address;
  private String apiKey;
  private int appTransferCash;

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public int getAppTransferCash() {
    return appTransferCash;
  }

  public void setAppTransferCash(int appTransferCash) {
    this.appTransferCash = appTransferCash;
  }
}
