package com.project.services;

import com.project.interfaces.Course;
import lombok.Data;

public class Java implements Course {

    public void getTeachingHours(){
        System.out.println("Java weekly Teaching Hours : 20");
    }
}