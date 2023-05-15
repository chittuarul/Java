package com.example.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service

public class TodoService {
	private static List<Todo> todos=new ArrayList<>();
	private static int todoCount=0;
	static {
		todos.add(new Todo(++todoCount,"chittu","learn java",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todoCount,"arul","learn devops",LocalDate.now().plusYears(2),false));
		todos.add(new Todo(++todoCount,"kumar","learn aws",LocalDate.now().plusYears(4),false));
		todos.add(new Todo(++todoCount,"somu","learn azure",LocalDate.now().plusYears(3),false));
	}
	public List<Todo> findByUsername(String username)
	{
		return todos;
	}
	public void addTodo(String username,String description,LocalDate targetDate,Boolean done ) 
	{
		Todo todo=new Todo(++todoCount, username, description, targetDate, false);
		todos.add(todo); 
	}
	
}
