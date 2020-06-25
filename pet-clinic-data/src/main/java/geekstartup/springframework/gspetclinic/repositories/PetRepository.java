package geekstartup.springframework.gspetclinic.repositories;

import geekstartup.springframework.gspetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashishnayak on 25-Jun-2020||1:36 PM
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
