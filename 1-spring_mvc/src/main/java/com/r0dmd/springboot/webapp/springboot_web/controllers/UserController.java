package com.r0dmd.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  @GetMapping("/details")
  public String details(Model model) {
    model.addAttribute("title", "Hello World from Spring Boot");
    model.addAttribute("name", "r0dmd");
    
    return "details";
  };

}
