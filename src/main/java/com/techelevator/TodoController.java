package com.techelevator;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class TodoController {

    @Autowired
    TodoService service;

    @RequestMapping(path="?id={id}", method = RequestMethod.GET)
    public Todo getTodoById(@PathVariable int id) throws IOException {
        return service.getTodoById(id);
    }

    @GetMapping("")
    public Map<String, String> getTodoList() throws JsonProcessingException {
        return service.getTodoList();
    }

}
