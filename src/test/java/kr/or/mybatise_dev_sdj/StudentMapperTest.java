package kr.or.mybatise_dev_sdj;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.mybatis_dev_sdj.dao.StudentMapper;
import kr.or.yi.mybatis_dev_sdj.dao.StudentMapperImpl;
import kr.or.yi.mybatis_dev_sdj.dto.PhoneNumber;
import kr.or.yi.mybatis_dev_sdj.dto.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentMapperTest extends AbstractTest {
	private StudentMapper dao = new StudentMapperImpl();
	
	@Test
	public void test01selectStudentbyNo() {
		log.debug("test01selectStudentbyNo()");
		Student searchStd = new Student();
		searchStd.setStudId(1);
		
		Student searchedStd = dao.selectStudentbyNo(searchStd);
		Assert.assertNotNull(searchedStd);
	}
	@Test
	public void test02selectStudentByAll() {
		log.debug("test02selectStudentByAll()");
		List<Student> list =dao.selectStudentByAll();
		Assert.assertNotNull(list);
	}
	@Test
	public void test03insertStudent() {
		log.debug("test03insertStudent()");
		Calendar newDate = GregorianCalendar.getInstance();
		Student student = new Student();
		student.setStudId(3);
		student.setName("kimgay");
		student.setEmail("kim@naver.com");
		student.setPhone(new PhoneNumber("010-2343-5453"));
		student.setDob(newDate.getTime());
		int res = dao.insertStudent(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void test04updateStudent() {
		log.debug("test04updateStudent()");
		Calendar newDate = GregorianCalendar.getInstance();
		Student student = new Student();
		student.setStudId(3);
		student.setName("hotGay");
		student.setEmail("gayking@naver.com");
		student.setPhone(new PhoneNumber("010-4534-3543"));
		newDate.set(2006,3,15);
		int res = dao.updateStudent(student);
		Assert.assertSame(1, res);
	}
	@Test
	public void test05deleteStudent() {
		log.debug("test05deleteStudent()");
		int deleteStudent = dao.deleteStudent(3);
		Assert.assertSame(1, deleteStudent);		
	}
	@Test
	public void test06selectStudentByAllForResultMap() {
		log.debug("selectStudentByAllForResultMap()");
		List<Student>list = dao.selectStudentByAllForResultMap();
		Assert.assertNotNull(list);
	}
	@Test
	public void test08selectStudentByNoForResultMapExtends() {
		Student student = new Student();
		student.setStudId(1);
		Student exeStd = dao.selectStudentByNoForResultMapExtends(student);
		Assert.assertNotNull(exeStd);
	}
	@Test
	public void test09selectStudentByNoForResultMapExtends2() {
		Student lists = dao.selectStucentByNoForResultMapExtends2(1);
		Assert.assertNotNull(lists);
	}
	@Test
	public void test10selectStudentByNoAssociation() {
		Student student = new Student();
		student.setStudId(1);
		
		Student serchStded = dao.selectStudentByAssociation(student);
		Assert.assertNotNull(serchStded);
	}
}//end of class
