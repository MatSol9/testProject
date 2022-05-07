package com.example.baseclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

@Configuration
public class Configuration {
    private final String redisUri = "http://127.0.0.1:6379";

    @Bean
    public Jedis redisClient() {
        return new Jedis(redisUri);
    }

}
