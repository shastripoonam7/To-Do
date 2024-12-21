package com.todo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.todo.demo.exception.InvalidDetailsException;
import com.todo.demo.models.Task;
import com.todo.demo.services.TaskService;

@Controller
public class DetailsController {
	
	@Autowired
	TaskService service;
	
	@Autowired
	Task task;

	@GetMapping("/")
	public String showForm() {
		return "form";
	}
	
	@PostMapping("/submitDetails")
	public String submitDetails(@RequestParam("name") String name, @RequestParam("description") String description,Model model) throws InvalidDetailsException {
		task.setTaskName(name);
		task.setDescription(description);
		service.save(task);
		
		model.addAttribute("name",name);
		model.addAttribute("description",description);
		return "result";
	}
}
