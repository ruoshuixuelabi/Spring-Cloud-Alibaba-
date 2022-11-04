package com.gupaoedu.book.springcloud.sentinel.springcloudsentinelsample;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
//@Service
//public class CustomUrlBlockHandler implements UrlBlockHandler{
//    @Override
//    public void blocked(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws IOException {
//        httpServletResponse.setHeader("Content-Type", "application/json;charset=UTF-8");
//        String message = "{\"code\":999,\"msg\":\"访问人数过多\"}";
//        httpServletResponse.getWriter().write(message);
//    }
//}
@Configuration
public class CustomUrlBlockHandler implements BlockExceptionHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse httpServletResponse, BlockException e) throws Exception {
        httpServletResponse.setHeader("Content-Type", "application/json;charset=UTF-8");
        String message = "{\"code\":999,\"msg\":\"访问人数过多\"}";
        httpServletResponse.getWriter().write(message);
    }
}
