package vn.bongda.livestream.domain.enumeration;

public enum ImageType {

  ROOT(0),
  COMMENT(1);

  private final int code;

  private ImageType(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }


}
