package vn.bongda.livestream.infrastructure.request.freshdesk;

public class RatingRequest {

  private String feedback;
  private QuestionRating ratings;

  public String getFeedback() {
    return feedback;
  }

  public void setFeedback(String feedback) {
    this.feedback = feedback;
  }

  public QuestionRating getRatings() {
    return ratings;
  }

  public void setRatings(QuestionRating ratings) {
    this.ratings = ratings;
  }
}
