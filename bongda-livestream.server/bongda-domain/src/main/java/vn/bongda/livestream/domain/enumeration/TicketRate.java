package vn.bongda.livestream.domain.enumeration;

import java.util.HashMap;

public enum TicketRate {

  VERYHAPPY(3),
  HAPPY(2),
  UNHAPPY(1);

  private static final HashMap<Integer, TicketRate> statusMap = new HashMap<>();

  static {
    for (TicketRate status : TicketRate.values()) {
      statusMap.put(status.code, status);
    }
  }

  private final int code;

  private TicketRate(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public static TicketRate fromValue(int value) {
    return statusMap.get(value);
  }

}
