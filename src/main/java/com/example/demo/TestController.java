package com.example.demo;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path="/api")
public class TestController {
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello world!";
    }
    @GetMapping(path = "/heroes/{id}")
    public ResponseEntity<?> getHero(@PathVariable long id){
        System.out.println(id);
        return new ResponseEntity<>(new Hero(), HttpStatus.ACCEPTED);
    }


}