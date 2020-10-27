package com.project.services;

import com.project.interfaces.Course;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Autowired //Field Injection
    private OfficeHours officeHours;

    /*
    //Constructor Injection => the most useful
    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
*/
    /*
     //Setter Infection
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
  */

    @Override
    public void getTeachingHours() {

        System.out.println("Weekly teaching hours :" + (30 + officeHours.getHours()));
    }
}
