package com.example.learnspringboot;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost;8080/courses
//Course: id, name ,author
//[ 
// 	{
//	 "id":1,
//	 "name":"learn spring",
//	 "author":"udemy"	 
// 	}
// ]
@RestController
public class CourseController {
	//Course
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses()
	{
		return Arrays.asList(
				new Course(1,"Learn AWS","udemy"),
				new Course(2,"Learn devops","udemy2"),
				new Course(3,"Learn Azure","udemy2")
				);
	}
}
