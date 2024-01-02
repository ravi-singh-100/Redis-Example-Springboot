package com.Redis.RedisExample;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    @GetMapping("/key/val")
    public Person getVal(){
        return null;
    }
    @PostMapping("/key/val")
    public void add(@Valid @RequestBody Person person, @RequestParam(value = "expire",required = false)Integer expiry){

    }
}
