package com.springrest.springrest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;

import java.util.*;
import java.lang.*;

@RestController
public class Mycontroller {

	CourseService cs = new CourseService();
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
		
	}
	
	// get courses
	
	@GetMapping("/courses")
	public List<Courses> getCourses(){
	
		return this.cs.getCourses();
		
	}
	
	//search for a particular course
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.cs.getCourse(Long.parseLong(courseId)); 	
	}
	
	// Create new Courses
	
	@PostMapping("/courses")
	public Courses CreateCourse(@RequestBody Courses course) {
		return this.cs.createCourse(course);
	}
	
	@PutMapping("/courses")
	public Courses ModifyCourse(@RequestBody Courses course) {
		return this.cs.ModifyCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public Courses RemoveCourse(@PathVariable String courseId) {
		return this.cs.removeCourse(Long.parseLong(courseId));
	}
	
}
