package com.saramrobot.jjamgong.model;

import java.util.List;

public class Question {
	public QuestionVO question;
	public List<AnswerVO> answers;
	
	public Question(QuestionVO question, List<AnswerVO> answers) {
		super();
		this.question = question;
		this.answers = answers;
	}
	
	public QuestionVO getQuestion() {
		return question;
	}
	public void setQuestion(QuestionVO question) {
		this.question = question;
	}
	public List<AnswerVO> getAnswers() {
		return answers;
	}
	public void setAnswers(List<AnswerVO> answers) {
		this.answers = answers;
	}
	
	
}
