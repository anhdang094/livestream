package vn.bongda.livestream.domain.enumeration;

import java.util.HashMap;

public enum CommentType {
  UNKNOW(0),
  ZALOPAY(1),
  USER(2);

  private static final HashMap<Integer, CommentType> typeMap = new HashMap<>();

  static {
    for (CommentType type : CommentType.values()) {
      typeMap.put(type.type, type);
    }
  }

  private final int type;

  private CommentType(int type) {
    this.type = type;
  }

  public int getType() {
    return type;
  }

  public static CommentType fromValue(int value) {
    return typeMap.get(value);
  }
}
