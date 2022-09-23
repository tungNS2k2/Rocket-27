import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question 1:
		Exercise_2.Question_1();
	}
	
	public static void Question_1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập số account cần tạo: ");
		int n = scanner.nextInt();

		Account[] accounts = new Account[n];
		int index = 1;
		for (int item = 0; item < n; item++) {
			Account account = new Account();
			account.email = "email " + item;
			account.fullName = "FullName " + item;
			account.userName = "user Name " + item;
			account.createDate = LocalDate.now();
			accounts[item] = account;
		}
		
		
	}

}
