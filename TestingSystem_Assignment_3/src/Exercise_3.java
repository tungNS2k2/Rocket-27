
public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question 1:
		Exercise_3.Question_1();
		
		
		// Question 2: 
		Exercise_3.Question_2();
		
		
		// Question 3:
		Exercise_3.Question_3();
		
	}
	
	public static void Question_1() {
		Integer luong = 5000;
		System.out.printf("%2.2f", (float) luong);
		
	}
	
	public static void Question_2() {
		String varString = "1234567";
		int 	varInt = Integer.valueOf(varString);
	}
	
	public static void Question_3() {
		Integer varI = 1234567;
		int vari = 	varI.intValue();
	}

}
