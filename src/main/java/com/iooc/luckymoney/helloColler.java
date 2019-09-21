package com.iooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author tyler.chen
 * @data 2019-09-21 10:41
 */
//@RestController
    @Controller
    @RequestMapping("/hello") //为了访问/hello/minmoney
public class helloColler {
//    @Value("${minMoney}")
//    public BigDecimal minMoney;

    @Autowired
    private LimitConfig limitconfig;


    @GetMapping("/hello")
    @ResponseBody //为了让没有模版的有返回值
    public String say(){
        return "hello word";
    }
    @GetMapping({"/minmoney","/money"} )
    @ResponseBody //为了让没有模版的有返回值

    public String minMoney(){
        return "最少发"+limitconfig.getMinMoney()+"元红包";
    }
    @GetMapping("/rules")
    @ResponseBody //为了让没有模版的有返回值
    public String rules(){
        return limitconfig.getDescripition();
    }
    @GetMapping("/moban")
    public String moban(){
        return "index";

    }

}
