/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ErikLin
 */
@Controller
public class IndexController {


    @RequestMapping("/index")
    public String hello(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {

        model.addAttribute("name", name);
        
        //returns the view name
        //return "helloworld";
        return "index";
    }

}
