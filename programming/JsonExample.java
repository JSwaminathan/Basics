package programming;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jaa.schoolmgmt.Student;

public class JsonExample {
		public static void main(String[] args) {
			ObjectMapper objectMapper = new ObjectMapper();

			String carJson =
			        "{ \"id\" : \"108\", \"email\" : \"jay@habitmirror.com\" }";
			Reader reader = new StringReader(carJson);
			

			try {
				Student student = objectMapper.readValue(reader, Student.class);
				System.out.println("Student: " + student.toString());
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
