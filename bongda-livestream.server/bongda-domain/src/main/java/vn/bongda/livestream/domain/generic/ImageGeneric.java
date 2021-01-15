package vn.bongda.livestream.domain.generic;

public class ImageGeneric {

  private String id;
  private int commentID;

  public ImageGeneric(String id, int commentID) {
    this.id = id;
    this.commentID = commentID;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getCommentID() {
    return commentID;
  }

  public void setCommentID(int commentID) {
    this.commentID = commentID;
  }
}
