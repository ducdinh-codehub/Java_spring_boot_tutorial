/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Duc
 */
@Controller
public class WebMeController {
    @RequestMapping("/me")
    public void clickMe(){
        System.out.println("Click me activation");
    }
    /*
    public String clickMe(){
        return "Click me activation";
    }*/
}
