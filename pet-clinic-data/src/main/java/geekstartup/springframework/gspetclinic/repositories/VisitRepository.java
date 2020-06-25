package geekstartup.springframework.gspetclinic.repositories;

import geekstartup.springframework.gspetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashishnayak on 25-Jun-2020||1:40 PM
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
