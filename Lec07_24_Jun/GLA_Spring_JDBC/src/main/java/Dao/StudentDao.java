package Dao;

import java.util.List;

import Entity.Student;

public interface StudentDao {
	
	public void insert(Student student);
	public void delete(Student student);
	public void update(Student student);
	public List<Student> findAllData();
	


}
