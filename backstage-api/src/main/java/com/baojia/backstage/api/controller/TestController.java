/*
package com.baojia.backstage.api.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baojia.backstage.common.bean.ResponseResult;
import com.baojia.backstage.common.constant.ResultEnum;
import com.baojia.backstage.domain.po.SmsRecord;
import com.baojia.backstage.service.ISmsRecordService;
import com.baojia.backstage.service.TestService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

*/
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: amber
 * Date: 2018-05-09
 * Time: 10:23
 *//*

@RestController
@Api("测试")
public class TestController {

   */
/* private Logger logger = Logger.getLogger(TestController.class);*//*


    @Autowired
    private RedisTemplate redisTemplate;

    @Reference(version = "1.0.0")
    private TestService testService;

    @Reference(version = "1.0.0")
    private ISmsRecordService iSmsRecordService;

    @RequestMapping("/test")
    public ResponseResult test(){
        //Object sms_dead_time = redisTemplate.opsForValue().get("SMS_DEAD_TIME");
        //System.out.println(sms_dead_time);
        */
/*logger.info("info信息输出,backstage");
        logger.error("error信息输出,backstage");
        String time = testService.getTime();*//*


        SmsRecord smsRecord = new SmsRecord();
        smsRecord.setCreateTime(new Date());
        smsRecord.setMessage("哈哈哈");
        smsRecord.setChannelId(1L);
        smsRecord.setChannelResult("0000");
        smsRecord.setMobilePhone("12345678902");
        smsRecord.setSendStatus(1);
        smsRecord.setSendTime(new Date());
        int i = iSmsRecordService.saveSmsRecord(smsRecord);
        return new ResponseResult(ResultEnum.SUCCESS,i);
    }

    @ApiOperation(value="用户登录", notes="根据用户名密码登录")
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(@RequestParam String name, HttpServletResponse response)
            throws ServletException {
        // if (name == null || !userDb.containsKey(name)) {
        if (name == null ) {
            throw new ServletException("Invalid login");
        }
        Map<String,String> data = new HashMap<String,String>();

        String token = Jwts.builder().setSubject(name)
                //.claim("roles", userDb.get(name)).setIssuedAt(new Date())
                .claim("roles", name).setIssuedAt(new Date())
                //.setExpiration(new Date(System.currentTimeMillis()+30 * 60 * 1000))
                .signWith(SignatureAlgorithm.HS256, "secretkey").compact();
        data.put("code","200");
        data.put("message",token);
        response.setHeader("Authorization","Bearer "+token);
        //加密生成token
        return data.toString();
    }
}
*/
