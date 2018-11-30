package kr.or.yi.mybatis_dev_sdj.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import kr.or.yi.mybatis_dev_sdj.dto.PhoneNumber;

public class PhoneTypehandler extends BaseTypeHandler<PhoneNumber>{

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, PhoneNumber parameter, JdbcType jdbcType)
			throws SQLException {
		// TODO Auto-generated method stub
		ps.setString(i, parameter.toString()); //phoneNumber의 오버라이딩
	}

	@Override
	public PhoneNumber getNullableResult(ResultSet rs, String columnName) throws SQLException {
		// TODO Auto-generated method stub
		return new PhoneNumber(rs.getString(columnName));
	}

	@Override
	public PhoneNumber getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return new PhoneNumber(rs.getString(columnIndex));
	}

	@Override
	public PhoneNumber getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return new PhoneNumber(cs.getString(columnIndex));
	}

}
