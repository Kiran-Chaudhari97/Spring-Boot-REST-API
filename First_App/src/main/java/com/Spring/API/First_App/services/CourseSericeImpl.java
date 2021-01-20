package com.Spring.API.First_App.services;
import com.Spring.API.First_App.services.CourseService;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Spring.API.First_App.entities.Course;
@Service
public class CourseSericeImpl implements CourseService{
	List<Course>List;
	
	public CourseSericeImpl() //Controcstor
	{
		List = new ArrayList<>();
		
		List.add(new Course(101,"Java Core Cource","This Is A Core Java Core Java Cours"));
		List.add(new Course(182,"Spring Boot","This Is Rest API"));
		
	}

	@Override
	public List<Course> getCources() {
		
		return List;
	}

	@Override
	public Course getCourse(long courseId) {
		
		Course c = null;
		for(Course course:List) 
		{
			if(course.getId() == courseId) 
			{
				c = course;
				break;
			}
			
		}
		
		return null;
	}
	

}
