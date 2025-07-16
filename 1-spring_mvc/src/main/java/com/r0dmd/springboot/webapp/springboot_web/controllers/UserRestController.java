package com.r0dmd.springboot.webapp.springboot_web.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// import java.util.HashMap;
// import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r0dmd.springboot.webapp.models.User;
import com.r0dmd.springboot.webapp.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/details")
  public UserDto details(Model model) {
    User user = new User("John", "Smith");

    UserDto userDto = new UserDto();
    userDto.setTitle("Hello World from Spring Boot");
    userDto.setUser(user);

    return userDto;
  };

  @GetMapping("/list")
  public List<User> list() {
    User user = new User("Mary", "Perkins");
    User user2 = new User("John", "Smith");
    User user3 = new User("Richard", "Clemenson");

    // List<User> users = new ArrayList<>();
    // users.add(user);
    // users.add(user2);
    // users.add(user3);
    List<User> users = Arrays.asList(user, user2, user3);

    return users;
  }

  /*
   * @GetMapping("/details-map")
   * public Map<String, Object> detailsMap(Model model) {
   * User user = new User("John", "Smith");
   * Map<String, Object> body = new HashMap<>();
   * 
   * body.put("title", "Hello World from Spring Boot");
   * body.put("user", user);
   * 
   * return body;
   * };
   */

}
