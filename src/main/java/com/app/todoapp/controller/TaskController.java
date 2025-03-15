package com.app.todoapp.controller;

import com.app.todoapp.models.Task;  // ✅ Correct import for your Task model
import com.app.todoapp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;  // ✅ Correct import for List

@Controller
//@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping  // ✅ Added route mapping for '/tasks'
    public String getTask(Model model) {
        List<Task> tasks = taskService.getAllTasks();  // ✅ Corrected variable declaration
        model.addAttribute("tasks", tasks);
        return "tasks";  // ✅ Ensure there's a 'tasks.html' in your templates folder
    }


    @PostMapping
    public String createTask(@RequestParam String title){
       taskService.createTask(title);
        return "redirect:/";
    }


    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id){
        taskService.toggleTask(id);
        return "redirect:/";
    }
}
