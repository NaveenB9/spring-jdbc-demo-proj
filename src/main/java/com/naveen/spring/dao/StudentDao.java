package com.naveen.spring.dao;

import com.naveen.spring.StudentClass;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDao {

    public void setDataSource(DataSource dataSource);

    public Boolean saveStudent(StudentClass student);

    public Boolean getById(Integer id);

    public List<StudentClass> getAll();

    public  Boolean update(StudentClass student);

    public  Boolean delete(StudentClass student);

    public void cleanup();


}
