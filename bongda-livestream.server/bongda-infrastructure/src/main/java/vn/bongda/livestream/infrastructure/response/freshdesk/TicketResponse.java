package vn.bongda.livestream.infrastructure.response.freshdesk;

import java.util.List;

public class TicketResponse {

  private List<String> cc_emails;
  private List<String> fwd_emails;
  private List<String> reply_cc_emails;
  private String email_config_id;
  private String group_id;
  private String priority;
  private String requester_id;
  private String responder_id;
  private String source;
  private int id;

  public TicketResponse() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<String> getCc_emails() {
    return cc_emails;
  }

  public void setCc_emails(List<String> cc_emails) {
    this.cc_emails = cc_emails;
  }

  public List<String> getFwd_emails() {
    return fwd_emails;
  }

  public void setFwd_emails(List<String> fwd_emails) {
    this.fwd_emails = fwd_emails;
  }

  public List<String> getReply_cc_emails() {
    return reply_cc_emails;
  }

  public void setReply_cc_emails(List<String> reply_cc_emails) {
    this.reply_cc_emails = reply_cc_emails;
  }

  public String getEmail_config_id() {
    return email_config_id;
  }

  public void setEmail_config_id(String email_config_id) {
    this.email_config_id = email_config_id;
  }

  public String getGroup_id() {
    return group_id;
  }

  public void setGroup_id(String group_id) {
    this.group_id = group_id;
  }

  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public String getRequester_id() {
    return requester_id;
  }

  public void setRequester_id(String requester_id) {
    this.requester_id = requester_id;
  }

  public String getResponder_id() {
    return responder_id;
  }

  public void setResponder_id(String responder_id) {
    this.responder_id = responder_id;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }
}
