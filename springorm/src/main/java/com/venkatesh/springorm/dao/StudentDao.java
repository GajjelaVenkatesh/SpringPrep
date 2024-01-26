package com.venkatesh.springorm.dao;
import java.util.*;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import com.venkatesh.springorm.entites.Student;


public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Student student) {
		Integer result = (Integer) hibernateTemplate.save(student);
		return result;
	}
	public Student getStudent(int studentId) {
		Student student=(Student)this.hibernateTemplate.get(Student.class,studentId);
		return student;
	}
	public List<Student> getAllStudents(){
		List<Student> students=this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	@Transactional
	public void deleteStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class,studentId);
		this.hibernateTemplate.delete(student);
	}
	@Transactional
	public void update(Student student) {
		this.hibernateTemplate.update(student);	
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
}
