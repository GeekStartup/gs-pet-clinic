package geekstartup.springframework.gspetclinic.repositories;

import geekstartup.springframework.gspetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashishnayak on 25-Jun-2020||1:38 PM
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
