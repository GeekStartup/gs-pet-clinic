package geekstartup.springframework.gspetclinic.model;

import java.io.Serializable;

/**
 * Created by ashishnayak on 15-Jun-2020||6:14 PM
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
