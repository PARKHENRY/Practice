package kr.ac.kopo.bookshop.service;

import java.util.List;

import kr.ac.kopo.bookshop.model.Book;
import kr.ac.kopo.bookshop.util.Pager;

// 이 인터페이스를 구현할 클래스를 만ㄷ르어줘야함
public interface BookService {

	List<Book> list(Pager pager);

	void delete(int bookid);

	void add(Book item);

	Book Item(int bookid);

	void update(Book item);

	void dummy();

	void init();

}
