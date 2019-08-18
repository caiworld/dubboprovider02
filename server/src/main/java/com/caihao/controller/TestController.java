package com.caihao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/8/10 14:22
 */
@RestController
public class TestController {

  @GetMapping("/test")
  public String test() {
    return "hello world, dubbo";
  }

}
