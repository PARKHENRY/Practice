package kr.ac.kopo.bookshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.bookshop.dao.BookDao;
import kr.ac.kopo.bookshop.model.Book;

// 북서비스 인터페이스를 구현할 클래스
// 이녀석이 서비스로서 역할을 할것이다 라고 할려주는 어노테이션
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookDao dao;

	@Override
	public List<Book> list() {
		// 서비스가 하는 일은 dao에다가 list메소드를 호출해요
		// 그럼 dao가 데이터베이스에서 도서목록을 가져옴
		// 그걸 리턴하면 컨트롤러가 받음
		return dao.list();
	}

	@Override
	public void delete(int bookid) {
		dao.delete(bookid);
	}

	@Override
	public void add(Book item) {
		dao.add(item);
	}

	@Override
	public Book Item(int bookid) {
		return dao.item(bookid);
	}

	@Override
	public void update(Book item) {
		dao.update(item);
	}

}
