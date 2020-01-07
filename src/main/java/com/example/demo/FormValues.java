package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormValues {
    @GetMapping("/employee form")
    public String loadFormPage(Model model){
        model.addAttribute("employee", new Employee());
        return "employee form";
    }
    @PostMapping("/employee form")
    public String loadFromPage(@ModelAttribute Employee employee, Model model){
        model.addAttribute("employee", employee);
        return "confirmemployee";
    }
}
