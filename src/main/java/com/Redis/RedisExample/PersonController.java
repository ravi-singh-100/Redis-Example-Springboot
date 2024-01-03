package com.Redis.RedisExample;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

@RestController
public class PersonController {

    private static String PERSON_REDIS="PERSON::";
    @Autowired
    RedisTemplate<String,Object>redisTemplate;
    @GetMapping("/key/val")
    public Person getVal(){
        return null;
    }
    @PostMapping("/key/val")
    public void add(@Valid @RequestBody Person person, @RequestParam(value = "expire",required = false)Integer expiry){
if(expiry==null){
    redisTemplate.opsForValue().set(intToString(person.getId()) ,person);
//    redisTemplate.opsForList().leftPop()
}
else{
    redisTemplate.opsForValue().set(person.getName(),person,expiry, TimeUnit.SECONDS);
}

    }
    public String intToString(Integer id){
        return PERSON_REDIS+id;
    }
}
