package com.example.baseclient.services;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RedisServiceTest {
    private final Jedis redisClient = mock(Jedis.class);
    private RedisService redisService = new RedisService(redisClient);

    private final String FIRST_LOCATOR = "AA";
    private final String RESULT_FOR_FIRST_LOCATOR = "whatever";

    @Test
    public void shouldUseClient() {
        when(redisClient.get(FIRST_LOCATOR)).thenReturn(RESULT_FOR_FIRST_LOCATOR);
        String result = redisService.getByLocator(FIRST_LOCATOR);
        assertEquals(RESULT_FOR_FIRST_LOCATOR, result);
    }

}