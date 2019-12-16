package com.cctv.itoken.web.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zb
 * @create 2019-12-16 17:20
 */
@Controller
public class AdminController {

    @RequestMapping(value = {"","login"},method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
