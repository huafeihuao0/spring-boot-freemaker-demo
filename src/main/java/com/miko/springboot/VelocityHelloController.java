package com.miko.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Miro Kopecky (@miragemiko)
 * @since 07.11.2016
 */

@Controller
public class VelocityHelloController {

    @RequestMapping(value = "/velocity")
    public String test(Model model){
        System.out.println("Test");
        model.addAttribute("test", "Here is Velocity");
        return "test";
    }

}
