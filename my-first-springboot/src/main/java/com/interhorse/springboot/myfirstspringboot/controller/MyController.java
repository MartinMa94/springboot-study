package com.interhorse.springboot.myfirstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author InterHorse
 * @date 2020/6/3
 */
@Controller
public class MyController {
    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    private String test() {
        return "Hello World!";
    }
}
