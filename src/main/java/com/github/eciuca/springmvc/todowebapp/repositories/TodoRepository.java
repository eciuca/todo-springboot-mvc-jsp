package com.github.eciuca.springmvc.todowebapp.repositories;

import com.github.eciuca.springmvc.todowebapp.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, String> {
}
