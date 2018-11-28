package kr.or.mybatise_dev_sdj;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import kr.or.yi.mybatis_dev_sdj.jdbc.MyBaisSqlSessionFactory;

public class MyBatisSqlSessionFactoryTest {

	private static final Log log = LogFactory.getLog(MyBatisSqlSessionFactoryTest.class);
	@Test
	public void test() {
		log.debug("testOpenSession()");
		
		SqlSession session = MyBaisSqlSessionFactory.openSession();
		log.debug("session "+session);
		Assert.assertNotNull(session);
	}

}
