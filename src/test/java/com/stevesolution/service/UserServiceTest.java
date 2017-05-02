package com.stevesolution.service;

import com.stevesolution.configuration.DBConfiguration;
import com.stevesolution.configuration.RootConfiguration;
import com.stevesolution.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by steve on 2017/5/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {DBConfiguration.class, RootConfiguration.class})
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void getUser() throws Exception {
    }

    @Test
    public void addUser() throws Exception {
        userService.addUser("steve", "22");
        userService.addUser("ivy", "22");
        userService.addUser("ivy", "22");
        userService.addUser("ivy", "22");
        userRepository.delete(userRepository.findOne(3));
        userService.addUser("ivy", "22");
        userService.addUser("ivy", "22");
        userRepository.findAll().forEach(System.out::println);
    }

}