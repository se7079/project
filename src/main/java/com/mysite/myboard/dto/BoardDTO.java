package com.mysite.myboard.dto;

import java.sql.Date;

public class BoardDTO {
	
	private int BOARD_SEQ;
	private int BOARD_RE_REF;
	private int BOARD_RE_LEV;
	private int BOARD_RE_SEQ;
	private String BOARD_WRITER;
	private String BOARD_SUBJECT;
	private String BOARD_CONTENT;
	private int BOARD_HITS;
	private boolean DEL_YN;
	private String INS_USER_ID;
	private Date INS_DATE;
	private String UPD_USER_ID;
	private Date UPD_DATE;
	public int getBOARD_SEQ() {
		return BOARD_SEQ;
	}
	public void setBOARD_SEQ(int bOARD_SEQ) {
		BOARD_SEQ = bOARD_SEQ;
	}
	public int getBOARD_RE_REF() {
		return BOARD_RE_REF;
	}
	public void setBOARD_RE_REF(int bOARD_RE_REF) {
		BOARD_RE_REF = bOARD_RE_REF;
	}
	public int getBOARD_RE_LEV() {
		return BOARD_RE_LEV;
	}
	public void setBOARD_RE_LEV(int bOARD_RE_LEV) {
		BOARD_RE_LEV = bOARD_RE_LEV;
	}
	public int getBOARD_RE_SEQ() {
		return BOARD_RE_SEQ;
	}
	public void setBOARD_RE_SEQ(int bOARD_RE_SEQ) {
		BOARD_RE_SEQ = bOARD_RE_SEQ;
	}
	public String getBOARD_WRITER() {
		return BOARD_WRITER;
	}
	public void setBOARD_WRITER(String bOARD_WRITER) {
		BOARD_WRITER = bOARD_WRITER;
	}
	public String getBOARD_SUBJECT() {
		return BOARD_SUBJECT;
	}
	public void setBOARD_SUBJECT(String bOARD_SUBJECT) {
		BOARD_SUBJECT = bOARD_SUBJECT;
	}
	public String getBOARD_CONTENT() {
		return BOARD_CONTENT;
	}
	public void setBOARD_CONTENT(String bOARD_CONTENT) {
		BOARD_CONTENT = bOARD_CONTENT;
	}
	public int getBOARD_HITS() {
		return BOARD_HITS;
	}
	public void setBOARD_HITS(int bOARD_HITS) {
		BOARD_HITS = bOARD_HITS;
	}
	public boolean isDEL_YN() {
		return DEL_YN;
	}
	public void setDEL_YN(boolean dEL_YN) {
		DEL_YN = dEL_YN;
	}
	public String getINS_USER_ID() {
		return INS_USER_ID;
	}
	public void setINS_USER_ID(String iNS_USER_ID) {
		INS_USER_ID = iNS_USER_ID;
	}
	public Date getINS_DATE() {
		return INS_DATE;
	}
	public void setINS_DATE(Date iNS_DATE) {
		INS_DATE = iNS_DATE;
	}
	public String getUPD_USER_ID() {
		return UPD_USER_ID;
	}
	public void setUPD_USER_ID(String uPD_USER_ID) {
		UPD_USER_ID = uPD_USER_ID;
	}
	public Date getUPD_DATE() {
		return UPD_DATE;
	}
	public void setUPD_DATE(Date uPD_DATE) {
		UPD_DATE = uPD_DATE;
	}
}
