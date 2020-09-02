package com.daimler.dtna.pargenerator.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequestMapping("/generate")
public class ParGeneratorController {

    @GetMapping("/health-check")
    @ResponseBody
    public String healthCheck(){
        log.info("Par Generator is up and running !!!");
        return "UP";
    }
}
