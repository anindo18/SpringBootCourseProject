package com.springrest.springrest.entities;

public class Courses {

	private long id;
	private String CourseName;
	private String CourseDesc;
	
	public Courses(long id, String CourseName, String CourseDesc) {
		super();
		this.id = id;
		this.CourseName = CourseName;
		this.CourseDesc = CourseDesc;
		
	}

	
	@Override
	public String toString() {
		return "Courses [id=" + id + ", CourseName=" + CourseName + ", CourseDesc=" + CourseDesc + "]";
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String getCourseDesc() {
		return CourseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		CourseDesc = courseDesc;
	}
	
	
	
	
}
