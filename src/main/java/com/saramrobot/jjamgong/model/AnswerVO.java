package com.saramrobot.jjamgong.model;

public class AnswerVO {
	public int a_uid;
	public int a_questionnum;
	public String a_answer;
	public boolean a_rightanswer;
	
	public int getA_uid() {
		return a_uid;
	}
	public void setA_uid(int a_uid) {
		this.a_uid = a_uid;
	}
	public int getA_questionnum() {
		return a_questionnum;
	}
	public void setA_questionnum(int a_questionnum) {
		this.a_questionnum = a_questionnum;
	}

	public String getA_answer() {
		return a_answer;
	}
	public void setA_answer(String a_answer) {
		this.a_answer = a_answer;
	}
	public boolean isA_rightanswer() {
		return a_rightanswer;
	}
	public void setA_rightanswer(boolean a_rightanswer) {
		this.a_rightanswer = a_rightanswer;
	}

}
