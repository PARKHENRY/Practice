package kr.ac.kopo.bookshop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kr.ac.kopo.bookshop.model.Book;
import kr.ac.kopo.bookshop.util.Pager;

@Repository
public class BookDaoImpl implements BookDao {

	List<Book> list;

	// 생성자로 초기화
	public BookDaoImpl() {
		list = new ArrayList<Book>();

		for (int index = 1; index <= 10; index++) {
			Book book = new Book();
			book.setBookid(index);
			book.setBookname("도서명" + index);
			book.setPublisher("출판사" + index);
			book.setPrice(1000 * index);
			list.add(book);
		}
	}

	@Override
	public List<Book> list(Pager pager) {
		return list;
	}

	@Override
	public void add(Book item) {
		list.add(item);
	}

	@Override
	public void delete(int bookid) {
		for (Book item : list) {
			if (item.getBookid() == bookid) {
				list.remove(item);
				break;
			}
		}
	}

	@Override
	public Book item(int bookid) {

		for (Book item : list) {
			if (item.getBookid() == bookid) {
				return item;
			}
		}

		return null;
	}

	@Override
	public void update(Book item) {

		int bookid = item.getBookid();
		for (Book book : list) {
			if (book.getBookid() == bookid) {
				book.setBookname(item.getBookname());
				book.setPublisher(item.getPublisher());
				book.setPrice(item.getPrice());
			}
		}

	}

	@Override
	public int total(Pager pager) {
		return list.size();
	}

}
