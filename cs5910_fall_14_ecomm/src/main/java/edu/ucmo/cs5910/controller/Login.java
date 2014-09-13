package edu.ucmo.cs5910.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
@RequestMapping("/login")
public class Login {
 
        @RequestMapping(method = RequestMethod.GET)
        public String hello(ModelMap model) {

            return "login";
 
        }
        
        @RequestMapping(method = RequestMethod.POST)
        public String postMethod(@RequestParam("username") String username,ModelMap model) {
        	
        	model.addAttribute("username", username);
            return "login";
 
        }
         
    }