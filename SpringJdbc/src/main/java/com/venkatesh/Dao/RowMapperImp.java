package com.venkatesh.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.venkatesh.entities.Student;

public class RowMapperImp implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st=new Student();
		st.setId(rs.getInt(1));
		st.setCity(rs.getString(3));
		st.setName(rs.getString(2));
		return st;
	}
}
