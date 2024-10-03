package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	
    private JdbcTemplate jdbcTemplate;
    
	public int insert(Student student) {
		// insert query
        String query = "insert into student(studentId, name, address) values(?, ?, ?)";
        int r = this.jdbcTemplate.update(query, student.getStudentId(), student.getName(), student.getAddress());
		return r;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
