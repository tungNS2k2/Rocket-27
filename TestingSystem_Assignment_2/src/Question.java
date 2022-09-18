import java.sql.Date;

public class Question {
	int					id;		// định danh của câu hỏi
	String				content;	// nội dung của câu hỏi
	CategoryQuestion	category;	// định danh của chủ đề câu hỏi
	TypeQuestion		type;		// định danh của loại câu hỏi
	Account				creator;	// id của người tạo câu hỏi
	Date				createDate;	// ngày tạo câu hỏi
}
