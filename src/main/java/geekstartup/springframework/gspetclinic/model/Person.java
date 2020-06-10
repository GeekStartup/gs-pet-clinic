package geekstartup.springframework.gspetclinic.model;

/**
 * @author ashishnayak
 * @created 10-Jun-2020||12:55 PM
 * @project gs-pet-clinic
 */
public class Person {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
