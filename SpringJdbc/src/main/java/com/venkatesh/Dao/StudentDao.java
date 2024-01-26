package com.venkatesh.Dao;

import java.util.List;

import com.venkatesh.entities.Student;

public interface StudentDao {
	public  int insert(Student student);
	public int update(Student student);
	public int delete(int studentId);
	public Student getRow(int studentId);
	public List<Student> getAll();
}
