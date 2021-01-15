package vn.bongda.livestream.infrastructure.builder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import vn.bongda.livestream.infrastructure.configuration.FreshdeskConfig;
import vn.bongda.livestream.infrastructure.configuration.TicketConfig;
import vn.bongda.livestream.infrastructure.constants.CommonConstants;
import vn.bongda.livestream.infrastructure.request.activemq.RateQueueItem;
import vn.bongda.livestream.infrastructure.utils.GsonUtils;
import vn.bongda.livestream.infrastructure.notify.Data;
import vn.bongda.livestream.infrastructure.notify.EmbedData;
import vn.bongda.livestream.infrastructure.notify.NotifyInappTicket;
import vn.bongda.livestream.infrastructure.request.activemq.CommentQueueItem;
import vn.bongda.livestream.infrastructure.request.activemq.CreateTicketQueueItem;
import vn.bongda.livestream.infrastructure.request.mail.Mail;

public class CommonBuilder {

  public static List<NameValuePair> buildNameValuePair(Map<String, String> data) {
    List<NameValuePair> results = new ArrayList<>();
    for (Map.Entry<String, String> entry : data.entrySet()) {
      results.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
    }
    return results;
  }

  public static List<NameValuePair> buildNameValuePair(Object data) throws IOException {
    String json = GsonUtils.toJsonString(data);
    ObjectMapper mapper = new ObjectMapper();
    // convert JSON string to Map
    return buildNameValuePair(mapper.readValue(json, new TypeReference<Map<String, String>>() {
    }));
  }

  public static Map<String, String> buildMapValue(Object data) throws IOException {
    String json = GsonUtils.toJsonString(data);
    ObjectMapper mapper = new ObjectMapper();
    // convert JSON string to Map
    return mapper.readValue(json, new TypeReference<Map<String, String>>() {
    });
  }

  public static CreateTicketQueueItem buildCreateTicketQueueItem(TicketConfig ticketConfig, String title, long transID, String userName,
      String description, String userPhone, String ticketPhone, FreshdeskConfig freshdeskConfig, String userID, List<String> images, String request, String source,
      String service, int ticketId, String email, String mailFrom, String mailTo) {
    CreateTicketQueueItem item = new CreateTicketQueueItem();
    item.setTicketConfig(ticketConfig);
    item.setTitle(title);
    item.setTransID(transID);
    item.setUserName(userName);
    item.setDescription(description);
    item.setUserPhone(userPhone);
    item.setTicketPhone(ticketPhone);
    item.setFreshdeskConfig(freshdeskConfig);
    item.setUserID(userID);
    item.setImages(images);
    item.setRequest(request);
    item.setService(service);
    item.setSource(source);
    item.setTicketId(ticketId);
    item.setEmail(email);
    item.setQueueCounter(1);
    item.setMailFrom(mailFrom);
    item.setMailTo(mailTo);
    return item;
  }

  public static CommentQueueItem buildCommentQueueItem(int ticketId, FreshdeskConfig freshdeskConfig, String userID, List<String> images,
      String description, String phone, int commentID) {
    CommentQueueItem item = new CommentQueueItem();
    item.setTicketId(ticketId);
    item.setFreshdeskConfig(freshdeskConfig);
    item.setUserID(userID);
    item.setImages(images);
    item.setDescription(description);
    item.setPhone(phone);
    item.setCommentId(commentID);
    return item;
  }

  public static RateQueueItem buildRateQueueItem(int ticketId, FreshdeskConfig freshdeskConfig, String content, int rate, int rateId) {
    RateQueueItem item = new RateQueueItem();
    item.setTicketId(ticketId);
    item.setFreshdeskConfig(freshdeskConfig);
    item.setFeedback(content);
    item.setRate(rate);
    item.setRateId(rateId);
    return item;
  }

  public static NotifyInappTicket buildNotifyContent(String userID, String notifyType, int ticketId, String ticketTitle,
      long systemId, String key) {
    NotifyInappTicket notify = new NotifyInappTicket();
    notify.setUserID(Long.valueOf(userID));
    EmbedData embeddata = new EmbedData();
    embeddata.setTicketId(ticketId);
    embeddata.setNotificationType(notifyType);
    Data data = new Data();
    data.setNotificationtype(notifyType);
    data.setMessage(String.format(CommonConstants.NOTIFY_MESSAGE, ticketTitle));
    data.setMsg(String.format(CommonConstants.NOTIFY_MESSAGE, ticketTitle));
    data.setMessagecontent(String.format(CommonConstants.NOTIFY_MESSAGE, ticketTitle));
    data.setTimestamp(System.currentTimeMillis());
    data.setEmbeddata(embeddata);
    notify.setData(data);
    notify.setEmbedData(embeddata);
    notify.setTitle(String.format(CommonConstants.NOTIFY_MESSAGE, ticketTitle));
    notify.setSystemId(systemId);
    notify.setKey(key);
    return notify;
  }

  public static Mail buildMail(String from, String to, String subject, String content) {
    Mail mail = new Mail();
    mail.setFrom(from);
    mail.setTo(to);
    mail.setContent(content);
    mail.setSubject(subject);
    return mail;
  }

}
