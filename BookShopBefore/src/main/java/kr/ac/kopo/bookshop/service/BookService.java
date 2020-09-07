package kr.ac.kopo.bookshop.service;

import java.util.List;

import kr.ac.kopo.bookshop.model.Book;

// 이 인터페이스를 구현할 클래스를 만ㄷ르어줘야함
public interface BookService {

	List<Book> list();

	void delete(int bookid);

	void add(Book item);

	Book Item(int bookid);

	void update(Book item);

}
