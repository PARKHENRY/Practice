package kr.ac.kopo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.kopo2.model.Book;
import kr.ac.kopo2.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	final String path = "book/";

	@Autowired
	BookService service;

	@RequestMapping(value = "/list")
	String list(Model model) {
		List<Book> list = service.getList();
		model.addAttribute("list", list);
		return path + "list";
	}

	@RequestMapping(value = "/delete")
	String delete(int bookid) {
		service.delete(bookid);
		return "redirect:list";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	String add() {
		return path + "add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	String add(Book item) {
		service.add(item);
		return "redirect:list";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	String update(int bookid, Model model) {
		Book item = service.getItem(bookid);
		model.addAttribute("item", item);
		return path + "update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	String update(Book item) {
		service.update(item);
		return "redirect:list";
	}
}
