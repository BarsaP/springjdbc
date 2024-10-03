package com.spring.jdbc.dao;

//for the loose coupling 
import com.spring.jdbc.entities.Student;

public interface StudentDao {
   public int insert(Student student);
}
