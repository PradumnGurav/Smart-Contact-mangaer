package com.scm.scm2.O.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name","Pradumn");
        model.addAttribute("College","MIT");
        model.addAttribute("Phone","5637278293");
        model.addAttribute("Link","https://leetcode.com/u/Pradumn_Gurav/");
        System.out.println("Home page handler");
      return "home";
    }
// about page
@RequestMapping("/about")
public String aboutPage(){
  System.out.println("About Page Handler");
  return "about";
}
}
