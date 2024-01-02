package com.Redis.RedisExample;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person implements Serializable { //for coverting the object to the byte code so that it can easil be uderstand by the redis lab
    @Positive
    private int id;
    @NotBlank
    private String name;
    private int age;
    private double creditScore;
}
