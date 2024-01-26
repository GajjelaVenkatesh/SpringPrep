package com.venkatesh.SpringJdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.venkatesh.Dao.StudentDao;
import com.venkatesh.Dao.StudentDaoImpl;

@Configuration
public class Javaconfig {
	
	@Bean(name= {"drivermanager"})
	public DriverManagerDataSource getDriverManager() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setPassword("root");
		ds.setUsername("root");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDriverManager());
		return jdbcTemplate;
		
	}
	
	@Bean(name={"studentDao"})
	public StudentDao getStudentDao() {
		StudentDaoImpl studentDao=new StudentDaoImpl();
		studentDao.setJdbcTemplate(getTemplate());
		return studentDao;
		
	}
	

}
 