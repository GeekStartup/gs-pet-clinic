package geekstartup.springframework.gspetclinic.model;

import java.util.Set;

/**
 * Created by ashishnayak on 10-Jun-2020||8:48 PM
 */
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
