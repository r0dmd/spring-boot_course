package com.r0dmd.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.r0dmd.springboot.webapp.models.dto.ParamDto;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

  @GetMapping("/foo")
  public ParamDto foo(@RequestParam(required = false, defaultValue = "Default message"
  // , name = "mensaje"
  ) String message) {
    ParamDto param = new ParamDto();
    param.setMessage(message);
    if (param.getCode() == null) {
      param.setCode(001010);
    }
    return param;
  }

  // http://localhost:8000/api/params/bar?text=texto-cualquiera&code=5874
  @GetMapping("/bar")
  public ParamDto bar(@RequestParam String text, @RequestParam Integer code) {
    ParamDto params = new ParamDto();
    params.setMessage(text);
    params.setCode(code);
    return params;
  }

  // Objeto nativo de donde se extrae todo lo relacionado con las requests
  @GetMapping("/request")
  public ParamDto request(HttpServletRequest request) {
    ParamDto params = new ParamDto();

    Integer code = 000;
    try {
      code = Integer.parseInt(request.getParameter("code"));
    } catch (NumberFormatException e) {
    }

    params.setCode(code);
    params.setMessage(request.getParameter("message"));
    return params;
  }

}
