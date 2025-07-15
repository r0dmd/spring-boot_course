package com.r0dmd.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r0dmd.springboot.webapp.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/details")
  public Map<String, Object> details(Model model) {
    User user = new User("John", "Smith");
    Map<String, Object> body = new HashMap<>();

    body.put("title", "Hello World from Spring Boot");
    body.put("user", user);
    
    return body;
  };

}
