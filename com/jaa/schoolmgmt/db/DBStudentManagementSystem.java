package com.jaa.schoolmgmt.db;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.jaa.schoolmgmt.Student;

public class DBStudentManagementSystem {

	public List<Student> getAllStudents() {

		Reader reader;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
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

	public void updateStudent() {

	}

	public void deleteStudent() {

	}
}