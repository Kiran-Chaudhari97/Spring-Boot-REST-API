package com.Spring.API.First_App.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Spring.API.First_App.entities.Course;


public interface CourseService {
	
	public List<Course> getCources();
	
	public Course getCourse(long courseId);
	
}
