package com.caihao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/8/10 14:24
 */
@SpringBootApplication
@ImportResource(value = {"classpath:spring-dubbo.xml"})
@MapperScan("com.caihao.mapper")
public class ServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServerApplication.class, args);
  }

}
