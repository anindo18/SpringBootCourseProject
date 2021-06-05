package com.springrest.springrest.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;

@Service
public class CourseService {

	List<Courses> list;
	
	public CourseService() {
		list = new ArrayList<>();
		list.add(new Courses(100,"Java","This is a Java Course"));
		list.add(new Courses(200,"Spring Boot","Learn more about Spring Boot Framework"));
	}
	
	public List<Courses> getCourses() {
		return list;
	}
	
	public Courses getCourse(Long CourseId) {
		Courses c= null;
		
		for (Courses course:list) {
			if(course.getId() == CourseId) {
				c = course;
				break;
			}
			
		}
		
		return c;
	}
	
	public Courses createCourse(Courses course) {
		list.add(course);
		return course;
	}
	
	public Courses ModifyCourse(Courses course) {
		Courses c= null;
		for(Courses courselist:list) {
			if (course.getId() == courselist.getId()){
				courselist.setCourseName(course.getCourseName()); 
				courselist.setCourseDesc(course.getCourseDesc());
			}
		}
		return course;
	}
	
	public Courses removeCourse(Long courseId) {
		Courses c = null;
		
		for (Courses course:list) {
			if(course.getId() == courseId) {
				c = course;
				list.remove(c);
			}
		}
		return c;
	}
}
