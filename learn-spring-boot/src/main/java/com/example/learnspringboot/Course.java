package com.example.learnspringboot;

import org.springframework.core.style.ToStringCreator;

public class Course {
	private long id;
	
	private String name;
	private String author;
	//contructor
	//getters
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	@Override
	public String toString()
	{
		return "Course [id="+id+", name="+name+" author="+author+"]";
	}
		
	
}
