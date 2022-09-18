import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public class Program {
	public static void main(String[] args) {

// tạo department
		Department de1 = new Department();
		de1.id = 1;
		de1.name = "Marketing";

		Department de2 = new Department();
		de2.id = 2;
		de2.name = "Sale";

		Department de3 = new Department();
		de3.id = 3;
		de3.name = "Sale 2";

// tạo Position		
		Position po1 = new Position();
		po1.id = 1;
		po1.name = "Dev1";

		Position po2 = new Position();
		po2.id = 2;
		po2.name = "Dev2";

		Position po3 = new Position();
		po3.id = 2;
		po3.name = "PA";
//		Khởi tạo giá trị Group
		Group gr1 = new Group();
		gr1.id = 1;
		gr1.name = "Group 1";

		Group gr2 = new Group();
		gr2.id = 2;
		gr2.name = "Group 2";

		Group gr3 = new Group();
		gr3.id = 3;
		gr3.name = "Group 3";

//		tạo Account
		Account account1 = new Account();
		account1.id = 1;
		account1.userName = "tungNS";
		account1.fullName = "Nguyễn Sơn Tùng";
		account1.email = "tungns@gmail.com";
		account1.department = de1;
		account1.position = po1;
		account1.createDate = Date.valueOf("2022-12-02");
		account1.groups = new Group[] { gr1, gr2 };

		Account account2 = new Account();
		account2.id = 2;
		account2.userName = "tungNS2";
		account2.fullName = "Nguyễn Sơn Tùng 2";
		account2.email = "tungns2@gmail.com";
		account2.department = de2;
		account2.position = po1;
		account2.createDate = Date.valueOf("2022-12-02");
		account2.groups = new Group[] { gr2, gr3 };

		Account account3 = new Account();
		account3.id = 3;
		account3.userName = "tungNS3";
		account3.fullName = "Nguyễn Sơn Tùng 3";
		account3.email = "tungns3@gmail.com";
		account3.department = de3;
		account3.position = po3;
		account3.createDate = Date.valueOf("2022-12-02");

		// khởi tạo giá trị group Account
		gr1.accounts = new Account[] { account1 };
		gr2.accounts = new Account[] { account1, account2 };
		gr3.accounts = new Account[] { account2 };

		// khởi tạo giá trị Type Question
		TypeQuestion tq1 = new TypeQuestion();
		tq1.id = 1;
		tq1.Name = Type.ESSAY;

		TypeQuestion tq2 = new TypeQuestion();
		tq1.id = 2;
		tq1.Name = Type.MULTIPLE_CHOICE;

		TypeQuestion tq3 = new TypeQuestion();
		tq1.id = 3;
		tq1.Name = Type.ESSAY;

//		khởi tạo giá trị CategoryQuestion
		CategoryQuestion cq1 = new CategoryQuestion();
		cq1.id = 1;
		cq1.name = "Category 1";

		CategoryQuestion cq2 = new CategoryQuestion();
		cq2.id = 2;
		cq2.name = "Category 2";

		CategoryQuestion cq3 = new CategoryQuestion();
		cq3.id = 3;
		cq3.name = "Category 3";

//		khởi tạo giá trị Question
		Question qu1 = new Question();
		qu1.id = 1;
		qu1.creator = account1;
		qu1.category = cq1;
		qu1.content = "Content 2";
		qu1.type = tq1;
		qu1.createDate = Date.valueOf("2020-12-09");

		Question qu2 = new Question();
		qu2.id = 2;
		qu2.creator = account2;
		qu2.category = cq2;
		qu2.content = "Content 2";
		qu2.type = tq2;
		qu2.createDate = Date.valueOf("2020-12-09");

		Question qu3 = new Question();
		qu3.id = 3;
		qu3.creator = account3;
		qu3.category = cq3;
		qu3.content = "Content 2";
		qu3.type = tq3;
		qu3.createDate = Date.valueOf("2020-12-09");

//		khởi tạo giá trị Answer
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "answer 1";
		answer1.isCorrect = true;
		answer1.question = qu1;

		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "answer 2";
		answer2.isCorrect = false;
		answer2.question = qu2;

		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = "answer 3";
		answer3.isCorrect = true;
		answer3.question = qu3;

//		khởi tạo giá trị 	Exam
		Exam ex1 = new Exam();
		ex1.id = 1;
		ex1.code = 112;
		ex1.Creator = account1;
		ex1.category = cq1;
		ex1.duration = 20;
		ex1.createDate = Date.valueOf("2021-01-02");
		ex1.title = " Title 1";

		Exam ex2 = new Exam();
		ex2.id = 2;
		ex2.code = 122;
		ex2.Creator = account2;
		ex2.category = cq2;
		ex2.duration = 90;
		ex2.createDate = Date.valueOf("2021-01-02");
		ex2.title = " Title 2";

		Exam exam3 = new Exam();
		exam3.id = 3;
		exam3.code = 132;
		exam3.Creator = account3;
		exam3.category = cq3;
		exam3.duration = 111;
		exam3.createDate = Date.valueOf("2021-01-02");
		exam3.title = " Title 3";

//		khởi tạo giá trị Exam Question
		ExamQuestion eq1 = new ExamQuestion();
		eq1.exam = ex1;
		eq1.question = qu1;

		ExamQuestion eq2 = new ExamQuestion();
		eq2.exam = ex1;
		eq2.question = qu2;

		ExamQuestion eq3 = new ExamQuestion();
		eq3.exam = ex2;
		eq3.question = qu1;

// 

		System.out.println("id của phòng ban 1: " + de1.id);
		System.out.println("user của nhân viên 1: " + account1.userName);
		System.out.println("tên của chức vụ 1: " + po1.name);
		System.out.println("Tên của Group 1: " + gr1.name);
		// System.out.println("thời gian tham gia nhóm 1 của các account: " +
		// ga1.joinDate);
		System.out.println("Id của typeQuestion 1: " + tq1.id);
		System.out.println("tên của categoryQuestion 1: " + cq1.name);
		System.out.println("ngươi tạo câu hỏi 1: " + qu1.creator.fullName);
		System.out.println("Content của câu hỏi 1: " + answer1.content);
		System.out.println("thời gian thi của bài kiểm tra 1: " + ex1.duration);
		System.out.println("examQuestion 1 " + eq1.exam.id + "\n");

// assignment 2
//		Exercise 1 (Optional): Flow Control
//		Question1
		System.out.println("\n assignment 2 \n Exercise 1 (Optional): Flow Control");
		System.out.println("Question 1: ");
		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là: " + account2.department.name);
		}

		/*
		 * Question 2: Kiểm tra account thứ 2 Nếu không có group thì sẽ in ra text
		 * "Nhân viên này chưa có group" Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra
		 * text "Group của nhân viên này là Java Fresher, C# Fresher" Nếu có mặt trong 3
		 * Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều
		 * group" Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
		 * người hóng chuyện, tham gia tất cả các group"
		 */

		System.out.println("Question 2: ");
		int ca2 = account2.groups.length;
		if (ca2 == 0) {
			System.out.println("Nhân viên này chưa có group");
		} else if (ca2 == 1 || ca2 == 2) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		} else if (ca2 == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

		// question 3:
		System.out.println("\n Question 3: ");
		System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là: " + account2.department.name);

		// question 4:
		System.out.println("\n Question 4: ");
		System.out.println(account1.position.name == "Dev" ? "Đây là Developer" : "Người này không phải là Developer");

		// Switch case
		/*
		 * question 5:Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
		 * Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên" Nếu số lượng
		 * account = 2 thì in ra "Nhóm có hai thành viên" Nếu số lượng account = 3 thì
		 * in ra "Nhóm có ba thành viên" Còn lại in ra "Nhóm có nhiều thành viên"
		 */
		System.out.println("\n Question 5:");
		int countInGr1 = gr1.accounts.length;
		switch (countInGr1) {
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
			break;
		}

//		Question 6:
//			Sử dụng switch case để làm lại Question 2
		System.out.println("\n Question 6:");
		switch (account2.groups.length) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
		case 2:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;

		}

