package com.jaa.schoolmgmt.db;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBStudentManagementSystem {

	public List<Student> getAllStudents() throws IOException {

		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();

		// Retrieve all the students.

		List<Student> students = session.selectList("Student.getAll");

		session.commit();
		session.close();

		return (students);

	}

	public void createStudent() {

	}

	public void updatestudent() {

	}

	public void ListStudents() {

	}

	public void deleteStudent() {

	}
}