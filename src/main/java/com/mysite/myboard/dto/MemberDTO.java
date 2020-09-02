package com.mysite.myboard.dto;

public class MemberDTO {
	
	private int MEMBER_SEQ;
	private String MEMBER_ID;
	private String MEMBER_PW;
	private String MEMBER_NAME;
	private String MEMBER_MAIL;
	private String MEMBER_PHONE;
	public int getMEMBER_SEQ() {
		return MEMBER_SEQ;
	}
	public void setMEMBER_SEQ(int mEMBER_SEQ) {
		MEMBER_SEQ = mEMBER_SEQ;
	}
	public String getMEMBER_ID() {
		return MEMBER_ID;
	}
	public void setMEMBER_ID(String mEMBER_ID) {
		MEMBER_ID = mEMBER_ID;
	}
	public String getMEMBER_PW() {
		return MEMBER_PW;
	}
	public void setMEMBER_PW(String mEMBER_PW) {
		MEMBER_PW = mEMBER_PW;
	}
	public String getMEMBER_NAME() {
		return MEMBER_NAME;
	}
	public void setMEMBER_NAME(String mEMBER_NAME) {
		MEMBER_NAME = mEMBER_NAME;
	}
	public String getMEMBER_MAIL() {
		return MEMBER_MAIL;
	}
	public void setMEMBER_MAIL(String mEMBER_MAIL) {
		MEMBER_MAIL = mEMBER_MAIL;
	}
	public String getMEMBER_PHONE() {
		return MEMBER_PHONE;
	}
	public void setMEMBER_PHONE(String mEMBER_PHONE) {
		MEMBER_PHONE = mEMBER_PHONE;
	}
	
}
