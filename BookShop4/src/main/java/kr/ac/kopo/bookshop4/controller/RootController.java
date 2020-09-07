package kr.ac.kopo.bookshop4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class RootController {
	
	@RequestMapping(value="/")
	String index() {
		return "index";
	}

}
