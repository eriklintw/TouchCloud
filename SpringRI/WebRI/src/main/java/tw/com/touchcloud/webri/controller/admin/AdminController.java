/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.touchcloud.webri.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tw.com.touchcloud.webri.controller.BaseController;

/**
 *
 * @author ErikLin
 */
@Controller
public class AdminController extends BaseController{
    
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(ModelMap model) {
        model.addAttribute("pageTitle","Welcome to Admin Page.");
        model.addAttribute("user", getPrincipal());
        return "main";
    }
}
