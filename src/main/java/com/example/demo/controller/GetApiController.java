package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GetApiController {

    @GetMapping(value = "/getApi")
    public String getApi(String api){ //使得url 可帶可不帶
        return api;
    }

    @GetMapping(value = "/getApiParam")
    public String getApiParam(@RequestParam String api,String api_2){  //使得url 第一個一定要帶參數
        return api + api_2;
    }

    @GetMapping(value = "/getApiPath")
    public String getApiPath(@PathVariable String api){
        return api;
    }




}
