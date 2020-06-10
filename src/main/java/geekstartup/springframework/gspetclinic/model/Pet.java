package geekstartup.springframework.gspetclinic.model;

import java.time.LocalDate;

/**
 * @author ashishnayak
 * @created 10-Jun-2020||1:07 PM
 * @project gs-pet-clinic
 */
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
