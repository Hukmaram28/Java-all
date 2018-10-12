package com.stackroute.controller;

import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/")
    public String getLoginForm(ModelMap map) {
        return "loginForm";
    }

    @PostMapping("/submit")

    //public String submit(ModelMap map , @RequestParam Map<String,String> maps){

    public String submit(ModelMap map, @ModelAttribute("userDetails") User userDetails) {

        /*String userName = maps.get("userName");
      String userPassword = maps.get("userPassword");*/

        map.addAttribute("greetings", "welcome " + userDetails.getName() + " to stackroute");
        return "index";
    }
 /* @Autowired
  User user;*/
}