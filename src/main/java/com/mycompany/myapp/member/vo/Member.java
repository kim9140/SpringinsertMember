package com.mycompany.myapp.member.vo;

public class Member {
	private static final long serialVersionUID = 1111L; 
	private String MEMBER_ID;
	private String MEMBER_PWD;
	private String MEMBER_NM; 
	private String MEMBER_ENROLL_DT; 

	
	@Override
	public String toString() {
		return "Member [MEMBER_ID=" + MEMBER_ID + ", MEMBER_PWD=" + MEMBER_PWD + ", MEMBER_NM=" + MEMBER_NM
				+ ", MEMBER_ENROLL_DT=" + MEMBER_ENROLL_DT + "]";
	}


	public String getMEMBER_ID() {
		return MEMBER_ID;
	}


	public void setMEMBER_ID(String mEMBER_ID) {
		MEMBER_ID = mEMBER_ID;
	}


	public String getMEMBER_PWD() {
		return MEMBER_PWD;
	}


	public void setMEMBER_PWD(String mEMBER_PWD) {
		MEMBER_PWD = mEMBER_PWD;
	}


	public String getMEMBER_NM() {
		return MEMBER_NM;
	}


	public void setMEMBER_NM(String mEMBER_NM) {
		MEMBER_NM = mEMBER_NM;
	}


	public String getMEMBER_ENROLL_DT() {
		return MEMBER_ENROLL_DT;
	}


	public void setMEMBER_ENROLL_DT(String mEMBER_ENROLL_DT) {
		MEMBER_ENROLL_DT = mEMBER_ENROLL_DT;
	}


	public Member() {
		// TODO Auto-generated constructor stub
	}

}
