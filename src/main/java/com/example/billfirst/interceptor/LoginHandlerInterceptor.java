package com.example.billfirst.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser=request.getSession().getAttribute("loginUser");
        if(loginUser!=null){
            return true;
        }
        request.setAttribute("msg","没有权限，请先登录！");
        request.getRequestDispatcher("/").forward(request,response);
        return false;
    }
}
