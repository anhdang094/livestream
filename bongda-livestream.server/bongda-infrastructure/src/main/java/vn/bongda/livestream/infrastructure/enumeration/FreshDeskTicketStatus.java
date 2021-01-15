package vn.bongda.livestream.infrastructure.enumeration;

import java.util.HashMap;

public enum FreshDeskTicketStatus {

  Open(2),
  Pending(3),
  Resolved(4),
  Closed(5);

  private static final HashMap<Integer, FreshDeskTicketStatus> statusMap = new HashMap<>();

  static {
    for (FreshDeskTicketStatus status : FreshDeskTicketStatus.values()) {
      statusMap.put(status.code, status);
    }
  }

  private final int code;

  private FreshDeskTicketStatus(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public static FreshDeskTicketStatus fromValue(int value) {
    return statusMap.get(value);
  }

}
