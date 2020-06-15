package geekstartup.springframework.gspetclinic.model;

/**
 * Created by ashishnayak on 10-Jun-2020||8:50 PM
 */
public class PetType extends BaseEntity{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
