package com.example.CoursesMicroserviceXML.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class Course {

    private String name;
    private int duration;
    private String timetable;

    public Course(String name, int duration, String timetable) {
        this.name = name;
        this.duration = duration;
        this.timetable = timetable;
    }

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTimetable() {
        return timetable;
    }

    public void setTimetable(String timetable) {
        this.timetable = timetable;
    }
}
