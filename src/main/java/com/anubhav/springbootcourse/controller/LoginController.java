package com.anubhav.springbootcourse.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.rmi.runtime.Log;

@Controller
@RequestMapping("/LoginController")
public class LoginController {
    Logger logger= LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/login")
    public String login(@RequestParam("name") String name, Model model)
    {
        model.addAttribute("name",name);
        logger.info("Name is: "+name);
        return "login";
    }
}
