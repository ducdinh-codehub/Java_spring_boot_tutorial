/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Duc
 */

@RestController
public class webServiceController {
    
    @GetMapping("/rest")
    public String takeRest(){
        return "Rest is not necessary - Not a goal";
    }
    
}
