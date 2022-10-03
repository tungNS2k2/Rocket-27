package com.vti.fontend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.News;

public class MyNews {
	public static void main(String[] args) {
		ArrayList<News> listNews = new ArrayList<News>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu:");
		System.out.println("1: Insert news");
		System.out.println("2: View list News");
		System.out.println("3: AvergeRate");
		System.out.println("4: exit");
		
		
		System.out.println("lựa chọn của bản là...");
		int luaChon = scanner.nextInt();
		
		switch(luaChon) {
		case 1:
			System.out.println("insert news!");
			System.out.println("Nhập id: ");
			int id = scanner.nextInt();
			
			
			System.out.println("Nhập title: ");
			String title = scanner.nextLine();
			scanner.close();
			
			System.out.println("Nhập publishDate: ");
			LocalDate publishDate = LocalDate.now();
			
			System.out.println("Nhập author: ");
			String author = scanner.nextLine();
			scanner.close();
			
			System.out.println("Nhập content: ");
			String content = scanner.nextLine();
			scanner.close();
			
			int rate1, rate2, rate3;
			System.out.println("Đánh giá 1: ");
			rate1 = scanner.nextInt();
			
			
			System.out.println("Đánh giá 2: ");
			rate2 = scanner.nextInt();
			
			
			System.out.println("Đánh giá 3: ");
			rate3 = scanner.nextInt();
			
			int [] rates = {rate1, rate2, rate3};
			
			News news = new News(id, title, publishDate, author, content, rates);
			listNews.add(news);
			
			break;
		case 2:
			for(News new1:listNews) {
				new1.display();
			}
			break;
		case 3:
			for(News new1:listNews) {
				new1.calculate();
			}
			
			for(News new1:listNews) {
				new1.display();
			}
			
			break;
		case 4:
			System.out.println("Exit!");
			return;
		default:
			System.out.println("Chọn đúng chức năng đi bạn!");
			break;
		}
		
		
		
	}
}
