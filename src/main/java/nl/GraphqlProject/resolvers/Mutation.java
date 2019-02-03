package nl.GraphqlProject.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import nl.GraphqlProject.entities.Pet;
import nl.GraphqlProject.enums.Animal;
import nl.GraphqlProject.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private PetRepository petRepository;

    public Pet createPet(String name, int age ){
        Pet pet = Pet.Create(name,randomAnimal(),age);
        System.out.println(petRepository.save(pet));
        return pet;
    }

    private Animal randomAnimal() {
        int pick = new Random().nextInt(Animal.values().length);
        return Animal.values()[pick];
    }

}
