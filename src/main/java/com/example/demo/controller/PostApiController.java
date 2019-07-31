package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostApiController {

    @PostMapping(value = "/postApi")
    public String postApi(String api){
        return api;
    }

    @PostMapping(value = "/postApiParam")
    public String postApiParam(String api,String api_2){
        return api + api_2;
    }

    @PostMapping(value = "/postApiJson")
    public User postApiJson(User user){
        return user;
    }

    @PostMapping(value = "/postApiJson/RequestBody")
    public User postApiJsonR(@RequestBody User user){
        return user;
    }
}
