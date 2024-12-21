package com.todo.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.demo.exception.InvalidDetailsException;
import com.todo.demo.models.Task;
import com.todo.demo.repos.TaskRepo;
import com.todo.demo.validation.StringValidation;

@Service
public class TaskService {
	
	@Autowired
	TaskRepo repo;
	
	@Autowired
	StringValidation stringValidation;
	
	public Task save(Task task) throws InvalidDetailsException {
		if(!stringValidation.validatateString(task.getTaskName()))
			throw new InvalidDetailsException("Task Name contains invalid characters!");
		repo.save(task);
		return task;
	}
	
	public List<Task> findAll(){
		return repo.findAll();
	}

}
