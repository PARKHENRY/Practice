package kr.ac.kopo.bookshop4.dao;

import java.awt.print.Book;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
	
	@Autowired
	SqlSession sql;
	
	@Override
	public List<Book> getlist() {
		return sql.selectList("book.getList");
	}

	@Override
	public void delete(int bookid) {
		sql.delete("book.delete", bookid);
	}

	@Override
	public void add(Book item) {
		sql.insert("book.add", item);
	}

	@Override
	public Book getItem(int bookid) {
		return sql.selectOne("book.getItem", bookid);
	}

	@Override
	public void update(Book item) {
		sql.update("book.update", item);
	}

}
