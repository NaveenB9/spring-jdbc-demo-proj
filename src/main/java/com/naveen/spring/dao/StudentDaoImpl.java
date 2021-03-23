package com.naveen.spring.dao;

import com.naveen.spring.StudentClass;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentDaoImpl implements  StudentDao{

    private JdbcTemplate jdbcTemplate;
    @Override
    public void setDataSource(DataSource dataSource) {
            jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Boolean saveStudent(StudentClass student) {
        String sqlQuery = "INSERT INTO student (id, first_name, last_name, marks, technology) " +
                "VALUES(?, ?, ?, ?, ?)";
        Object[ ] args = new Object[]{student.getId(), student.getFirst_name(),
                student.getLast_name(), student.getMarks(), student.getTecnology()
        };

        return jdbcTemplate.update(sqlQuery,args) ==1;
    }

    @Override
    public Boolean getById(Integer id) {
        return null;
    }

    @Override
    public List<StudentClass> getAll() {
        String sqlQuery = "SELECT * FROM student";
        List<StudentClass> studentClassList = jdbcTemplate.query(sqlQuery,new StudentRowMapper());
        return studentClassList;
    }

    @Override
    public Boolean update(StudentClass student) {

        return null;
    }

    @Override
    public Boolean delete(StudentClass student) {
        return null;
    }

    @Override
    public void cleanup() {

    }
}
