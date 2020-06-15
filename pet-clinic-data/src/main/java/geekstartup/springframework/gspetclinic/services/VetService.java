package geekstartup.springframework.gspetclinic.services;

import geekstartup.springframework.gspetclinic.model.Vet;

import java.util.Set;

/**
 * Created by ashishnayak on 15-Jun-2020||5:56 PM
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
