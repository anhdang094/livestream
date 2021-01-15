package vn.bongda.livestream.infrastructure.request.freshdesk;

public class QuestionRating {

  private long default_question;

  public QuestionRating(long default_question) {
    this.default_question = default_question;
  }

  public long getDefault_question() {
    return default_question;
  }

  public void setDefault_question(long default_question) {
    this.default_question = default_question;
  }
}
