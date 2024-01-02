package com.Redis.RedisExample;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig  {

    @Bean
    public LettuceConnectionFactory factory() {
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration("redis-11220.c326.us-east-1-3.ec2.cloud.redislabs.com", 11220);
        redisStandaloneConfiguration.setPassword("hx6QwjSHRHGSEUMT3bLJXDDkrYQUQcOL");
        LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory(redisStandaloneConfiguration);
        return lettuceConnectionFactory;
    }

    @Bean
    public RedisTemplate<String,Object> template(){
RedisTemplate<String,Object>redisTemplate=new RedisTemplate<>();
redisTemplate.setKeySerializer(new StringRedisSerializer());
redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
redisTemplate.setConnectionFactory(factory());
redisTemplate.afterPropertiesSet();
        return  redisTemplate;
    }
}
