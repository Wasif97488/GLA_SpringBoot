package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import Entity.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setSid(rs.getInt("sid"));
		           s.setName(rs.getString("name"));
		           s.setSubject(rs.getString("subject"));;
		return s;
	}

}
