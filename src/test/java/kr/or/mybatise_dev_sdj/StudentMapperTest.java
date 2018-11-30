package kr.or.mybatise_dev_sdj;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;


import kr.or.yi.mybatis_dev_sdj.dao.StudentMapper;
import kr.or.yi.mybatis_dev_sdj.dao.StudentMapperImpl;
import kr.or.yi.mybatis_dev_sdj.dto.Student;

public class StudentMapperTest extends AbstractTest {
	private static StudentMapper dao = new StudentMapperImpl();
	
	@Test
	public void test01selectStudentById() {
		log.debug("test01selectStudentById()");
		Student selectStd = new Student();
		selectStd.setStudId(1);
		
		Student std = dao.selectStudentById(selectStd);
		Assert.assertNotNull(std);
	}
	
	@Test
	public void test02selectStudentByAll() {
		log.debug("test02selectStudentByAll()");
		List<Student> lists = dao.selectStudentByAll();
		Assert.assertNotNull(lists);
	}
	@Test
	public void test03insertStudent() {
		log.debug("test03insertStudent()");
		
	}
}
