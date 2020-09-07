package kr.ac.kopo.bookshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.kopo.bookshop.model.Book;
import kr.ac.kopo.bookshop.service.BookService;

@Controller
// 북으로 시작하면 내가 처리하겠다
// 서블릿 만들때 웹 서블릿에 uri를 기술해 봤습니다.
@RequestMapping("/book")

public class BookController {
	// 이전에 했던 jsp를 이용하기위해
	final String path = "book/";

	// 자동으로 묶어준다. 오토와이드
	@Autowired
	BookService service;
	// 북서비스를 미지 지정하지않고 나중에 바꿀수있도록

	// 리스트 uri에 대해서는 내가 처리하겠당
	@RequestMapping("/list")
	// 서블릿으로 리퀘스트겟 어트리뷰트 대신 모델이라는 곳에 담아 놓기만 하면 jsp에 그 정보를 전달할수 있음
	String list(Model model) {
		// 책 목록을 읽어오는 내용
		// 읽어온 리스트를 모델 애드 어트리뷰트해서 담습니다.
		List<Book> list = service.list();

		model.addAttribute("list", list);

		return path + "list";
	}

	@RequestMapping("/delete")
	String delete(int bookid) {
		// 서비스한테 딜리트 삭제를 해달라고 요청
		service.delete(bookid);

		// 삭제후 리스트로 다시 리턴하여 목록보여줘
		return "redirect:list";
	}

	// 애드랑 업데이트는 겟과 포스트 모두 사용하기때문에
	// 왜냐 uri이름을 줄이기 위해서
	
	// get에서는 입력폼을 보여주고
	// post에서는 입력을 처리함
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	String add() {
		return path + "add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	// 북 객체를 item파라메터에 전달 스프링이 자동으로해줌
	// 서비스로 데이터베이스에 기록하도록 요구
	String add(Book item) {
		service.add(item);
		return "redirect:list";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	String update(int bookid, Model model) {
		Book item = service.Item(bookid);
		model.addAttribute("item", item);
		return path + "update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	String update(Book item) {
		service.update(item);
		return "redirect:list";
	}

}
