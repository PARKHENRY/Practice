package kr.ac.kopo.bookshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.bookshop.model.Book;

// 저장소라는 어노테이션
@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Book> list() {
		// 쿼리문을 지정하는것        namespace.id
		// 마이바티스가 이걸 데이터베이스한테 읽어서
		// dao한테 주면 dao는 이걸 서비스한테주고
		// 서비스는 다시 컨트롤러한테주고
		// 컨트롤러는 그걸다시 jsp한테 줘서 화면을 구성
		return sql.selectList("book.list");
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
	public Book item(int bookid) {
		return sql.selectOne("book.item", bookid);
	}

	@Override
	public void update(Book item) {
		sql.update("book.update", item);
	}

}
