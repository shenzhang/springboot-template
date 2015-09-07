package com.github.shenzhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * User: shenzhang
 * Date: 11/8/14
 * Time: 2:01 AM
 */
@Controller
public class DynamicController {
    @RequestMapping("/date")
    public String date(Model model) {
        model.addAttribute("hello", new Date().toString());
        return "date";
    }
}
