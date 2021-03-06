package com.rowan.interceptor;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器
 * @author zhangHao
 * @date 2019-07-19 16:08
 */
@Component
@CommonsLog
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("\n登录拦截器开始");
        String token = request.getHeader("token");
        //CookieUtils
        log.info("token:" + token);
        return true;
    }
}
