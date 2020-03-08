package com.foodnet.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class CommonController {

    @Autowired

    @RequestMapping("/")
    public @ResponseBody String root_test() throws Exception{
        return "I'm gRoot";
    }

    @RequestMapping("/preview")
    public @ResponseBody String preview_test() throws Exception{
        return "preview!";
    }

}
