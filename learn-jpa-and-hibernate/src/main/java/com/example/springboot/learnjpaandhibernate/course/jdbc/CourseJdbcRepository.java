package com.example.springboot.learnjpaandhibernate.course.jdbc;

import org.hibernate.sql.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springboot.learnjpaandhibernate.course.Course;
@Repository
public class CourseJdbcRepository {
	@Autowired
	 private JdbcTemplate springJdbcTemplate;
	 
	 private static String INSERT_QUERY =
			 """
	 		INSERT INTO course ( id,name, author) VALUES
	 		(?,?,?)
	 		""";
	 private static String DELETE_QUERY =
			 """
	 		DELETE FROM course WHERE ID=?
	 		""";
	 
	 private static String SELECT_QUERY =
			 """
	 		SELECT * FROM course WHERE ID=?
	 		""";
	 
	 
	 public void insert(Course course)
	 {
		springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor()); 
	 }
	 public void deleteById(int id)
	 {
		System.out.println(springJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id)); 
		springJdbcTemplate.update(DELETE_QUERY,id); 
	 }
	 public Course findById(int id)
	 {
		 //ResultSet -> Bean -> RowMapper
		return springJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id); 
		
	 }
}
