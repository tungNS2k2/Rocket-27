import java.sql.Date;

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

//		tạo Account
		Account account1 = new Account();
		account1.id = 1;
		account1.userName = "tungNS";
		account1.fullName = "Nguyễn Sơn Tùng";
		account1.email = "tungns@gmail.com";
		account1.department = de1;
		account1.position = po1;
		account1.createDate = Date.valueOf("2022-12-02");

		Account account2 = new Account();
		account2.id = 2;
		account2.userName = "tungNS2";
		account2.fullName = "Nguyễn Sơn Tùng 2";
		account2.email = "tungns2@gmail.com";
		account2.department = de2;
		account2.position = po1;
		account2.createDate = Date.valueOf("2022-12-02");

		Account account3 = new Account();
		account3.id = 3;
		account3.userName = "tungNS3";
		account3.fullName = "Nguyễn Sơn Tùng 3";
		account3.email = "tungns3@gmail.com";
		account3.department = de3;
		account3.position = po3;
		account3.createDate = Date.valueOf("2022-12-02");

//		Khởi tạo giá trị Group
		Group gr1 = new Group();
		gr1.creator = account1;
		gr1.id = 1;
		gr1.name = "Group 1";

		Group gr2 = new Group();
		gr2.creator = account2;
		gr2.id = 2;
		gr2.name = "Group 2";

		Group gr3 = new Group();
		gr3.creator = account3;
		gr3.id = 3;
		gr3.name = "Group 3";

		// khởi tạo giá trị group Account
		GroupAccount ga1 = new GroupAccount();
		ga1.account = account1;
		ga1.group = gr1;

		GroupAccount ga2 = new GroupAccount();
		ga2.account = account2;
		ga2.group = gr1;

		GroupAccount ga3 = new GroupAccount();
		ga3.account = account3;
		ga3.group = gr2;

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

		Exam ex3 = new Exam();
		ex1.id = 3;
		ex1.code = 132;
		ex1.Creator = account3;
		ex1.category = cq3;
		ex1.duration = 111;
		ex1.createDate = Date.valueOf("2021-01-02");
		ex1.title = " Title 3";

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

		System.out.println("id của phòng ban 1: " + de1.id);
		System.out.println("user của nhân viên 1: " + account1.userName);
		System.out.println("tên của chức vụ 1: " + po1.name);
		System.out.println("Tên của Group 1: " + gr1.name);
		System.out.println("thời gian tham gia nhóm 1 của các account: " + ga1.joinDate);
		System.out.println("Id của typeQuestion 1: " + tq1.id);
		System.out.println("tên của categoryQuestion 1: " + cq1.name);
		System.out.println("ngươi tạo câu hỏi 1: " + qu1.creator.fullName);
		System.out.println("Content của câu hỏi 1: " + answer1.content);
		System.out.println("thời gian thi của bài kiểm tra 1: " + ex1.duration);
		System.out.println("examQuestion 1 " + eq1.exam.id);
	}
}
