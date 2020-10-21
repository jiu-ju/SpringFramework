package com.project.services;

import com.project.interfaces.Course;

public class Selenium implements Course {
    @Override
    public void getTeachingHours(){

        System.out.println("Selenium weekly Teaching Hours : 15");
    }
}
