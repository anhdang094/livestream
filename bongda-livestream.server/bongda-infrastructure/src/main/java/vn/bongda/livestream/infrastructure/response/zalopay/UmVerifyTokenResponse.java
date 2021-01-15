package vn.bongda.livestream.infrastructure.response.zalopay;

public class UmVerifyTokenResponse {

  private int returncode;
  private String returnmessage;
  private int profilelevel;
  private String displayname;
  private String accesstoken;

  private long phonenumber = 0L;
  private int usertype = 1;
  private String deviceID = "";
  private int frontendID = 0;

  public int getReturncode() {
    return returncode;
  }

  public void setReturncode(int returncode) {
    this.returncode = returncode;
  }

  public String getReturnmessage() {
    return returnmessage;
  }

  public void setReturnmessage(String returnmessage) {
    this.returnmessage = returnmessage;
  }

  public int getProfilelevel() {
    return profilelevel;
  }

  public void setProfilelevel(int profilelevel) {
    this.profilelevel = profilelevel;
  }

  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public String getAccesstoken() {
    return accesstoken;
  }

  public void setAccesstoken(String accesstoken) {
    this.accesstoken = accesstoken;
  }

  public long getPhonenumber() {
    return phonenumber;
  }

  public void setPhonenumber(long phonenumber) {
    this.phonenumber = phonenumber;
  }

  public int getUsertype() {
    return usertype;
  }

  public void setUsertype(int usertype) {
    this.usertype = usertype;
  }

  public String getDeviceID() {
    return deviceID;
  }

  public void setDeviceID(String deviceID) {
    this.deviceID = deviceID;
  }

  public int getFrontendID() {
    return frontendID;
  }

  public void setFrontendID(int frontendID) {
    this.frontendID = frontendID;
  }
}
