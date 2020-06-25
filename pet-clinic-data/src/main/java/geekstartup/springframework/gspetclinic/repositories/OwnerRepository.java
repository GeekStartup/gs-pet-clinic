package geekstartup.springframework.gspetclinic.repositories;

import geekstartup.springframework.gspetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashishnayak on 25-Jun-2020||1:35 PM
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
