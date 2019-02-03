package nl.GraphqlProject;

import nl.GraphqlProject.entities.Pet;
import nl.GraphqlProject.enums.Animal;
import nl.GraphqlProject.repositories.PetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class GraphqlApplication{
    private static final Logger log = LoggerFactory.getLogger(GraphqlApplication.class);
    public static void main(String[] args){
        SpringApplication.run(GraphqlApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(PetRepository repository){
//        return args -> {
//            repository.save(Pet.Create("Ben", Animal.Dog, 15 ));
//        };
//    }

}
