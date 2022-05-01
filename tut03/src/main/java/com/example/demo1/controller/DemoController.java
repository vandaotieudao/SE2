package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @RequestMapping( value = "/5")
    public String DemoPage(Model model) {
        String text = " hanoi is no nonnnono";
        model.addAttribute("hanoi", text);
        return "demo";
    }
}
