package com.gupaoedu.book.dubbo;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2020/1/6-11:40
 */
@DubboService(version = "1.0.0")
public class UserServiceImpl implements IUserService {
    @Override
    public String getNameById(String uid) {
        System.out.println("receive request data:" + uid);
        //TODO 省略数据库操作
        return "Mic";
    }
}