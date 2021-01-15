package vn.bongda.livestream.domain.enumeration;

import java.util.HashMap;

public enum TicketStatus {

  NEW(0),
  REOPEN(1),
  CLOSE(2);

  private static final HashMap<Integer, TicketStatus> statusMap = new HashMap<>();

  static {
    for (TicketStatus status : TicketStatus.values()) {
      statusMap.put(status.code, status);
    }
  }

  private final int code;

  private TicketStatus(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public static TicketStatus fromValue(int value) {
    return statusMap.get(value);
  }

}
