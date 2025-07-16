package com.r0dmd.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.r0dmd.springboot.webapp.models.User;

@Controller
public class UserController {

  @GetMapping("/details")
  public String details(Model model) {
    User user = new User("John", "Smith");
    user.setEmail("john@smith.com");

    model.addAttribute("title", "Hello World from Spring Boot");
    model.addAttribute("user", user);

    return "details";
  };

}
