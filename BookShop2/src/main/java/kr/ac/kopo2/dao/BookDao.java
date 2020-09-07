package kr.ac.kopo2.dao;

import java.util.List;

import kr.ac.kopo2.model.Book;

public interface BookDao {

	List<Book> getlist();

	void delete(int bookid);

	void add(Book item);

	Book getitem(int bookid);

	void update(Book item);

}
