package com.project.services;

import com.project.interfaces.Course;
import com.project.interfaces.ExtraSessions;

public class Java implements Course {

    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours(){

        System.out.println("Java weekly Teaching Hours : " + (20 + extraSessions.getHours()));


    }
}