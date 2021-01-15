package vn.bongda.livestream.infrastructure.response.freshdesk;

public class TicketFieldResponse {

  private boolean withType;
  private boolean withGroup;
  private boolean withRequest;
  private boolean withSource;
  private boolean withPiority;
  private boolean withStatus;

  public boolean isWithType() {
    return withType;
  }

  public void setWithType(boolean withType) {
    this.withType = withType;
  }

  public boolean isWithGroup() {
    return withGroup;
  }

  public void setWithGroup(boolean withGroup) {
    this.withGroup = withGroup;
  }

  public boolean isWithRequest() {
    return withRequest;
  }

  public void setWithRequest(boolean withRequest) {
    this.withRequest = withRequest;
  }

  public boolean isWithSource() {
    return withSource;
  }

  public void setWithSource(boolean withSource) {
    this.withSource = withSource;
  }

  public boolean isWithPiority() {
    return withPiority;
  }

  public void setWithPiority(boolean withPiority) {
    this.withPiority = withPiority;
  }

  public boolean isWithStatus() {
    return withStatus;
  }

  public void setWithStatus(boolean withStatus) {
    this.withStatus = withStatus;
  }
}
