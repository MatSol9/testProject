package com.example.baseclient.rest;

import com.example.baseclient.services.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class redisController {
    private final RedisService redisService;

    public redisController(@Autowired RedisService redisService) {
        this.redisService = redisService;
    }

    @GetMapping(value="/set")
    public String setWithLocator(){
        return "Done";
    }
}
