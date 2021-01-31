package com.swlc.gadget.controller;

import com.swlc.gadget.dto.User;
import com.swlc.gadget.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public  User registerNewUser(@RequestBody User user){
        return userService.registerNewUser(user);
    }

    @PatchMapping
    public User updateUserProfile(@RequestBody User user){
        return  userService.updateUserProfile(user);
    }

    @GetMapping(path = "/deactive/{user_id}")
    public Boolean deactiveUserProfile(@PathVariable(name = "user_id") int userId){
        return userService.deactiveUserProfile(userId);
    }
}
