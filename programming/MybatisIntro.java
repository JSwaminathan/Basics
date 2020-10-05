package programming;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.jaa.schoolmgmt.Student;

/**
 *  Mybatis basics - SELECT statement
 */
public class MybatisIntro {

	public static void main(String args[]) throws IOException {

		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();

		// Retrieve all the students.
		// This uses a pooled connection for the mysql database.
		List<Student> student = session.selectList("Student.getAll");

		for (Student st : student) {
			System.out.println(st.getId() + " Name: " + st.getName() + " " +
					                        " Email: " + st.getEmail() + " " +
					                        " Phone: " + st.getPhone());
	}
		System.out.println("Records Read Successfully ");
		session.commit();
		session.close();
	}

}
