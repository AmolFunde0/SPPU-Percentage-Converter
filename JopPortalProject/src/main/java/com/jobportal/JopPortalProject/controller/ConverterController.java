package com.jobportal.JopPortalProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {

    //Home Page
    @RequestMapping({"/"})
    public String home(){
        return "index.html";
    }

    @GetMapping("/cgpa-to-percentage")
    public String showCgpaPage() {
        return "cgpa-to-percentage";
    }
    @GetMapping("/sgpa-to-percentage")
    public String showSgpaPage(){
        return  "sgpa-to-percentage";
    }

    //cgpa-to-percentage page
    @PostMapping("/cgpa-to-percentage")
    public String cgpaToPercentage(@RequestParam("cgpa") double cgpa, Model model){
        double percentage =(cgpa -0.75)*10;
       model.addAttribute("cgpa",cgpa);
        model.addAttribute("percentage",percentage);
        return "cgpa-to-percentage.html";
    }

    /*public String calculateCgpa(@RequestParam("cgpa") double cgpa, Model model) {
        double percentage = (cgpa - 0.75) * 10;
        model.addAttribute("cgpa", cgpa);
        model.addAttribute("percentage", percentage);
        return "cgpa-to-percentage";
    }*/

//sgpa-to-percentage Page
    @PostMapping("sgpa-to-percentage")
    public String sgpaToPercentage(@RequestParam("sgpa") double sgpa, Model model) {
        double percentage= (sgpa - 0.75) * 10;
    model.addAttribute("sgpa",sgpa);
    model.addAttribute("percentage",percentage);

        return "sgpa-to-percentage.html";
    }



}
