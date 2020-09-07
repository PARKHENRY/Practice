package kr.ac.kopo.bookshop4.dao;

import java.awt.print.Book;
import java.util.List;

public interface BookDao {

	List<Book> getlist();

	void delete(int bookid);

	void add(Book item);

	Book getItem(int bookid);

	void update(Book item);

}
