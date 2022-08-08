package com.example.deploytest.awstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {
    @GetMapping(value="/test")
    public  String awsController() {
        return "ok";
    }
}
