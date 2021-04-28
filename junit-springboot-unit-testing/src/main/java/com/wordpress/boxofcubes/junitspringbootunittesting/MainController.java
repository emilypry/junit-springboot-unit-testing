package com.wordpress.boxofcubes.junitspringbootunittesting;

import com.wordpress.boxofcubes.junitspringbootunittesting.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @GetMapping()
    public String home(){
        return "index";
    }

    @GetMapping("add")
    public String showAdd(Model model){
        model.addAttribute("person", new Person());
        return "add";
    }
    @PostMapping("add")
    public String processAdd(Person person, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "add";
        }
        return "redirect:";
    }

}
