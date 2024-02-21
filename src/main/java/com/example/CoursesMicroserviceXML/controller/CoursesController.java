package com.example.CoursesMicroserviceXML.controller;

import com.example.CoursesMicroserviceXML.model.Course;
import jakarta.annotation.PostConstruct;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoursesController {

    private List<Course> courses;

    @PostConstruct
    public void init(){
       courses = new ArrayList<>();
       courses.add(new Course("Spring",25,"Tuesday"));
       courses.add(new Course("Spring Boot",40,"Wednesday"));
       courses.add(new Course("Python", 50,"Thursday"));
       courses.add(new Course("Java", 50,"Monday"));
       courses.add(new Course("Java 2", 50,"Monday"));
    }

    @GetMapping(value = "courses", produces = MediaType.APPLICATION_XML_VALUE)
    public List<Course> getCourses(){
        return courses;
    }

    @GetMapping(value = "course", produces = MediaType.APPLICATION_XML_VALUE)
    public Course getCourse(){
        return new Course("Java",100,"Monday");
    }

    @GetMapping(value = "courses/{name}", produces = MediaType.APPLICATION_XML_VALUE)
    public List<Course> findCourse(@PathVariable(name = "name")String name){

        List<Course> aux = new ArrayList<>();
        for (Course c:courses){
            if(c.getName().contains(name)){
                aux.add(c);
            }
        }
        return aux;
    }
}
