package com.example.my_everything;

import com.example.my_everything.Request.CreateTaskRequest;
import com.example.my_everything.Request.UpdateTaskRequest;
import com.example.my_everything.Response.CreateTaskResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class MyEverythingApplication {

	private final List<CreateTaskResponse> tasks = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(MyEverythingApplication.class, args);
	}

	@GetMapping("/tasks")
	public List<CreateTaskResponse> getAllTasks(@RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "size") int size) {
		int assetsSize = tasks.size();

		int start = (page - 1) * size;
		int end = Math.min(start + size, assetsSize);

		if (start > assetsSize) {
			return new ArrayList<>();
		} else {
			return tasks.subList(start, end);
		}
	}

	@GetMapping("/tasks/{id}")
	public CreateTaskResponse getTaskById(@PathVariable("id") Long id) {
		for (CreateTaskResponse getTasksResponse : tasks) {
			if (id.equals(getTasksResponse.getId())) {
				return getTasksResponse;
			}
		}
		return null;
	}

	@PostMapping("/tasks")
	public ResponseEntity<CreateTaskResponse> createTask(@RequestBody CreateTaskRequest request) {
		CreateTaskResponse newTask = CreateTaskResponse.builder()
				.id((long) (tasks.size() + 1))
				.name(request.getName())
				.status(request.getStatus())
				.description(request.getDescription())
				.build();

		tasks.add(newTask);

		return new ResponseEntity<>(newTask, HttpStatus.CREATED);
	}

	@PatchMapping("/tasks/{id}")
	public ResponseEntity<CreateTaskResponse> updateTask(
			@RequestBody UpdateTaskRequest request,
			@PathVariable("id") Long id) {

		for (CreateTaskResponse task : tasks) {
			if (task.getId().equals(id)) {
				task.setName(request.getName());
				task.setStatus(request.getStatus());
				task.setDescription(request.getDescription());
				return new ResponseEntity<>(task, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/tasks/{id}")
	public ResponseEntity<List<CreateTaskResponse>> deleteTask(@PathVariable("id") Long id) {
		var i = 0;
		for (CreateTaskResponse task : tasks) {
			if (task.getId().equals(id)) {
				tasks.remove(i);
			}
			i++;
		}
		return new ResponseEntity<>(tasks, HttpStatus.OK);
	}
}
