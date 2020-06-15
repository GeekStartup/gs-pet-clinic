package geekstartup.springframework.gspetclinic.services;

import geekstartup.springframework.gspetclinic.model.Owner;

import java.util.Set;

/**
 * Created by ashishnayak on 15-Jun-2020||5:34 PM
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();


}
