package nl.GraphqlProject.repositories;

import nl.GraphqlProject.entities.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PetRepository extends CrudRepository<Pet, UUID> {
}
