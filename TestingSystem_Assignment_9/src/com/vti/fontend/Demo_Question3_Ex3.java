package com.vti.fontend;

import com.vti.entity.OuterClass;

public class Demo_Question3_Ex3 {
	public static void main(String[] args) {
		OuterClass outerclass = new OuterClass();
		
		outerclass.show();
		
		OuterClass.InnerClass innerclass = outerclass.new InnerClass();
		innerclass.show();
	}
}
