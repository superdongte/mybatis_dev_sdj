package kr.or.yi.mybatis_dev_sdj.dao;

import org.apache.ibatis.annotations.Select;

import kr.or.yi.mybatis_dev_sdj.dto.Address;

public interface AddressMapper {
	@Select("Select ADDR_ID AS ADDRID, STREET, CITY, STATE, ZIP, COUNTRY FROM ADDRESSES WHERE ADDR_ID=#{id}")
	Address selectAddressById(int id);
}
