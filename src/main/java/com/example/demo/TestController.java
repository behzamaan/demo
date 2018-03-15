package com.example.demo;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping(path = "/api/heroes")
public class TestController {
    @GetMapping(path = "")
    public ResponseEntity<List<Hero>> init() {
        Hero mohamad = new Hero();
        mohamad.setId(1L);
        mohamad.setName("mohmad");
        Hero hoda = new Hero();
        hoda.setId(2L);
        hoda.setName("mohamad");
        ArrayList<Hero> list = new ArrayList<>();
        list.add(mohamad);
        list.add(hoda);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getHero(@PathVariable long id) {
        System.out.println(id);
        return new ResponseEntity<>(new Hero(), HttpStatus.OK);
    }
}