package com.project.services;

import com.project.interfaces.Course;
import com.project.interfaces.ExtraSessions;
import lombok.Data;

@Data
public class Java implements Course {

    private OfficeHours officeHours;

    /*
    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(OfficeHours officeHours) { //set + officeHours
        this.officeHours = officeHours;
    }
    */
    public void getTeachingHours(){

        System.out.println("Java weekly Teaching Hours : " + (20 + officeHours.getHours()));
    }
}