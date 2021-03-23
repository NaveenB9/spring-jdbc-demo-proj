package com.naveen.spring.dao;

import com.naveen.spring.StudentClass;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<StudentClass> {
    @Override
    public StudentClass mapRow(ResultSet rs, int rownum) throws SQLException {
         StudentClass student = new StudentClass();
         student.setId(rs.getInt("id"));
         student.setFirst_name(rs.getString("first_name"));
         student.setLast_name(rs.getString("last_name"));
         student.setMarks(rs.getInt("marks"));
         student.setTecnology(rs.getString("technology"));

        return student;
    }
}
