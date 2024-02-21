package com.example.CoursesMicroserviceXML;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class CoursesMicroserviceXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesMicroserviceXmlApplication.class, args);
		System.out.println(SpringVersion.getVersion());
	}

}
