package kr.ac.kopo2.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo2.model.Book;

@Repository
public class BookDaoImpl implements BookDao {
	
	@Autowired
	SqlSession sql;

	@Override
	public List<Book> getlist() {
		return sql.selectList("book.getlist");
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
	public Book getitem(int bookid) {
		return sql.selectOne("book.getitem", bookid);
	}

	@Override
	public void update(Book item) {
		sql.update("book.update", item);
	}

}
