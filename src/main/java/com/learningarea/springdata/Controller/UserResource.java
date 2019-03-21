package com.learningarea.springdata.Controller;

import com.learningarea.springdata.Model.User;
import com.learningarea.springdata.Repository.UserJpaRepositity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserJpaRepositity userJpaRepositity;

    @GetMapping("/all")
    public List<User> findAll() {
        return userJpaRepositity.findAll();
    }

    @GetMapping("/find/{name}")
    public User findUser(@PathVariable String name) {
        return userJpaRepositity.findByName(name);
    }

    @PostMapping("/load")
    public User loadUser(@RequestBody User user) {
        userJpaRepositity.save(user);
        return userJpaRepositity.findByName(user.getName());
    }
}
