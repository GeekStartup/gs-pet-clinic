package geekstartup.springframework.gspetclinic.repositories;

import geekstartup.springframework.gspetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashishnayak on 25-Jun-2020||1:39 PM
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
