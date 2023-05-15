package com.example.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springboot.learnjpaandhibernate.course.Course;
import com.example.springboot.learnjpaandhibernate.course.CourseJpaRepository;
import com.example.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
//	@Autowired
//	private CourseJdbcRepository repository;
//	@Autowired
//	private CourseJpaRepository repository;
	@Autowired
	private CourseSpringDataJpaRepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		repository.insert(new Course(101,"aws1","cloud1"));
//		repository.insert(new Course(201,"aws1","cloud1"));
//		repository.insert(new Course(202,"aws2","cloud2"));
//		repository.insert(new Course(203,"aws3","cloud3"));
//		repository.insert(new Course(204,"aws4","cloud4"));
//		repository.deleteById(101);
//		System.out.println(repository.findById(201));
		
		repository.save(new Course(101,"aws1","cloud1"));
		repository.save(new Course(201,"aws1","cloud1"));
		repository.save(new Course(202,"aws2","cloud2"));
		repository.save(new Course(203,"aws3","cloud4"));
		repository.save(new Course(204,"aws4","cloud4"));
		repository.deleteById(101);
		System.out.println(repository.findById(201));
		System.out.println(repository.count());
		System.out.println(repository.findAll());
		System.out.println(repository.findByAuthor("cloud4")); //custom method
		
	}
    
}
