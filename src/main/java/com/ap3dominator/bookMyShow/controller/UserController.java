package com.ap3dominator.bookMyShow.controller;

import com.ap3dominator.bookMyShow.domain.User;
import com.ap3dominator.bookMyShow.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class UserController {

    @Autowired
    public UserRepository userRepository;

    @PostMapping("/AddUser")
    public ResponseEntity<?> AddUser(@RequestBody User user)
    {
        User addedUser = userRepository.save(user);
        return ResponseEntity.ok(addedUser);
    }

    @GetMapping("/GetAllUsers")
    public ResponseEntity<?> GetAllUsers()
    {
        var AllUsers = userRepository.findAllShows();
        return ResponseEntity.ok(AllUsers);
    }

}
