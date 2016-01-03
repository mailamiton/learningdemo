package com.np.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class initController {
	
	@RequestMapping("/demo")
    public ModelAndView printAppName() {
		String demoMsg = "Test Demo";
		ModelAndView modelAndView = new ModelAndView("demo");
		modelAndView.addObject("message", demoMsg);
          return modelAndView;
    }

}
