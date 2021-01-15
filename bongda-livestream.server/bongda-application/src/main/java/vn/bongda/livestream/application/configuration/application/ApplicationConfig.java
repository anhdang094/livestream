package vn.bongda.livestream.application.configuration.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import vn.bongda.livestream.application.configuration.base.AccessInfo;

@Configuration
@PropertySource(value = {"classpath:config.properties"})
public class ApplicationConfig {

  @Autowired
  private Environment env;

  @Bean
  AccessInfo getAccessInfo() {
    AccessInfo accessInfo = new AccessInfo();
    accessInfo.setServletPath(env.getProperty("server.servlet.path"));
    accessInfo.setApiKeys(env.getProperty("access.info.api-keys"));
    accessInfo.setEnv(env.getProperty("app.enviroment"));
    return accessInfo;
  }
}
