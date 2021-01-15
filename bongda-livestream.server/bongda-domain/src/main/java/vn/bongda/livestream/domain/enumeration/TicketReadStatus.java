package vn.bongda.livestream.domain.enumeration;

import java.util.HashMap;

public enum TicketReadStatus {

  UNREAD(0),
  READED(1);

  private static final HashMap<Integer, TicketReadStatus> statusMap = new HashMap<>();

  static {
    for (TicketReadStatus status : TicketReadStatus.values()) {
      statusMap.put(status.code, status);
    }
  }

  private final int code;

  private TicketReadStatus(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public static TicketReadStatus fromValue(int value) {
    return statusMap.get(value);
  }

}
