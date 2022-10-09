package com.vti.backend;

import java.util.*;

import com.vti.entity.Student;

public class Exercise2 {
//	Question 1: @Deprecated
//	Khai báo 1 instance có datatype Date và có value là ngày 18/05/2020.
//	Bạn sẽ thấy java cảnh báo, hãy tắt cảnh báo này đi
	
	public void question1() {
		@Deprecated 
		Date date = new Date();
		System.out.println(date);
	}
	
	
	
	public void question2() {
		System.out.println("Tạo sinh viên với phương thức getID ban đầu: ");

				Student st = new Student("Student");
				System.out.println("Sinh viên tạo là ID: " + st.getId() + " Name: " + st.getName());

				System.out.println("Sử dụng phương thức getID bản mới cập nhật getIdWithMSV(): ");

				System.out.println("Sinh viên tạo là ID: " + st.toString());
				

	}
}
