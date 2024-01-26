package com.venkatesh.SpringJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.venkatesh.entities.Student;
import com.venkatesh.Dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// spring jdbc requires jdbc template
		ApplicationContext con = new AnnotationConfigApplicationContext(Javaconfig.class);
		StudentDao studentDao = con.getBean("studentDao", StudentDao.class);

//    	//insert query
//    	String query="insert into Student(id,name,city) values(?,?,?)";
//    	
//    	
//    	//fire the query
//    	int res=template.update(query,59,"venkatesh","Nandigama");
//    	System.out.println(res);

		// update

//		Student st = new Student();
//		st.setId(6);
//		st.setCity("Tadepalligudem");
//		st.setName("hemasri");
//		int result=studentDao.update(st);
//		System.out.println(result);
		
//    	
//    	int result=studentDao.update(st);
//    	System.out.println("Number of records updated: " + result);

		// delete

//    	int result=studentDao.delete(2);
//    	System.out.println("deleted");
   	

		 //select
//    	Student st=studentDao.getRow(6);
//    	System.out.println(st);
    	

		// selecting multiple rows
		List<Student> students = studentDao.getAll();
		for (Student st : students) {
			System.out.println(st);
		}

	}
}
