package vn.bongda.livestream.application.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.bongda.livestream.application.dto.response.DefaultResponse;
import vn.bongda.livestream.infrastructure.enumeration.ErrorMessage;

public class AbstractController {

  protected static Logger LOGGER = LoggerFactory.getLogger(AbstractController.class);


  protected DefaultResponse buildSuccessResponse(Object data) {
    DefaultResponse response = new DefaultResponse();
    response.setReturncode(ErrorMessage.SUCCESS.getCode());
    response.setReturnmessage(ErrorMessage.SUCCESS.getMessage());
    response.setData(data);
    return response;
  }

  protected DefaultResponse buildInvalidResponse() {
    DefaultResponse response = new DefaultResponse();
    response.setReturncode(ErrorMessage.INVALID_PARAM.getCode());
    response.setReturnmessage(ErrorMessage.INVALID_PARAM.getMessage());
    return response;
  }

  protected DefaultResponse buildAccessFailResponse() {
    DefaultResponse response = new DefaultResponse();
    response.setReturncode(ErrorMessage.ACCESS_FAIL.getCode());
    response.setReturnmessage(ErrorMessage.ACCESS_FAIL.getMessage());
    return response;
  }

  protected DefaultResponse buildFailResponse() {
    DefaultResponse response = new DefaultResponse();
    response.setReturncode(ErrorMessage.FAIL.getCode());
    response.setReturnmessage(ErrorMessage.FAIL.getMessage());
    return response;
  }

  protected DefaultResponse buildNoContentResponse() {
    DefaultResponse response = new DefaultResponse();
    response.setReturncode(ErrorMessage.SUCCESS.getCode());
    response.setReturnmessage(ErrorMessage.SUCCESS.getMessage());
    response.setData(null);
    return response;
  }

}
