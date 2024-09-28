package org.jenkins.springbootstarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("")
    public String test() {
        return "Spring Boot Starter Route v2";
    }
}
