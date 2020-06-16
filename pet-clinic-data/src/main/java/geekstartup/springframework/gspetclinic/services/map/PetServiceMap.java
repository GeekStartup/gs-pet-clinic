package geekstartup.springframework.gspetclinic.services.map;

import geekstartup.springframework.gspetclinic.model.Pet;
import geekstartup.springframework.gspetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by ashishnayak on 15-Jun-2020||9:19 PM
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}