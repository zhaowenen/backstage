package com.baojia.backstage.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: amber
 * Date: 2018-05-09
 * Time: 10:22
 */
@RestController
public class SmsController {

    private static Logger logger = LoggerFactory.getLogger(SmsController.class);

    @RequestMapping(value = "/send/normalMsg", method = {RequestMethod.GET, RequestMethod.POST})
    public String sendNormalMsg(@RequestParam String version,
                                @RequestParam(required = false) String token,
                                @RequestParam(required = false) String planSendTime,
                                @RequestParam String messages,
                                HttpServletRequest request){
       logger.info("===========进入发送普通短信接口，请求参数是：version:"+version+",messages:"+messages);
        if (!"1.0".equals(version)){
            logger.error("=======版本号不匹配=======");
            return "";
        }

        return "";
    }

}
