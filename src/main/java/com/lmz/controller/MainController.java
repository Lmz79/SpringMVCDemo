package com.lmz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ALiP on 2016.08.18.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