//			Question 7:
//			Sử dụng switch case để làm lại Question 4
		System.out.println("\n Question 7");
		switch (account1.position.name) {
		case "Dev":
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
		}

// FOR and FOREACH
//		Question 8:
//			In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//			họ
		Account[] accounts = { account1, account2, account3 };
		for (Account account : accounts) {
			System.out.println("id: " + account.id + " Email: " + account.email + " FullName: " + account.fullName
					+ " Phòng ban: " + account.department.name);
		}

//		Question 9:
//			In ra thông tin các phòng ban bao gồm: id và name
		System.out.println("\n Question 9: ");
		Department[] departments = { de1, de2, de3 };
		for (Department department : departments) {
			System.out.println("id: " + department.id + " Name: " + department.name);
		}

//		Question 10:
//			In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//			họ theo định dạng như sau:
//			Thông tin account thứ 1 là:
//			Email: NguyenVanA@gmail.com
//			Full name: Nguyễn Văn A
//			Phòng ban: Sale
//			Thông tin account thứ 2 là:
//			Email: NguyenVanB@gmail.com
//			Full name: Nguyễn Văn B
//			Phòng ban: Marketting
		for (int index = 0; index < accounts.length; index++) {
			System.out.println("\n Thông tin Account " + (index + 1) + ":" + "\n Email: " + accounts[index].email
					+ "\n FullName: " + accounts[index].fullName + "\n Phòng ban: " + accounts[index].department.name);
		}

