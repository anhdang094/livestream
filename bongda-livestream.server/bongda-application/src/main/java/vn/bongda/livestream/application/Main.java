package vn.bongda.livestream.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

/**
 * @author anhdx
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class,
    DataSourceTransactionManagerAutoConfiguration.class})
@PropertySource(value = {"classpath:config.properties"})
public class Main {

  private static Logger logger = LoggerFactory.getLogger(Main.class);

  private static ApplicationContext ctx;

  public static ApplicationContext getCtx() {
    return ctx;
  }

  public static void main(String[] args) {
    ctx = SpringApplication.run(Main.class, args);
  }
}
