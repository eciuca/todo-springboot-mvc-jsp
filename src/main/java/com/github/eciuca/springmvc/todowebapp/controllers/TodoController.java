package com.github.eciuca.springmvc.todowebapp.controllers;

import com.github.eciuca.springmvc.todowebapp.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping(value = {"/todos", "/index"}, method = RequestMethod.GET)
    public String showTodos(Model model) {
        model.addAttribute("todos", todoService.getAllTodos());

        return "todos";
    }

    @RequestMapping(value = {"/todos/new"}, method = RequestMethod.GET)
    public String createTodo() {
        todoService.createNewTodo();

        return "redirect:/todos";
    }

    @RequestMapping(value = {"/todos/{id}/delete"}, method = RequestMethod.GET)
    public String deleteTodo(@PathVariable int id) {
        todoService.deleteTodo(id);

        return "redirect:/todos";
    }
}