//		Question 11:
//			In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//			Thông tin department thứ 1 là:
//			Id: 1
//			Name: Sale
//			Thông tin department thứ 2 là:
//			Id: 2
//			Name: Marketing
		System.out.println("\nQuestion 11: ");
		for (int index = 0; index < departments.length; index++) {
			System.out.println("\n Thông tin Department " + (index + 1) + ":" + "\nid: " + departments[index].id
					+ "\nName: " + departments[index].name);
		}

//		Question 12:
//			Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		System.out.println("\nQuestion 12: ");
		for (int index = 0; index < 2; index++) {
			System.out.println("\n Thông tin Department " + (index + 1) + ":" + "\nid: " + departments[index].id
					+ "\nName: " + departments[index].name);
		}

//		Question 13:
//			In ra thông tin tất cả các account ngoại trừ account thứ 2
		System.out.println("\n Question 13: ");
		for (int index = 0; index < accounts.length; index++) {
			if (accounts[index].id == 2) {
				continue;
			}
			System.out.println("\n Thông tin Account " + (index + 1) + ":" + "\n Email: " + accounts[index].email
					+ "\n FullName: " + accounts[index].fullName + "\n Phòng ban: " + accounts[index].department.name);
		}

//		Question 14:
//			In ra thông tin tất cả các account có id < 4
		System.out.println("\n Question 14: ");
		for (int index = 0; index < accounts.length; index++) {
			if (accounts[index].id < 4) {
				System.out.println("\n Thông tin Account " + (index + 1) + ":" + "\n Email: " + accounts[index].email
						+ "\n FullName: " + accounts[index].fullName + "\n Phòng ban: "
						+ accounts[index].department.name);
			}

		}

//			Question 15:
//			In ra các số chẵn nhỏ hơn hoặc bằng 20
		for (int index = 0; index < 21; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}

//		WHILE
//		Question 16:
//		Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//		lệnh break, continue
		System.out.println("Question 16: ");
		System.out.println("\nQuestion 16.1: ");
		int dem1 = 0;
		while (dem1 < accounts.length) {
			System.out.println("\n Thông tin Account " + (dem1 + 1) + ":" + "\n Email: " + accounts[dem1].email
					+ "\n FullName: " + accounts[dem1].fullName + "\n Phòng ban: " + accounts[dem1].department.name);
			dem1 += 1;
		}

		System.out.println("\nQuestion 16.2: ");
		int dem2 = 0;
		while (dem2 < departments.length) {
			System.out.println("\n Thông tin Department " + (dem2 + 1) + ":" + "\nid: " + departments[dem2].id
					+ "\nName: " + departments[dem2].name);
			dem2++;
		}

		System.out.println("\nQuestion 16.3:");
		int dem3 = 0;
		while (dem3 < 2) {
			System.out.println("\n Thông tin Department " + (dem3 + 1) + ":" + "\nid: " + departments[dem3].id
					+ "\nName: " + departments[dem3].name);
			dem3++;
		}

		System.out.println("\nQuestion 16.4:");

		int dem5 = 0;
		while (dem5 < accounts.length) {
			if (accounts[dem5].id == 2) {
				dem5 += 1;
				continue;
			}
			System.out.println("\n Thông tin Account " + (dem5 + 1) + ":" + "\n Email: " + accounts[dem5].email
					+ "\n FullName: " + accounts[dem5].fullName + "\n Phòng ban: " + accounts[dem5].department.name);
			dem5 += 1;
		}

		System.out.println("\nQuestion 16.5:");
		int dem4 = 0;
		while (dem4 < accounts.length) {
			if (accounts[dem4].id < 4) {
				System.out.println("\n Thông tin Account " + (dem4 + 1) + ":" + "\n Email: " + accounts[dem4].email
						+ "\n FullName: " + accounts[dem4].fullName + "\n Phòng ban: "
						+ accounts[dem4].department.name);
				dem4 += 1;
			}
		}

		// DO WHILE
		System.out.println("\nQuestion17:\nQuestion 17.1:");
		int dema = 0;
		do {
			System.out.println("\n Thông tin Account " + (dema + 1) + ":" + "\n Email: " + accounts[dema].email
					+ "\n FullName: " + accounts[dema].fullName + "\n Phòng ban: " + accounts[dema].department.name);
			dema += 1;
		} while (dema < accounts.length);

		System.out.println("\nQuestion 17.2: ");
		int demb = 0;
		do {
			System.out.println("\n Thông tin Department " + (demb + 1) + ":" + "\nid: " + departments[demb].id
					+ "\nName: " + departments[demb].name);
			demb++;
		} while (demb < departments.length);

		System.out.println("\nQuestion 17.3: ");
		int demc = 0;
		do {
			System.out.println("\n Thông tin Department " + (demc + 1) + ":" + "\nid: " + departments[demc].id
					+ "\nName: " + departments[demc].name);
			demc++;
		} while (demc < 2);

		System.out.println("\nQuestion17.4: ");
		int demd = 0;
		do {
			if (accounts[demd].id == 2) {
				demd += 1;
				continue;
			}
			System.out.println("\n Thông tin Account " + (demd + 1) + ":" + "\n Email: " + accounts[demd].email
					+ "\n FullName: " + accounts[demd].fullName + "\n Phòng ban: " + accounts[demd].department.name);
			demd += 1;
		} while (demd < accounts.length);

		System.out.println("\nQuestion 17.5: ");
		int deme = 0;
		do {

			if (accounts[deme].id < 4) {
				System.out.println("\n Thông tin Account " + (deme + 1) + ":" + "\n Email: " + accounts[deme].email
						+ "\n FullName: " + accounts[deme].fullName + "\n Phòng ban: "
						+ accounts[deme].department.name);
				deme += 1;
			}
		} while (deme < accounts.length);

