package programming;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class DBStudentManagementSystem {
	public static void main(String[] args) throws IOException {
		DBStudentManagementSystem db = new DBStudentManagementSystem();
		List<Student> students = db.getAllStudents();
		for (Student st : students) {
			System.out.println("id   " + st.getId());
			System.out.println("name " + st.getName());
			System.out.println("mail id  " + st.getEmail());
			System.out.println("phone  " + st.getPhone());
		}

		}
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
	public void Createstudents () {
		
		
	}
	
	public void Updatestudents() {
		
	}
	public void listStudents() {
		
	}
	public void deleteStudents() {
		
	}
}