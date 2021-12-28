package com.techelevator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ApiPracticeApplication {

	public static void main(String[] args){
		SpringApplication.run(ApiPracticeApplication.class, args);

	}

//	@PostConstruct
//	public void getTodoList() throws JsonProcessingException {
//		ObjectMapper mapper = new ObjectMapper();
//		String json = "{\"name\":\"mkyong\", \"age\":\"37\"}";
//		try{
//			Map<String, String> map = mapper.readValue(json, HashMap.class);
//			System.out.println(map);
//		}catch(IOException e){
//			System.out.println("error");
//		}
//
//	}

}
