package vn.bongda.livestream.domain.factory;

import java.time.LocalDateTime;
import vn.bongda.livestream.domain.model.Comment;
import vn.bongda.livestream.domain.enumeration.CommentType;

public final class CommentFactory {

  private CommentFactory() {
  }

  public static Comment generateComment(int ticketId, String author, CommentType type, String content) {
    Comment comment = new Comment();
    return comment;
  }

}