//		Exercise 2 (Optional): System out printf
//		Question 1:
//		Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//		nguyên đó
		System.out.println("\n exercise 2:\nQuestin 1:");
		int var_interger = 5;
		System.out.printf("%n", var_interger);

//		Question 2:
//		Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//		ra số nguyên đó thành định dạng như sau: 100,000,000
		System.out.println("\nQuestion 2:");
		int interger2 = 100000000;
		System.out.printf(Locale.US, "%,d %n", interger2);

//		Question 3:
//		Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//		thực đó chỉ bao gồm 4 số đằng sau
		System.out.println("\nQuestion 3: ");
		float float1 = 5.567098f;
		System.out.printf("%6.4f%n", float1);

//		Question 4:
		System.out.println("\n Question 4: ");
//		Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//		dạng như sau:
//		Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//		Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
		String Hoten = "Nguyễn Văn A";
		System.out.println("Tên tôi là  \"" + Hoten + "\" và tôi đang độc thân.");

//
//		Question 5:
//		Lấy thời gian bây giờ và in ra theo định dạng sau:
//		24/04/2020 11h:16p:20s
//		String pattern = "dd/MM/yyyy HH:mm:ss";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		String date = simpleDateFormat.format(new Date());
//		System.out.println(date);
//		Question 6:
//		In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
//		table (giống trong Database)
		System.out.println("\n Question 6: \n");
		System.out.printf("'%-15s' %n", "id" + "email" + "fullName" + "department name");
		for (Account account : accounts) {
			System.out.printf("'%-15s' %n", account.id + account.email + account.fullName + account.department.name);
		}

//		Exercise 3 (Optional): Date Format
//		Question 1:
//		In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//		dạng vietnamese
		System.out.println("\nExercise 3: \nQuestion 1:");
		Locale locale = new Locale("vn", "VN");
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String date = dateformat.format(ex1.createDate);
		System.out.println(ex1.code + ": " + date);

//		Question 2:
//		In ra thông tin: Exam đã tạo ngày nào theo định dạng
//		Năm – tháng – ngày – giờ – phút – giây
		System.out.println("\n Question 2:");
		String pattern = "yyyy-MM-dd-HH-mm--ss";
		SimpleDateFormat Simpleformat = new SimpleDateFormat(pattern);
		Exam[] exs = { ex1, ex2, exam3 };
		for (Exam ex : exs) {
			String DateTime = Simpleformat.format(ex.createDate);
			System.out.println("exam:" + ex.id + "\t" + DateTime);
		}

//		Question 3:
//		Chỉ in ra năm của create date property trong Question 2
		System.out.println("\n Question 3: ");
		String pattern1 = "yyyy";
		SimpleDateFormat simpFormat = new SimpleDateFormat(pattern1);
		String QuestionDate = simpFormat.format(qu2.createDate);
		System.out.println(QuestionDate);

