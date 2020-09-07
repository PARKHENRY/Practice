package kr.ac.kopo.bookshop4.service;

import java.awt.print.Book;
import java.util.List;

public interface BookService {

	List<Book> getList();

	void delete(int bookid);

	void add(Book item);

	Book getItem(int bookid);

	void update(Book item);

}
