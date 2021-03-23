package com.naveen.spring;

import com.naveen.spring.dao.StudentDao;
import com.naveen.spring.dao.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentController {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean-cp.xml");
        StudentDao studentDao = (StudentDao) context.getBean(StudentDao.class);
        System.out.println("List Of Students :: ");
        for (StudentClass student: studentDao.getAll()){
            System.out.println(student);
        }
        StudentClass studentClass = new StudentClass(5,"joy","jok",27,"Ruby");
        System.out.println(studentClass);
        studentDao.saveStudent(studentClass);
        System.out.println("Student is Saved in DataBase Successfully..." +studentClass);


    }
}
