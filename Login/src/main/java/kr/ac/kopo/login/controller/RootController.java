package kr.ac.kopo.login.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {
	
	@RequestMapping("/")
	String index() {
		return "index";
	}
	
	@GetMapping("/login")
	String login() {
		return "login";
	}
	
	@PostMapping("/login")    /* 로그인된 사용자에게 공간을줘서 그사람이 장바구니에 뭘 넣었는지 등등 저장할수있음 */
	String login(String id, String passwd, HttpSession session) {
		
		if("abc".equals(id) && "1234".equals(passwd)) {
			session.setAttribute("id", id);
			session.setAttribute("role", "user");
		} else if("xyz".equals(id) && "5678".equals(passwd)) {
			session.setAttribute("id", id);
			session.setAttribute("role", "admin");
		}
		
		return "redirect:";
	}
	
	@RequestMapping("/logout")
	String logout(HttpSession session) {
		// 세션 무효화
		session.invalidate();
		
		return "redirect:";
	}
	
	@RequestMapping("/book/list")
	String book() {
		return "book"; 
	}
	
	@RequestMapping("/customer/list")
	String customer() {
		return "customer";
	}
	
	@RequestMapping("/orders/list")
	String orders() {
		return "orders";
	}
}