//
//		Question 4:
//		Chỉ in ra tháng và năm của create date property trong Question 2
		System.out.println("\n Question 4: ");
		String pattern2 = "MM-yyyy";
		SimpleDateFormat simpFormat1 = new SimpleDateFormat(pattern2);
		String QuestionDate1 = simpFormat1.format(qu2.createDate);
		System.out.println(QuestionDate1);

//		Question 5:
//		Chỉ in ra "MM-DD" của create date trong Question 2
		System.out.println("\n Question 5: ");
		String pattern3 = "MM-DD";
		SimpleDateFormat simpFormat2 = new SimpleDateFormat(pattern3);
		String QuestionDate2 = simpFormat2.format(qu2.createDate);
		System.out.println(QuestionDate2);

//		Exercise 4 (Optional): Random Number
//		Question 1:
//		In ngẫu nhiên ra 1 số nguyên
		System.out.println("\nExercise\nQuestion 1");
		Random ran = new Random();
		System.out.println("Số nguyên ngẫu nhiên" + ran.nextInt());

//		Question 2:
//		In ngẫu nhiên ra 1 số thực
		System.out.println("\n Question 2: ");
		System.out.println("Số thực ngẫu nhiên: " + ran.nextFloat());
//		Question 3:
//		Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên
//		ra tên của 1 bạn
		System.out.println("\n Question 3: ");
		String[] array = { "Nguyễn văn A", "Nguyễn Văn B", "Trần thị C" };
		int i = ran.nextInt(array.length);
		System.out.println(array[1]);

//		Question 4:
//		Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-
//		1995
		System.out.println("\nQuestion 4:");
		int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		long randomDay = minDay + ran.nextInt(maxDay - minDay);
		LocalDate random1 = LocalDate.ofEpochDay(randomDay);
		System.out.println(random1);

//		Question 5:
//		Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
		System.out.println("\nQuestion 5:");
		maxDay = (int) LocalDate.now().toEpochDay();
		randomDay = maxDay - ran.nextInt(365);

		LocalDate random2 = LocalDate.ofEpochDay(randomDay);
		System.out.println(random2);

//		Question 6:
//		Lấy ngẫu nhiên 1 ngày trong quá khứ
		System.out.println("\nQuestion 6:");
		maxDay = (int) LocalDate.now().toEpochDay();
		randomDay = ran.nextInt(maxDay);

		LocalDate random3 = LocalDate.ofEpochDay(randomDay);
		System.out.println(random3);

//		Question 7:
//		Lấy ngẫu nhiên 1 số có 3 chữ số
		System.out.println("\n Question 7: ");
		int ranDom = ran.nextInt(999 - 100 + 1) + 100;
		System.out.println(ranDom);

//		Exercise 5: Input from console
//		Question 1:
//		Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
//		Question 2:
//		Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
//		Question 3:
//		Viết lệnh cho phép người dùng nhập họ và tên
//		Question 4:
//		Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
//		Question 5:
//		Viết lệnh cho phép người dùng tạo account (viết thành method)
//		Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//		chương trình sẽ chuyển thành Position.Dev, Position.Test,
//		Position.ScrumMaster, Position.PM
//
//	
//
//		Question 6:
//		Viết lệnh cho phép người dùng tạo department (viết thành method)
//		Question 7:
//		Nhập số chẵn từ console
//		Question 8:
//		Viết chương trình thực hiện theo flow sau:
//		Bước 1:
//		Chương trình in ra text "mời bạn nhập vào chức năng muốn sử
//		dụng"
//		Bước 2:
//		Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//		Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
//		department
//		Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
//		lại" và quay trở lại bước 1
//
//		Question 9:
//		Viết method cho phép người dùng thêm group vào account theo flow sau:
//		Bước 1:
//		In ra tên các usernames của user cho người dùng xem
//		Bước 2:
//		Yêu cầu người dùng nhập vào username của account
//		Bước 3:
//		In ra tên các group cho người dùng xem
//		Bước 4:
//		Yêu cầu người dùng nhập vào tên của group
//		Bước 5:
//		Dựa vào username và tên của group người dùng vừa chọn, hãy
//		thêm account vào group đó .
//		Question 10: Tiếp tục Question 8 và Question 9
//		Bổ sung thêm vào bước 2 của Question 8 như sau:
//		Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào
//		account
//		Bổ sung thêm Bước 3 của Question 8 như sau:
//		Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng
//		text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác
//		không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người
//		dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để
//		kết thúc chương trình)
//		Question 11: Tiếp tục Question 10
//		Bổ sung thêm vào bước 2 của Question 8 như sau:
//		Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account
//		vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:
//		Bước 1:
//		In ra tên các usernames của user cho người dùng xem

	}

}
