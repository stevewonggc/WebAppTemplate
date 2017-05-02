package com.stevesolution.controller;

import com.stevesolution.entity.User;
import com.stevesolution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by steve on 2017/4/25.
 */
@RestController
@RequestMapping("sample")
public class SampleController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getSample(ModelMap modelMap) {
        modelMap.addAttribute("author", "Steve Wang");
        return "sample";
    }

    @RequestMapping(value = "abcd", method = RequestMethod.GET)
    public ModelAndView abcd(ModelMap modelMap) {
        return new ModelAndView("index");
    }

    @GetMapping(path = "user")
    @ResponseBody
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
