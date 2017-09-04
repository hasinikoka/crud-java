package com.jnit.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jnit.app.dao.CourseRepository;
import com.jnit.app.model.Course;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public Course createcourse(Course course) throws Exception{
		return courseRepository.save(course);
	}

	public Course updatecourse(Course course) throws Exception{
		return courseRepository.save(course);
	}

	public void deletecourse(Long courseId) throws Exception{
		courseRepository.delete(courseId);
	}

	public List<Course> getAllcourses() throws Exception{
		return courseRepository.findAll();
	}
	
	public Course getcourseById(Long courseId)throws Exception{
		return courseRepository.findOne(courseId);
	}
	
}
