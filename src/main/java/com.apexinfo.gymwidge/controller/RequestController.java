package com.apexinfo.gymwidge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class RequestController {

    Logger logger = LoggerFactory.getLogger(RequestController.class);

    @RequestMapping(value = "hello" , produces = "application/json")
    public String sayHello()
    {
        return "Hello world!";
    }
}
