package geekstartup.springframework.gspetclinic.services.map;

import geekstartup.springframework.gspetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Created by ashishnayak on 30-Jun-2020||11:11 AM
 */
class OwnerMapServiceTest {

    OwnerMapService ownerMapService;
    final Long ownerId = 1L;
    final String lastName = "Nayak";

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
        Owner owner = new Owner();
        owner.setId(ownerId);
        owner.setLastName(lastName);
        ownerMapService.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner> owners = ownerMapService.findAll();
        assertEquals(1, owners.size());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);
        assertEquals(ownerId, owner.getId());
    }

    @Test
    void saveExistingId() {
        Owner owner = new Owner();
        owner.setId(2L);
        Owner savedOwner = ownerMapService.save(owner);
        assertEquals(2L, savedOwner.getId());
    }

    @Test
    void saveGenerateId() {
        Owner owner = new Owner();
        Owner savedOwner = ownerMapService.save(owner);
        System.out.println(savedOwner.getId());
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId);
        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void findByLastName() {
        Owner ownerByLastName = ownerMapService.findByLastName(lastName);
        assertNotNull(ownerByLastName);
        assertEquals(lastName, ownerByLastName.getLastName());
    }
}