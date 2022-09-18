import java.sql.Date;

public class Exam {
	int id; // định danh của đề thi (auto increment)
	int code; // mã đề thi
	String title; // tiêu đề của đề thi
	CategoryQuestion category; // định danh của chủ đề thi
	int duration; // thời gian thi
	Account Creator; // id của người tạo đề thi
	Date createDate; // ngày tạo đề thi
	Question[] questions;
}
