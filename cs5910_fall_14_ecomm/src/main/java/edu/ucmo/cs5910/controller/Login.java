package edu.ucmo.cs5910.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/login")
public class Login {
 
        @RequestMapping(method = RequestMethod.GET)
        public String hello(ModelMap model) {

            return "login";
 
        }
        
        @RequestMapping(method = RequestMethod.POST)
        public String postMethod(ModelMap model) {
 
            return "login";
 
        }
         
    }