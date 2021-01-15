package vn.bongda.livestream.application.configuration.application;

import vn.bongda.livestream.application.Main;
import vn.bongda.livestream.application.configuration.base.ApplicationInfo;
import vn.bongda.livestream.application.configuration.base.NotifyInfo;
import vn.bongda.livestream.infrastructure.configuration.ApiConfig;
import vn.bongda.livestream.infrastructure.configuration.FreshdeskConfig;
import vn.bongda.livestream.infrastructure.configuration.TicketConfig;
import vn.bongda.livestream.infrastructure.configuration.UMVerifyConfig;
import vn.bongda.livestream.infrastructure.request.mail.Mail;

public class BeanConfig {

  public static ApiConfig UM_VERIFY_USER = Main.getCtx().getBean(UMVerifyConfig.class);
  public static FreshdeskConfig FRESHDESK_CONFIG = Main.getCtx().getBean(FreshdeskConfig.class);
  public static TicketConfig TICKET_CONFIG = Main.getCtx().getBean(TicketConfig.class);
  public static ApplicationInfo APPLICATION_CONFIG = Main.getCtx().getBean(ApplicationInfo.class);
  public static NotifyInfo NOTIFY_INFO = Main.getCtx().getBean(NotifyInfo.class);
  public static Mail ALERT_MAIL = (Mail) Main.getCtx().getBean("alertMail");

}
