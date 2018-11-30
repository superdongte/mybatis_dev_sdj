package kr.or.yi.mybatis_dev_sdj.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_dev_sdj.dto.Student;
import kr.or.yi.mybatis_dev_sdj.jdbc.MyBaisSqlSessionFactory;

public class StudentMapperImpl implements StudentMapper {
	private static final String namespace = "kr.or.yi.mybatis_dev_sdj.dao.StudentMapper";
	
	@Override
	public Student selectStudentById(Student student) {
		try(SqlSession sqlSession = MyBaisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace + ".selectStudentById",student);
		}
	}

	@Override
	public List<Student> selectStudentByAll() {
		try(SqlSession sqlSession = MyBaisSqlSessionFactory.openSession()){
			return sqlSession.selectList(namespace + ".selectStudentByAll");
		}
		
	}

	@Override
	public int insertStudent(Student student) {
		try(SqlSession sqlSession = MyBaisSqlSessionFactory.openSession()){
			int res = sqlSession.insert(namespace + ".insertStudent", student);
			sqlSession.commit();
			return res;
		}
		
	}

	@Override
	public int updateStudent(Student student) {
		try(SqlSession sqlSession = MyBaisSqlSessionFactory.openSession()){
			int res = sqlSession.insert(namespace + ".updateStudent", student);
			sqlSession.commit();
			return res;
		}
	}
	
}
