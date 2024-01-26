package com.venkatesh.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.venkatesh.entities.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	// insert
	public int insert(Student student) {
		String query = "insert into Student(id, name, city) values(?, ?, ?)";
		int res = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return res;
	}

	// update
	public int update(Student student) {
		String query = "update Student set name=?, city=? where id=?";
		int res = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return res;
	}

	// delete
	public int delete(int studentId) {
		String query = "delete from student where id=?";
		int res = this.jdbcTemplate.update(query, studentId);
		return res;
	}

	// get single row
	public Student getRow(int studentId) {
		String query = "select * from student where id=?";
//		RowMapper rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, new RowMapperImp(), studentId);
		return student;
	}

	// get multiplerows
	public List<Student> getAll() {
		String query = "select * from student";
		List<Student> st = this.jdbcTemplate.query(query, new RowMapperImp());
		return st;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
