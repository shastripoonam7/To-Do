package com.todo.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.demo.models.Task;

public interface TaskRepo extends JpaRepository<Task,Integer> {
	

}
