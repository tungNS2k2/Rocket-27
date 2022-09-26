package com.vti.entity;

public class ExamQuestion {
	private Exam exam;
	private Question question;
	
	
	// set exam for examQuestion
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	// get exam for examQuestion
	public Exam getExam() {
		return exam;
	}
	// set Question
	
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	// get question
	public Question getQuestion() {
		return question;
	}
}
