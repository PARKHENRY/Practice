package com.myway.tok.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myway.tok.model.TokTok;

@Controller

public class MyController {
	@RequestMapping(value="/my/my_string", method=RequestMethod.GET)
	public String myString(Model model) {
		model.addAttribute("tok", new TokTok("my_string"));
		return "my/my_string";
	}
	
	@RequestMapping(value="/my/my_modelAndView", method=RequestMethod.GET)
	public ModelAndView myString() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("my/my_modelAndView");
		mav.addObject("tok", new TokTok("my_modelAndView"));
		return mav;
} 
}