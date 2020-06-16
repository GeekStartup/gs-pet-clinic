package geekstartup.springframework.gspetclinic.services;

import geekstartup.springframework.gspetclinic.model.Owner;

/**
 * Created by ashishnayak on 15-Jun-2020||5:34 PM
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
