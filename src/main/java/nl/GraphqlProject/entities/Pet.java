package nl.GraphqlProject.entities;

import nl.GraphqlProject.enums.Animal;



import java.util.UUID;


public class Pet {
    private UUID id;

    private String name;

    private Animal type;

    private int age;

    private Pet(String name, Animal type, int age){
        this.id = UUID.randomUUID();
        this.name = name;
        this.type = type;
        this.age = age;
    }


    public static Pet Create(String name, Animal type, int age){
        return new Pet(name, type, age);
    }

}
