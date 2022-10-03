package com.vti.entity;

import java.time.LocalDate;

import com.vti.backend.INews;

public class News implements INews {
	private int id;
	private String title;
	private LocalDate publishDate;
	private String author;
	private String content;
	private float averageRate;
	int []  rates;
	
	
	public News() {
		
	}
	
	
	public News(int id, String title, LocalDate publishDate, String author, String content, int[] rates) {
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.rates = rates;
	}
	
	// set id
	public void setId(int id) {
		this.id = id;
	}
	// get id
	public int getId() {
		return id;
	}
	
	
	// set title
	public void setTitle(String title) {
		this.title = title;
	}
	
	// get title
	public String getTitle() {
		return title;
	}
	
	
	// set dublishDate
	public void setDublishDate(LocalDate dublishDate) {
		this.publishDate = dublishDate;
	}
	
	// get dublishDate
	public LocalDate getDublishDate() {
		return publishDate;
	}
	
	// set author 
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// get author
	public String getAuthor() {
		return author;
	}
	
	
	// set content
	public void setContent(String content) {
		this.content = content;
	}
	
	// get content
	public String getContent() {
		return content;
	}
	
	
	// get averageRate
	public float getAverageRate() {
		return averageRate;
	}
	
	
	// set rate
	public void setRates(int[] rates) {
		this.rates = rates;
	}
	
//	get rate
	public int[] getRates() {
		return rates;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + title + " PublishDate: " + publishDate + " author: " + author + " content: " + content + " averageRate: " + averageRate);
		
	}

	@Override
	public float calculate() {
		// TODO Auto-generated method stub
		averageRate = (float)((rates[0] + rates[1] + rates[2]) /3);
		return averageRate;
		
	}
	
	
}
