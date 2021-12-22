package com.lenovo.mycode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/jenkins")
@RestController
public class JenkinsController {

    @GetMapping("/jenkins")
    public String myJenkins(@RequestParam("msg") String msg) {
        return msg+"123ken";
    }

}
