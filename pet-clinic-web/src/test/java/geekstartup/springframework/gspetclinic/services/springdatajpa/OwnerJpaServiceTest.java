package geekstartup.springframework.gspetclinic.services.springdatajpa;

import geekstartup.springframework.gspetclinic.model.Owner;
import geekstartup.springframework.gspetclinic.repositories.OwnerRepository;
import geekstartup.springframework.gspetclinic.repositories.PetRepository;
import geekstartup.springframework.gspetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by ashishnayak on 30-Jun-2020||12:59 PM
 */
@ExtendWith(MockitoExtension.class)
class OwnerJpaServiceTest {

    String LAST_NAME_1 = "Nayak";
    String LAST_NAME_2 = "Barik";
    Long ownerId1 = 1L;
    Long ownerId2 = 2L;

    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetTypeRepository petTypeRepository;
    @Mock
    PetRepository petRepository;

    @InjectMocks
    OwnerJpaService ownerJpaService;

    Owner owner1;
    Owner owner2;

    Set<Owner> ownerSet;

    @BeforeEach
    void setUp() {
        owner1 = new Owner();
        owner1.setId(ownerId1);
        owner1.setLastName(LAST_NAME_1);

        owner2 = new Owner();
        owner2.setId(ownerId2);
        owner2.setLastName(LAST_NAME_2);

        ownerSet = new HashSet<>();
        ownerSet.add(owner1);
        ownerSet.add(owner2);
    }

    @Test
    void findByLastName() {

        when(ownerRepository.findByLastName(LAST_NAME_1)).thenReturn(owner1);

        Owner ownerLastName = ownerJpaService.findByLastName(LAST_NAME_1);
        assertEquals(LAST_NAME_1, ownerLastName.getLastName());
        verify(ownerRepository).findByLastName(LAST_NAME_1);
    }

    @Test
    void findAll() {

        when(ownerRepository.findAll()).thenReturn(ownerSet);

        Set<Owner> owners = ownerJpaService.findAll();
        assertNotNull(owners);
        assertEquals(2, owners.size());
        verify(ownerRepository).findAll();

    }

    @Test
    void findById() {
        when(ownerRepository.findById(ownerId1)).thenReturn(Optional.of(owner1));

        Owner returnedOwner = ownerJpaService.findById(ownerId1);
        assertNotNull(returnedOwner);
        assertEquals(owner1, returnedOwner);
    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        Owner returnedOwner = ownerJpaService.findById(3L);
        assertNull(returnedOwner);
    }

    @Test
    void save() {

        when(ownerRepository.save(any())).thenReturn(owner1);

        Owner returnedOwner = ownerJpaService.save(owner1);
        assertNotNull(returnedOwner);
        assertEquals(owner1, returnedOwner);
        verify(ownerRepository).save(any());
    }

    @Test
    void delete() {

        ownerJpaService.delete(owner1);
        verify(ownerRepository, times(1)).delete(any());
    }

    @Test
    void deleteById() {

        ownerJpaService.deleteById(1L);
        verify(ownerRepository).deleteById(anyLong());
    }
}