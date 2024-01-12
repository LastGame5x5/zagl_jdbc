package com.example.demo;

import com.example.demo.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class MyController {

//    @PostMapping("/user")
//    public ResponseEntity<?> createUserTime (@RequestBody User user) {
//            if (user.getLogin() == null || user.getPassword() == null)
//                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Error user's login or password");
//            else
//            user.setDate(LocalDateTime.now());
//            return ResponseEntity.ok(user);
//        }
    @GetMapping("/users/select/{login}")
    public ResponseEntity<?> getSelect(@PathVariable String login){
        User user1 = DbFunctions.getUserByLogin(login);;
        return ResponseEntity.ok(user1);
    }
}
