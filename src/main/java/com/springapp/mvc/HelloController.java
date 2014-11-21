package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("lesson", new Lesson());
        model.addAttribute("courses", new CourseRepository().getCourses());
        model.addAttribute("multiModel", new MultiModel());
        model.addAttribute("options", new CourseRepository().getOptions());
        return "hello";
    }

    @RequestMapping(value = "/addLesson", method = RequestMethod.POST)
    public String add(@ModelAttribute("lesson")   Lesson lesson, BindingResult result, ModelMap modelMap) {
        modelMap.addAttribute("error", result.getAllErrors());
        System.out.println(lesson);

        return "redirect:/";
    }

    @RequestMapping(value = "/addOptions", method = RequestMethod.POST)
    public String add(@ModelAttribute("list")   MultiModel multiModel, BindingResult result, ModelMap modelMap) {
        modelMap.addAttribute("error", result.getAllErrors());
        System.out.println(multiModel);

        return "redirect:/";
    }
}