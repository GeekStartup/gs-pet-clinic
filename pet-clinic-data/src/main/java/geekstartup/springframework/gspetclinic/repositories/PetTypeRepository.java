package geekstartup.springframework.gspetclinic.repositories;

import geekstartup.springframework.gspetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashishnayak on 25-Jun-2020||1:37 PM
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
