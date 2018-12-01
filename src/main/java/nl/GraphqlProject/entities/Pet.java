package nl.GraphqlProject.entities;

import nl.GraphqlProject.enums.Animal;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "Pets")
public class Pet {
    @Id
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getType() {
        return type;
    }

    public void setType(Animal type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", age=" + age +
                '}';
    }
}
