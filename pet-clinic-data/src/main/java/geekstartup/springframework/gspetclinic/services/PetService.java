package geekstartup.springframework.gspetclinic.services;

import geekstartup.springframework.gspetclinic.model.Pet;

import java.util.Set;

/**
 * Created by ashishnayak on 15-Jun-2020||5:47 PM
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet Pet);

    Set<Pet> findAll();
}
