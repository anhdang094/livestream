package vn.bongda.livestream.domain.enumeration;

import java.util.HashMap;

public enum SubjectType {
  CREATE_TICKET(1),
  UPLOAD_COMMENT(2),
  UPLOAD_RATING(3);

  private static final HashMap<Integer, SubjectType> typeMap = new HashMap<>();

  static {
    for (SubjectType type : SubjectType.values()) {
      typeMap.put(type.type, type);
    }
  }

  private final int type;

  private SubjectType(int type) {
    this.type = type;
  }

  public int getType() {
    return type;
  }

  public static SubjectType fromValue(int value) {
    return typeMap.get(value);
  }
}
