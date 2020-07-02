package com.longrise.flume.interceptor;


import com.longrise.flume.util.LogUtils;
import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.interceptor.Interceptor;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class LogETLInterceptor implements Interceptor {


    public void initialize() {

    }

    public Event intercept(Event event) {
        // 1.获取数据
        byte[] body = event.getBody();
        String log = new String(body, Charset.forName("UTF-8"));

        // 2.判断数据类型并向Header中赋值
        if (log.contains("start")){
            if (LogUtils.validateStart(log)){
                return event;
            }
        }else {
            if (LogUtils.validateEvent(log)){
                return event;
            }
        }
        // 返回校验结果
        return null;

    }

    public List<Event> intercept(List<Event> list) {
        ArrayList<Event> interceptors = new ArrayList<>();
        for (Event event : list) {
            Event intercept = intercept(event);
            if (intercept != null)
                interceptors.add(intercept);
        }
        
        return interceptors;
    }

    public void close() {

    }

    public static class Builder implements Interceptor.Builder{

        @Override
        public Interceptor build() {
            return new LogETLInterceptor();
        }

        @Override
        public void configure(Context context) {

        }
    }

}
