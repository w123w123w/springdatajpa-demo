package com.wulianfa.springdatajpademo;

import com.wulianfa.springdatajpademo.model.User;
import com.wulianfa.springdatajpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringdatajpaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdatajpaDemoApplication.class, args);
    }

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public Page<User> findAll() {
        return userService.findAll(0, 3);
    }

}
