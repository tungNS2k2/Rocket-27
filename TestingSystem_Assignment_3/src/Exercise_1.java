import java.util.Random;
import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// question 1
		System.out.println("Question 1: ");
		Exercise_1.Question_1();
		
		
		// Question 2
		System.out.println("Question 2: ");
		Exercise_1.Question_2();
		
		
		// Question 3:
		System.out.println("Question 3: ");
		Exercise_1.question_3();
		
		
		
		// question 4:
		Exercise_1.Question_4();
	}
	// method question1
	public static void Question_1() {
		// khởi tạo lương Account 1
		Account account1 = new Account();
		account1.luong = 5240.5f;
		
		// khởi tạo lương của Account 2
		Account account2 = new Account();
		account2.luong = 10970.055f;
		
		int lamTron1 = (int) account1.luong;
		System.out.println("lương của Account 1 sau khi làm tròn là: " + lamTron1);
		
		int lamTron2 = (int) account2.luong;
		System.out.println("lương của Account 2 sau khi làm tròn là: " + lamTron2);
		
	
	}
	
	
	// method question 2: 
	public static void Question_2() {
		Random ran = new Random();
		int soNguyen = ran.nextInt(99999);
		String var = Integer.toString(soNguyen);
		System.out.println("số ban đầu: " + var);
		int length = var.length();
	
		while(length < 5) {
			String a = "0";
			var = a.concat(var);
			length++;
		}
		System.out.println(var);
	}
	
	
	
	// method question 3:
	public static void question_3() {
		// covert sang string
		Random ran = new Random();
		int soNguyen = ran.nextInt(99999);
		String var = Integer.toString(soNguyen);
		System.out.println("Số ban đầu: " + var);
		
		int length = var.length();
		if (length == 5) {
			var = var.substring(3);
			System.out.println("2 số cuối của chuỗi là: " + var);
		}
		else {
			System.out.println("k phải số có 5 chữ số");
		}
		
		
	}
	
	// medthod question 4:
	public static void Question_4() {
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		System.out.println("Nhập số nguyen a: ");
		a = scanner.nextInt();
		System.out.println("Nhập số nguyen b: ");
		b = scanner.nextInt();
		
		
		float thuong = (float) a/b;
		System.out.println("Thương của a và b là: " + thuong);
		
	}


}
