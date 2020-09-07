package kr.ac.kopo.bookshop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.bookshop.model.Customer;
import kr.ac.kopo.bookshop.service.CustomerService;

// 스프링에게 나는 컨트롤러 역할을 할것이다 알려주는 어노테이션
// 메인페이지 보여주기 위한 컨트롤러

@Controller
// 슬래시는 절대경로로 루트 맨처음 맨처음을 여기서 처리한다는 의미
@RequestMapping("/")
public class RootController {

	@Autowired
	CustomerService service;

	@RequestMapping("/")

	// 인덱스라는 문자열을 리턴 인덱스.jsp라는 파일을 실행
	String index() {
		return "index";
	}

	@GetMapping("/login")
	String login() {
		return "login";
	}

	@PostMapping("/login")
	String login(Customer item, HttpSession session) {
		if (service.login(item)) {
			session.setAttribute("user", item);
			return "redirect:/";

		}
		return "login";

	}
	
	@RequestMapping("/logout")
	String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}
}