package com.train.batch.controller;

import com.train.batch.feign.BusinessFeign;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Resource
    private BusinessFeign businessFeign;

    @GetMapping("/hello")
    public String hello() {
     businessFeign.text();
        return " batch hello!!";
    }

}
