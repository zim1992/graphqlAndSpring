package nl.GraphqlProject.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import nl.GraphqlProject.entities.Pet;
import nl.GraphqlProject.enums.Animal;
import org.apache.commons.text.RandomStringGenerator;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Component
public class Query implements GraphQLQueryResolver {
    public List<Pet> petsv = new ArrayList<>();
    private  Random rnd = new Random();
    private RandomStringGenerator randomStringGenerator = new RandomStringGenerator.Builder().withinRange('a', 'z').build();
    public List<Pet> pets(){
        singlePet();
        return petsv;
    }

    public Pet singlePet(){
        Pet pet = Pet.Create(randomStringGenerator.generate(12), randomAnimal(),rnd.nextInt(20));
        petsv.add(pet);
        return pet;
    }

    private Animal randomAnimal() {
        int pick = new Random().nextInt(Animal.values().length);
        return Animal.values()[pick];
    }

}
