package com.bqjr.exception;

import com.bqjr.model.Response;
import com.bqjr.utils.DateUtils;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Panda on 2016/9/27.
 *
 * @version 1.0
 * @description com.bqjr.interceptor.ExceptionHandler
 * 统一异常处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.OK)
    public Object handleException(HttpServletRequest request, HttpServletResponse response, HandlerMethod handlerMethod, Exception ex) throws IOException, ServletException {
        if (log.isDebugEnabled()) {
            log.debug("当前时间：{}，请求接口：{}， 异常信息：{}",
                    DateUtils.formatDate(new Date()),
                    request.getRequestURL(), ex.getMessage());
            ex.printStackTrace();
        }

        //异常是否来自Spring security 如果是 则交给handler 处理 在之前先处理JSON
        /*if (ex instanceof AccessDeniedException) {
            accessDeniedHandler.handle(request, response, (AccessDeniedException)ex);
        }*/

        //判断是否是指定的Rest接口请求 如果是则返回JSON
        if (handlerMethod.hasMethodAnnotation(ResponseBody.class)
                || handlerMethod.getBeanType().isAnnotationPresent(RestController.class)
                || (StringUtils.isNotEmpty(request.getContentType())
                && request.getContentType().equals(MediaType.APPLICATION_JSON_VALUE))
                || "XMLHttpRequest".equals(request.getHeader("X-Requested-With"))) {
            //是否是逻辑异常
            return Response.failure(ex.getMessage(),"500");

        }

        //普通业务请求异常
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", ex.getMessage());
        mav.addObject("url", request.getRequestURL());
        mav.setViewName("error");
        return mav;
    }
}
