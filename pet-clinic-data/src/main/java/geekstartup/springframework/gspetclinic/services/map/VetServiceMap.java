package geekstartup.springframework.gspetclinic.services.map;

import geekstartup.springframework.gspetclinic.model.Vet;
import geekstartup.springframework.gspetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by ashishnayak on 15-Jun-2020||9:23 PM
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
