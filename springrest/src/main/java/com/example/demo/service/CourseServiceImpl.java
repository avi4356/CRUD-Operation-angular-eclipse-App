package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDao;
import com.example.demo.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
/*
	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(111,"java core", "this course is java core"));
		list.add(new Course(222,"java core1", "this course is java core1"));
		
	}
	@Override
	public List<Course> getCourses() {		
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course:list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
		list.forEach(e->{
			if(e.getId() == course.getId()) {
			   e.setTitle(course.getTitle());
			   e.setDiscreption(course.getDiscreption());
			}
			
		});
		return course;
	}
	@Override
	public void deleteCourse(long parseLong) {
		list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		//return list;
	}
	
*/
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getCourses() {		
		return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseId) {
		return courseDao.getOne(courseId);
	}
	
	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
		
	}
	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
		
	}
	@Override
	public void deleteCourse(long parseLong) {
		Course entity =courseDao.getOne(parseLong);
		courseDao.delete(entity);		
	}
	
}
