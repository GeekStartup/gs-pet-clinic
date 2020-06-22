package geekstartup.springframework.gspetclinic.model;

import java.util.Set;

/**
 * Created by ashishnayak on 10-Jun-2020||8:47 PM
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
