package com.myway.tok.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myway.tok.model.Student;

@Repository
public class MyBatisDaoImple implements MyBatisDao {

	@Autowired
	private SqlSession sqlSession;

	private static final String NAME_SPACE = "com.myway.tok.mybatis.mapper.MybatisMappper";

	@Override
	public List<Student> findAllStudent() {
		return sqlSession.selectList(NAME_SPACE + ".findAllStudent");
	}

}
