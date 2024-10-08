package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started..." );
        //spring jdbc => JdbcTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        Student student = new Student();
        student.setStudentId(200);
        student.setName("Kumarika");
        student.setAddress("Mandari");
        
        int result = studentDao.insert(student);
        
        System.out.println("student added"+result);
    }
}
