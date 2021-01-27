package com.javaex.jdbc.mariadb;

import java.util.Date;

//	자바 클래스간 데이터 전송용 객체 
//	DTO(VO)라고 한다
public class GuestbookVo {
	//	필드들
	private Long no;
	private String name;
	private String password;
	private String message;
	private Date regDate;
	
	//	생성자 
	public GuestbookVo() {	
	}

	public GuestbookVo(Long no, String name, String password, String message, Date regDate) {
		super();
		this.no = no;
		this.name = name;
		this.password = password;
		this.message = message;
		this.regDate = regDate;
	}

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	//	toString
	@Override
	public String toString() {
		return "GuestbookVo [no=" + no + ", name=" + name + ", password=" + password + ", message=" + message
				+ ", regDate=" + regDate + "]";
	}
}
