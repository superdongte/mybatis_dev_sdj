package kr.or.yi.mybatis_dev_sdj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.or.yi.mybatis_dev_sdj.dto.Student;

public interface StudentMapper {
	
	@Select("select stud_id, name, email, phone, dob from students where stud_id=#{studId}")
	Student selectStudentById(Student student);
	
	@Select("select stud_id, name, email, phone, dob from students")
	List<Student> selectStudentByAll();
	
	@Select("insert into Students(STUD_ID, name, email, phone, dob) values(#{studId},#{name},#{email},#{phone},#{dob})")
	int insertStudent(Student student);
	
	@Select("update students set name=#{name},Email=#{email},phone=#{phone} where Stud_id=#{studId}")
	int updateStudent(Student student);
}
