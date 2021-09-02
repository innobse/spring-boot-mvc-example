package ru.bse71.learnup.spring.boot.mvc.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by bse71
 * Date: 02.09.2021
 * Time: 3:42
 */

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        final String user = request.getParameter("user");
        if (user == null) response.addCookie(new Cookie("user", "unknown"));
    }
}
