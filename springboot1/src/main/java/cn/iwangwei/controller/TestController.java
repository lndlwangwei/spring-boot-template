package cn.iwangwei.controller;

import cn.iwangwei.model.User;
import cn.iwangwei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    UserService userService;

    @GetMapping("/test")
    public String hello() {
        return "hello, this is wangwei's first springboot app";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAll();
    }
}
