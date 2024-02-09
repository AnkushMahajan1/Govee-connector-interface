package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/v1/api")
public class RequestAcceptor {

    public RequestAcceptor(){
    }

    @PostMapping("/govee")
    public void getPromptForGovee (@RequestParam() String message){

    }

}
