package kr.ac.kopo.bookshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.bookshop.model.Book;
import kr.ac.kopo.bookshop.service.BookService;
import kr.ac.kopo.bookshop.util.Pager;

@Controller
@RequestMapping("/book")
public class BookController {
	
	final String path = "book/";

	@Autowired
	BookService service;

	// /book/list로 결합된구조라 밑에는 리스트만 적음 북빼고
	@RequestMapping("/list")

	// 스프링한테 리턴할수 있는건 스트링밖에없음
	// 종속성을 최대한 떨어트리기 위해서 
	// 파라메터 스프링이 나를 호출할떄 넘겨주는값
	// 텅빈 모델을 만들어서 호출할때 리스트를 담아서 넘겨줌
	// 최종적으로 뷰로 출력해서 보여줌
	
	String list(Model model, Pager pager) {
		List<Book> list = service.list(pager);
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
	
	// 밸류써주는이유 메소드값을 구분해야되서
	
	// add라고 접속해와서 add.jsp를 불러옴
	@GetMapping("/add")
	String add() {
		return path + "add";
	}
	
	// add.jsp 등록버튼을 누르면 포스트로와서 여기서처리
	// Book item을 보고 스프링은 객체를 새로만들고
	// 클라이언트가 보내준 리퀘스트 값을 확인후
	// 셋 ~~~ 값을 넘겨줌 북객체를 서비스한테 넘겨주고
	@PostMapping("/add")
	String add(Book item) {
		service.add(item);
		
		return "redirect:list";
	}
	
	@RequestMapping("/{bookid}/delete")
	String delete(@PathVariable int bookid) {
		service.delete(bookid);
		
		return "redirect:../list";
	}
	
	@GetMapping("/{bookid}/update")
	String update(@PathVariable int bookid, Model model) {
		Book item = service.item(bookid);
		
		model.addAttribute("item", item);
		
		return path + "update";
	}
	
	@PostMapping("/{bookid}/update")
	String update(@PathVariable int bookid, Book item) {
		item.setBookid(bookid);
		
		service.update(item);
		
		return "redirect:../list";
	}
	
}
