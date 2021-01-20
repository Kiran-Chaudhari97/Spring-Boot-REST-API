package com.Spring.API.First_App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.API.First_App.entities.Course;

import com.Spring.API.First_App.services.CourseService;

@RestController
public class MyController {
	    
	@Autowired(required = true)
	private CourseService courseService;
	
        @GetMapping("/home")
	    public String home() {
		return "Welcome To Course Application";
        }
	
		
		@GetMapping("/Courses")
		
		 public List<Course> getCourses(){
			return this.courseService.getCources();
		}
		
		@GetMapping("/Courses/{courseId} ")
		public Course getCourse(@PathVariable String courseId) {
			return this.courseService.getCourse(Long.parseLong(courseId));
			
		}
	
		

}
