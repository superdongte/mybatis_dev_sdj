package kr.or.yi.mybatis_dev_sdj.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
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
	
	@Select("delete from students where Stud_id = #{studId} ")
	int deleteStudent(int id);
	@Select("SELECT stud_id, name, email, phone, dob FROM STUDENTS")
	@Results(id ="studentResult", value= {
			@Result (id=true, column="stud_id", property="studId"),
			@Result (column="name", property="name"),
			@Result (column="email", property="email"),
			@Result (column="phone", property="phone"),
			@Result (column="dob", property="dob")
	})
	List<Student> selectStudentByAllForResults();

	@Results({
			@Result(id=true, column="stud_id", property="studId"),
			@Result(column="name", property="name"),
			@Result(column="email",property="email"),
			@Result(column="phone",property="phone"),
			@Result(column="dob", property="dob")
	})
	@ResultMap("studentResult")
	@Select("SELECT * FROM STUDENTS")
	List<Map<String, Object>> selectStudentByAllForResultsHashMap();

	@Select("SELECT stud_id, name, email, phone, dob FROM STUDENTS")
	@ResultMap("mappers.StudentMapper.StudentResult")
	List<Student> selectStudentByAllForMapper();
	
	@Select("SELECT * FROM STUDENTS WHERE STUD_ID=#{studId}")
	@Results({
		@Result(id=true, column="stud_id", property="studId"),
		@Result(column="name", property="name"),
		@Result(column="email", property="email"),
		@Result(column="addr_id", property="address",
			one=@One(select="kr.or.yi.mybatis_dev_sdj.dao.AddressMapper.selectAddressById"))
	})
	Student selectStudentOneToOne(int studId);
}//end of StudentMapper
