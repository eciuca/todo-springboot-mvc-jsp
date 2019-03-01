package com.github.eciuca.springmvc.todowebapp.services;


import com.github.eciuca.springmvc.todowebapp.model.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> getAllTodos();

    void deleteTodo(long id);

    Todo createNewTodo();
}
