package kr.or.yi.mybatis_dev_sdj.dao;

import java.util.List;

import kr.or.yi.mybatis_dev_sdj.dto.Student;

public interface StudentMapper {
	Student selectStudentbyNo(Student student);
	List<Student> selectStudentByAll();
	int insertStudent(Student student);
	int updateStudent(Student student);
	int deleteStudent(int id);
}
