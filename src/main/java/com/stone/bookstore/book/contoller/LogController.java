package com.stone.bookstore.book.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @GetMapping(path = "/debug")
  public String debug() {
    logger.debug("im debug");
    return "debug";
  }

  @GetMapping(path = "/info")
  public String info() {
    logger.info("im info");
    return "info";
  }

  @GetMapping(path = "/warn")
  public String warn() {
    logger.warn("im warn");
    return "warn";
  }

  @GetMapping(path = "/error")
  public String error() {
    logger.error("im error");
    return "error";
  }

}
