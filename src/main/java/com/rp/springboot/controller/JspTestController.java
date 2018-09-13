package com.rp.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created by rp on 2018/9/13.
 */
@Controller
public class JspTestController {

    @GetMapping("/jsp")
    public String index( ){
        System.out.println("jspTest ========================");
        if(1==1){
            throw new RuntimeException();
        }
        return "jspTest";
    }
}
