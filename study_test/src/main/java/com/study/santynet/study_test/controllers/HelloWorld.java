package com.study.santynet.study_test.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
    
@GetMapping
   public ResponseEntity<String> hello() {
       return new ResponseEntity<>("Hello World", HttpStatus.OK);
   }
}


