package kr.or.yi.mybatis_dev_sdj.dto;

import org.apache.ibatis.type.Alias;

/**
 * @author lenovo
 *
 */
@Alias("PhoneNumber")
public class PhoneNumber {
	private String contrycode;
	private String stateCode;
	private String number;
	
	public PhoneNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhoneNumber(String contrycode, String stateCode, String number) {
		this.contrycode = contrycode;
		this.stateCode = stateCode;
		this.number = number;
	}
	/**
	 * @author str "000-0000-0000"
	 *
	 */ //문서화 코드
	public PhoneNumber(String str) {
		if(str != null) {
			 String[] parts = str.split("-");
			 if(parts.length > 0) this.contrycode = parts[0];
			 if(parts.length > 1) this.stateCode = parts[1];
			 if(parts.length > 2) this.number = parts[2];
		}
	}

	public String getContrycode() {
		return contrycode;
	}

	public void setContrycode(String contrycode) {
		this.contrycode = contrycode;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return String.format("%s-%s-%s", contrycode, stateCode, number);
	}
	
}
