package com.myway.tok.mybatis;

import java.util.List;

import com.myway.tok.model.Student;

public interface MyBatisDao {
	
	public List<Student> findAllStudent();

}
