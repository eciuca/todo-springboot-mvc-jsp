package com.github.eciuca.springmvc.todowebapp.repositories;

import com.github.eciuca.springmvc.todowebapp.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
