package com.tutorials.jenkinsOne.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public ResponseEntity<?> getMessage(){
        return new ResponseEntity<>("Welcome to Jenkins", HttpStatus.OK);
    }
}
