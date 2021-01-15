package vn.bongda.livestream.application.dto.response;

public class DefaultResponse {

  private int returncode;
  private String returnmessage;
  private Object data;

  public DefaultResponse() {
  }

  public DefaultResponse(int returncode, String returnmessage) {
    this.returncode = returncode;
    this.returnmessage = returnmessage;
  }

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

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
