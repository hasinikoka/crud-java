package com.jnit.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jnit.app.model.Course;
import com.jnit.app.service.CourseService;

//@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("Courses")
public class CourseController {

	@Autowired 
	private CourseService CourseService;

	@PostMapping
	public Course createCourse(@RequestBody Course Course) throws Exception {
		return CourseService.createcourse(Course);
	}

	@PutMapping
	public Course updateCourse(@RequestBody Course Course) throws Exception {
		return CourseService.updatecourse(Course);
	}

	@DeleteMapping(value="/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable("courseId") Long courseId) throws Exception {
		CourseService.deletecourse(courseId);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

	@GetMapping
	public List<Course> getAllCourses() throws Exception {
		return CourseService.getAllcourses(); 
	}
	
	@GetMapping("/{courseId}")
	public Course getCourseById(@PathVariable("courseId")Long courseId) throws Exception{
		return CourseService.getcourseById(courseId);
	}
}
