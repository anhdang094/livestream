package vn.bongda.livestream.infrastructure.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import vn.bongda.livestream.infrastructure.response.freshdesk.CommentResponse;

public class FreshDeskCommentParser {

  public static CommentResponse commentParser(String commentText) {
    CommentResponse result = new CommentResponse();
    String comment = commentText.contains(":") ? commentText.substring(commentText.indexOf(":") + 1) : commentText;
    comment = comment.replaceAll("<br>", "\\\\n");
    if (comment.contains("Attachments")) {
      int index = comment.lastIndexOf("Attachments");
      String content = comment.substring(0, index);
      String url = comment.substring(index);
      result.setContent(Jsoup.parse(content).text());
      Pattern p = Pattern.compile("href=\'(.*?)\'");
      Matcher m = p.matcher(url);
      List<String> urls = new ArrayList<>();
      while (m.find()) {
        urls.add(m.group(1));
      }
      result.setImageUrls(urls);
    } else {
      result.setContent(Jsoup.parse(comment).text());
      result.setImageUrls(new ArrayList<>());
    }
    return result;
  }
}
