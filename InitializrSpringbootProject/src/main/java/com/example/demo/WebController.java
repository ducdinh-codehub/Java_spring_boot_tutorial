/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
/**
 *
 * @author Duc
 */
@Controller
public class WebController {
    @RequestMapping("/hello")
    public void sayHello(Model model){
        model.addAttribute("Message","Welcome to spring boot");
        System.out.println("Saying hello....");
    }
}
