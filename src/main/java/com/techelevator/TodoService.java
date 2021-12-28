package com.techelevator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.io.IOException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TodoService {

    RestTemplate rt = new RestTemplate();
    private final String API_URL = "https://jsonplaceholder.typicode.com/users/1/todos";

    public Todo getTodoById(int id) throws IOException {
        return rt.getForObject(API_URL + id, Todo.class);
    }

    final ObjectMapper mapper = new ObjectMapper();
    @PostConstruct
    public Map<String, String> getTodoList() throws JsonProcessingException {
        String json = "[{\"name\":\"mkyong\", \"age\":37}, {\"name\":\"fong\", \"age\":38}]";
        Map<String, String> td1 = mapper.readValue(json, HashMap.class);

        System.out.println(td1);
        return td1;
    }
}
