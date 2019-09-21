package com.iooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
//    @PostMapping("/helloW")
    @GetMapping("/helloW")
//    @RequestMapping("/helloW") //不区分什么请求
    @ResponseBody //为了让没有模版的有返回值
    public String sys(){
        return limitconfig.getDescripition();
    }
    //方法一
//    @GetMapping("/helloW/{id}")@PathVariable("id")

    //方法二
    @GetMapping("helloe")
    @ResponseBody //为了让没有模版的有返回值   required为false为非必传
    public String can(@RequestParam(value = "id" ,required = false,defaultValue = "0") Integer id) {
        return "id:"+id;
    }
}
