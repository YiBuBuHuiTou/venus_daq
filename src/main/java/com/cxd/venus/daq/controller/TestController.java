package com.cxd.venus.daq.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author YiBuBuHuiTou
 * @Description
 * @Date 2022/3/27 18:49
 * @Version 1.0
 **/

@Controller
@RequestMapping(path = "/test")
@ResponseBody
@RefreshScope
public class TestController {

    @Value(value = "${useLocalCache:false}")
    private String useLocalCache;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String get() {
        return useLocalCache;
    }
}
