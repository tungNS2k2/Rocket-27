import java.time.LocalDate;
import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 1:
		//Exercise_4.Question_1();
		
		// Question 2:
		//Exercise_4.Question_2();
		
		// Question 3: 
		//Exercise_4.Question_3();
		
		
		//Question 4
		//Exercise_4.Question_4();
		
		// Question 5:
		//Exercise_4.Question_5();
		
		
		// Question 6: 
		//Exercise_4.Question_6();
	
		// Question 7:
		// Exercise_4.Question_7();
		
		
		//Question 8:
		//Exercise_4.Question_8();
		
		// Question 9:
		Exercise_4.Question_9();
	}
	// method question 1: 
	public static void Question_1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập 1 sâu kí tự: ");
		String sau = scanner.nextLine();
		
		String[] saus = sau.split("\\s+");
		int dem = 0;
		for (String string : saus) {
			dem++;
		}
		System.out.println("có " + dem + " từ!");
		
	}
	// method question 2:
	public static void Question_2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập sâu s1: ");
		String s1 = scanner.nextLine();
		
		System.out.println("Nhập sâu s2: ");
		String s2 = scanner.nextLine();
		
		
		System.out.printf("\n sâu 1: "+ s1 +"\n sâu 2: " + s2 + "%n" + "nối chuỗi s1 s2: " + s1 +" "+ s2 + "%n" );
		
		
	}
	
	// method của Question_3:
	public static void Question_3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ và Tên: ");
		String hoTen = scanner.nextLine();
		
		//cắt chuỗi bằng khoảng trắng
		String[] varHoTen = hoTen.split("\\s+");
		
		
		// vòng foreach kiểm tra hoa thường
		for (String string : varHoTen) {
			String chuDau = string.substring(0, 1);
			String phanSau = string.substring(1, string.length());
			if(chuDau == chuDau.toUpperCase()) {
				System.out.println(chuDau +" Trong từ "+ string + " dã viết hoa");
			}
			else {
				System.out.println(chuDau + " trong từ "+string +" chưa viết hoa!");
			}
		}
		
		// vòng foreach chuyển về đúng định dạng
		System.out.printf("Tên sau khi covert: ");
		for (String string : varHoTen) {
			String chuDau = string.substring(0, 1);
			String phanSau = string.substring(1, string.length());
	
			chuDau = chuDau.toUpperCase();
			phanSau = phanSau.toLowerCase();
			System.out.printf(chuDau + phanSau + " ");
		}
		
		
		

		
		
	}
	//method Question 4
	public static void Question_4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		String name = scanner.next();
		
		String[] kiTus = name.split("");
		int index = 1;
		for (String kitu : kiTus) {
			System.out.println("Ký tự thứ "+ index +": " + kitu);
		}
	}
	
	
	// method Question 5:
	public static void Question_5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ của bạn: ");
		String ho = scanner.next();
		if (ho != null) {
			System.out.println("Hãy nhập tên của bạn: ");
			String ten = scanner.next();
			System.out.println("Họ và tên của bạn là: " + ho + " " + ten);
		}
		
		
		
	}
	
	
	// method Question6:
	public static void Question_6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ và tên của bạn: ");
		String hoTen = scanner.nextLine();
		
		
		String[] hoTens = hoTen.split("\\s+");
		
		String ho = hoTens[0];
		String tenDem = "";
		String ten = hoTens[hoTens.length -1];
		for(int item = 1; item < (hoTens.length - 1); item++) {
			tenDem  += hoTens[item] + " ";
		}
		
		System.out.println("Họ là: " + ho);
		System.out.println("Tên đệm là: " + tenDem);
		System.out.println("Tên là : " + ten);
		
		
		
	}
	
	public static void Question_7() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ và tên: ");
		
		String hoTen = scanner.nextLine();
		hoTen = hoTen.trim();
		System.out.println("a. Họ và tên sau khi chuẩn hóa: " + hoTen);
		
		String [] hoTens = hoTen.split("\\s+");
		System.out.println("b. Họ tên sau khi chuẩn hóa: ");
		for (String string : hoTens) {
			String phanDau = string.substring(0, 1);
			String phanCuoi = string.substring(1,string.length());
			
			phanDau = phanDau.toUpperCase();
			System.out.printf(phanDau + phanCuoi + " ");
			
			
		}
		
	}
	
	
	public static void Question_8() {
		Scanner scanner = new Scanner(System.in);
		
		
		
		// nhập dữ liệu cho group
		System.out.println("Nhập số group cần tạo: ");
		int n = scanner.nextInt();
		Group[] groups = new Group[n];
		for (int index = 0; index < groups.length; index ++) {
			Group gr = new Group();
			System.out.printf("%nNhập id Group "+ (index + 1)+ ": " );
			gr.id = scanner.nextInt();
			System.out.printf("%n Nhập tên Group " +(index + 1)+": ");
			gr.name = scanner.next();
	
			gr.joinDate = LocalDate.now();
			groups[index] = gr;
		}
		
		System.out.println("Group có tên chứa java là: ");
		for(int item = 0; item < groups.length; item ++) {
			if(groups[item].name.contains("java")) {
				System.out.println("id: "  + groups[item].id +" Tên: " +groups[item].name);
			}
		}
		
		
	}
	
	
	public static void Question_9() {
		Scanner scanner = new Scanner(System.in);
		
		
		
		// nhập dữ liệu cho group
		System.out.println("Nhập số group cần tạo: ");
		int n = scanner.nextInt();
		Group[] groups = new Group[n];
		for (int index = 0; index < groups.length; index ++) {
			Group gr = new Group();
			System.out.printf("%nNhập id Group "+ (index + 1)+ ": " );
			gr.id = scanner.nextInt();
			System.out.printf("%n Nhập tên Group " +(index + 1)+": ");
			gr.name = scanner.next();
	
			gr.joinDate = LocalDate.now();
			groups[index] = gr;
		}
		
		
		for(int item = 0; item < groups.length; item ++) {
			if(groups[item].name == "java") {
				System.out.println("id: " + groups[item].id + " Name: " + groups[item].name);
			}
		}
		
		
		
	}
	
	
	
	
	

}
