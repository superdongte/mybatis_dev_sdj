package kr.or.yi.mybatis_dev_sdj.dao;

import java.util.List;
import java.util.Map;

import kr.or.yi.mybatis_dev_sdj.dto.Student;

public interface StudentMapper {
	Student selectStudentbyNo(Student student);
	List<Student> selectStudentByAll();
	int insertStudent(Student student);
	int updateStudent(Student student);
	int deleteStudent(int id);
	
	//resultMap
	List<Student>selectStudentByAllForResultMap();
	//hasMap
	List<Map<String, Object>> selectStudentByAllHashMap();
	
	//resultMap Extends
	Student selectStudentByNoForResultMapExtends(Student student);
	Student selectStucentByNoForResultMapExtends2(int studId);
	
}
