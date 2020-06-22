package geekstartup.springframework.gspetclinic.model;

/**
 * Created by ashishnayak on 21-Jun-2020||7:19 PM
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
