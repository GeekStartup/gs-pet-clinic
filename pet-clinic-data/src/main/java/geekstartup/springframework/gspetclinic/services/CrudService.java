package geekstartup.springframework.gspetclinic.services;

import java.util.Set;

/**
 * Created by ashishnayak on 15-Jun-2020||8:36 PM
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
