package com.vti.entity;

public class Answer {
	// id
	private int id;
	// name Answer
	private String name;
	// Question
	private Question question;
	// đúng hay sai
	private Boolean isCorrect;
	
	// set giá trị id
	public void setId(int id) {
		this.id = id;
	}
	
	// trả về id answer
	public int getId() {
		return id;
	}
	
	
	// set tên của Answer
	
	public void setName(String name) {
		this.name = name;
	}
	
	// trả về giá trị name
	public String getName() {
		return name;
	}
	
	// set giá trị Question
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	// get Question
	public Question getQuestion() {
		return question;
	}
	
	
	// câu trả lời
	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	public Boolean getIsCorrect() {
		return isCorrect;
	}
	
	
	
}

