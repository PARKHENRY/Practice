package kr.ac.kopo2.service;

import java.util.List;

import kr.ac.kopo2.model.Book;

public interface BookService {

	List<Book> getList();

	void delete(int bookid);

	void add(Book item);

	Book getItem(int bookid);

	void update(Book item);

}
