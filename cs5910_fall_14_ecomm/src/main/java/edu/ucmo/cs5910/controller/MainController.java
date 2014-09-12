package edu.ucmo.cs5910.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class MainController {
 
        @RequestMapping(value= "/mainController", method = RequestMethod.GET)
        public String hello(ModelMap model) {
 
            model.addAttribute("name", "shopping cart!");
            return "welcome";
 
        }
        
         
    }