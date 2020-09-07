package kr.ac.kopo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo2.dao.BookDao;
import kr.ac.kopo2.model.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookDao dao;

	@Override
	public List<Book> getList() {
		return dao.getlist();
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
	public Book getItem(int bookid) {
		return dao.getitem(bookid);
	}

	@Override
	public void update(Book item) {
		dao.update(item);
	}

}
