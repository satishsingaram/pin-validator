package com.daimler.dtna.errorlogger.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class ErrorLoggerController {

    // call me from pin validator
    //post data method
    insertIntoDB()

    @GetMapping("/health-check")
    @ResponseBody
    public String healthCheck(){
        log.info("error-logger is up and running !!!");
        return "This is for test";
    }
}
