package com.venkatesh.springorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.venkatesh.springorm.dao.StudentDao;
import com.venkatesh.springorm.entites.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/venkatesh/springorm/config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {

			System.out.println("Press 1 for add new student");
			System.out.println("Press 2 for update student");
			System.out.println("Press 3 for delete a student");
			System.out.println("Press 4 for get an student");
			System.out.println("Press 5 for getting all students");
			System.out.println("press 6 for exit");

			try {
				int input = Integer.parseInt(br.readLine());

				switch (input) {

				case 1:
					// "Press 1 for add new student"

					int id = Integer.parseInt(br.readLine());
					String name = br.readLine();
					String city = br.readLine();

					Student st = new Student();
					st.setStudentId(id);
					st.setStudentCity(city);
					st.setStudentName(name);
					int r = studentDao.insert(st);
					System.out.println(r + " inserted");
					break;
				case 2:
					// "Press 2 for update student"

					int studentid = Integer.parseInt(br.readLine());
					Student studentToUpdate = studentDao.getStudent(studentid);
					String studentname = br.readLine();
					String studentcity = br.readLine();
					studentToUpdate.setStudentCity(studentcity);
					studentToUpdate.setStudentName(studentname);
					studentDao.update(studentToUpdate);
					System.out.println("Student with ID " + studentid + " updated successfully.");
					break;
				case 3:
					// "Press 3 for delete a student"
					int studentId=Integer.parseInt(br.readLine());
					studentDao.deleteStudent(studentId);
					System.out.println("Student with Id"+studentId+" deleted successfully");
					
					break;
				case 4:
					// "Press 4 for get an student"
					int getid=Integer.parseInt(br.readLine());
					Student sobj=studentDao.getStudent(getid);
					System.out.println(sobj.getStudentId());
					System.out.println(sobj.getStudentName());
					System.out.println(sobj.getStudentCity());
					
					
					break;
				case 5:
					
					// "Press 5 for getting all students
					
					List<Student> students=studentDao.getAllStudents();
					for(Student s:students) {
						System.out.println(s.getStudentId());
						System.out.println(s.getStudentName());
						System.out.println(s.getStudentCity());
					}
					
					break;
				case 6:
					go = false;
					break;
				}

			} catch (Exception e) {
				System.out.println("Invalid input");
			}

		}

	}
}
