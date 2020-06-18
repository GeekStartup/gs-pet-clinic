package geekstartup.springframework.gspetclinic.services.map;

import geekstartup.springframework.gspetclinic.model.BaseEntity;

import java.util.*;

/**
 * Created by ashishnayak on 15-Jun-2020||8:59 PM
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {

        if (null != object) {
            if (null == object.getId()) {
                object.setId(genNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object can't be null");
        }

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long genNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }

}
