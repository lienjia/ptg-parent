package com.ptg.payment.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: lienjiaa
 * Date: 2017/10/25
 * Time: 17:31
 * Version:V1.0
 */
@Controller
@Scope("prototype")
public class IndexAction {
    @RequestMapping("/")
    public String index(){
        return "login";
    }
    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }
}

