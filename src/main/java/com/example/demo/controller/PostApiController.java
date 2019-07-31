package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostApiController {

    @PostMapping(value = "/postApi")
    public String postApi(String api){ //使用 x-www-form-urlencoded
        return api;
    }

    @PostMapping(value = "/postApiParam")
    public String postApiParam(String api,String api_2){ //使用 可以不用帶任何參數
        return api + api_2;
    }

    @PostMapping(value = "/postApiJson")
    public User postApiJson(User user){  //可以戳到api 但是沒辦法接到參數
        return user;
    }

    @PostMapping(value = "/postApiJson/RequestBody")
    public User postApiJsonRequestBody(@RequestBody User user){
        return user;
    }
}
