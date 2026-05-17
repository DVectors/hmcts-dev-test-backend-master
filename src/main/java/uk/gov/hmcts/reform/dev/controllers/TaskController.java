package uk.gov.hmcts.reform.dev.controllers;

import static org.springframework.http.ResponseEntity.ok;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.gov.hmcts.reform.dev.models.TaskModel;
import uk.gov.hmcts.reform.dev.models.enums.TaskStatus;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @GetMapping(produces = "application/json")
    public ResponseEntity<String> getAllTasks() {
        return ok("This endpoint will return a list of tasks associated with the case.");
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<TaskModel> getTaskById(@PathVariable("id") Integer id) {
        return ok(new TaskModel(id, "Task Name", "Task Description", TaskStatus.IN_PROGRESS, "Task Assignee"));
    }
}
