package com.daimler.dtna.pinvalidationservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/validate")
public class PinValidationController {

    //if error orrcuured then call error logger:
    @FeignClient("error-logger")
    interface HelloClient {
        @RequestMapping(value = "/", method = POST)
        String insertIntoDB(errors);
    }

    @GetMapping("/health-check")
    @ResponseBody
    public String healthCheck(){
        log.info("Pin Validator is up and running !!!");
        return "UP";
    }
}
