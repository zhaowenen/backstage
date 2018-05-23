package com.baojia.backstage.common.intercetpor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: amber
 * Date: 2018-05-17
 * Time: 10:51
 */
@Configuration
public class AppInterceptors extends WebMvcConfigurerAdapter {

    public static String REQUEST_TIME = "http_request_time";

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptorAdapter() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                                     Object handler) throws Exception {
                request.setAttribute(REQUEST_TIME, new Date());
                System.out.println("interceptor====1111111111111");
                return true;
            }
        }).addPathPatterns("/user/**", "/kafka/**");
    }
}
