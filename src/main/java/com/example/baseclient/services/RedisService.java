package com.example.baseclient.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
public class RedisService {
    private Jedis redisClient;

    public RedisService(@Autowired Jedis redisClient) {
        this.redisClient = redisClient;
    }

    public String getByLocator(String locator) {
        return redisClient.get(locator);
    }

    public void setWithLocator(String locator, String content) {
        redisClient.set(locator, content);
    }
}
