package kr.or.yi.mybatis_dev_sdj.dto;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("Student")
public class Student {
	private int studId;
	private String name;
	private String email;
	private PhoneNumber phone;
	private Date dob;
	
	
	public int getStudId() {
		return studId;
	}


	public void setStudId(int studId) {
		this.studId = studId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public PhoneNumber getPhone() {
		return phone;
	}


	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return String.format("Student [%s, %s, %s, %s, %s]", studId, name, email, dob, phone);
	}
	
	
}
