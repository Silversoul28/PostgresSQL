package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.User;


@Controller
public class UsersController {
    @GetMapping("/users/view")
    public String getAllUsers(Model model){
        System.out.println("Getting all users");
        //TOD get all useres from database
        List<User> users = new ArrayList<>();
        users.add(new User("Brooklyn", "1234", 25));
        users.add(new User("aaa", "1111", 15));
        users.add(new User("bbb", "2222", 5));
        users.add(new User("ccc", "3333", 35));
        //end of database call
        model.addAttribute("us", users);
        return "users/showAll";
    }

}
