package nl.GraphqlProject.repositories;

import nl.GraphqlProject.entities.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface PetRepository extends CrudRepository<Pet, UUID> {

    @Override
    List<Pet> findAll();
}
