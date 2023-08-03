package com.example.tacocloud.models;

import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

}
