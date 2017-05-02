package com.stevesolution.service;

import com.google.common.collect.Lists;
import com.stevesolution.entity.User;
import com.stevesolution.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by steve on 2017/5/1.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(int id) {
        return userRepository.findOne(id);
    }

    public void addUser(String name, String age) {
        userRepository.save(new User(name, age));
    }

    public List<User> getUsers() {
        return Lists.newArrayList(userRepository.findAll());
    }
}
