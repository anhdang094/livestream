package vn.bongda.livestream.application.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import vn.bongda.livestream.application.configuration.base.AccessInfo;

@Component
public class AuthenticationFilter implements Filter {

  private static Logger logger = LoggerFactory.getLogger(AuthenticationFilter.class);

  private AccessInfo accessInfo;

  public AuthenticationFilter(AccessInfo accessInfo) {
    this.accessInfo = accessInfo;
  }

  @Override
  public void destroy() {
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {

    HttpServletRequest req = (HttpServletRequest) request;
    String requestURI = req.getRequestURI();
    String servletPath = "/".equals(accessInfo.getServletPath()) ? "" : accessInfo.getServletPath();
    String apiKey = req.getHeader("apiKey");
    if (requestURI.equals(servletPath + "/swagger-ui.html") || requestURI
        .startsWith(servletPath + "/webjars/")
        || requestURI.equals(servletPath + "/configuration/ui") || requestURI
        .equals(servletPath + "/swagger-resources")
        || requestURI.equals(servletPath + "/v2/api-docs") || requestURI
        .equals(servletPath + "/configuration/security")) {
      chain.doFilter(req, response);
    } else if (apiKey != null && !apiKey.isEmpty() && accessInfo.getApiKeys().contains(apiKey)) {
      chain.doFilter(req, response);
    } else {
      HttpServletResponse resp = (HttpServletResponse) response;
      resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
      return;
    }
  }

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
  }

}
