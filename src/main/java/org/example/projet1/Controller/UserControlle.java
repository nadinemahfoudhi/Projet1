package org.example.projet1.Controller;


import org.example.projet1.Entities.User;
import org.example.projet1.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControlle {

    @Autowired
    UserService userService;


    @PostMapping("/AddUser")
    public User AddUser(@RequestBody User user) {
        return userService.AddUser(user);
    }

    @GetMapping("/GetUsers")
    public List<User> getAllUsers() {
        return userService.GetUsers();
    }
}
