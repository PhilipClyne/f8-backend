package springbootmongodb.service;


import java.util.List;

import springbootmongodb.exception.TodoCollectionException;
import springbootmongodb.model.TodoDTO;

public interface TodoService {
	
	public List<TodoDTO> getAllTodos();
	
	public TodoDTO getSingleTodo(String id) throws TodoCollectionException;
	
	public void createTodo(TodoDTO todo) throws TodoCollectionException;
	
	public void updateTodo(String id, TodoDTO todo) throws TodoCollectionException;
	
	public void deleteTodoById(String id) throws TodoCollectionException;
}