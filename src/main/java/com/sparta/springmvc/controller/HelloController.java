package com.sparta.springmvc.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

  @GetMapping("/hello")
  @ResponseBody
  public String hello() {
    return "Hello World";
  }

  @GetMapping("/get")
  @ResponseBody
  public String get() {
    return "GET Method 요청";
  }

  @PostMapping("/post")
  @ResponseBody
  public String post() {
    return "POST Method 요청";
  }

  @PutMapping("/put")
  @ResponseBody
  public String put() {
    return "PUT Method 요청";
  }

  @DeleteMapping("/delete")
  @ResponseBody //순수한 문자 반환시 사용하는 애너테이션.
  public String delete() {
    return "DELETE Method 요청";
  }
}