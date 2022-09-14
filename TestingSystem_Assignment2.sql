DROP DATABASE IF EXISTS Testing_System_Assignment_1;

CREATE DATABASE Testing_System_Assignment_1;
use Testing_System_Assignment_1;


-- CREATE Bảng
CREATE TABLE Department(
	DepartmentID TINYINT UNSIGNED PRIMARY KEY,
    DepartmentName VARCHAR(30)
);


CREATE TABLE `Position` (
    PositionID TINYINT UNSIGNED,
    PositionName ENUM('Dev', 'Test', 'Scrum Master', 'PM')
);




CREATE TABLE `Account`(
	AccountID 		INT UNSIGNED,
    Email			VARCHAR(50)	UNIQUE KEY,
    UserName		VARCHAR(30)	UNIQUE KEY,
    FullName		VARCHAR(50),
    DepartmentID	TINYINT UNSIGNED,
    PositionID		TINYINT UNSIGNED,
    Create_Date		DATE,
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)
);





CREATE TABLE `Group`(
	GroupID			TINYINT UNSIGNED,
    AccountID		INT UNSIGNED,
    JoinDate		DATE
);


CREATE TABLE TypeQuestion(
	TypeID			TINYINT UNSIGNED,
    TypeName		VARCHAR(30)
);


CREATE TABLE CategoryQuestion(
	QuestionID		MEDIUMINT UNSIGNED,
    Content			VARCHAR(50),
    CategoryID		SMALLINT UNSIGNED,
    TypeID			TINYINT UNSIGNED,
    CreateDate		DATE
);



CREATE TABLE Answer(
	AnswerID		MEDIUMINT UNSIGNED,
    Content			VARCHAR(50),
    QuestionID		SMALLINT UNSIGNED,
    isCorrect		BOOL
);




CREATE TABLE Exam(
	ExamID			SMALLINT UNSIGNED,
    `Code`			VARCHAR(30),
    Title			VARCHAR(50),
    CategoryID		SMALLINT UNSIGNED,
    Duration		VARCHAR(30),
    CreateID		SMALLINT UNSIGNED,
    CreateDate		DATE
);




CREATE TABLE ExamQuestion(
	ExamID			SMALLINT UNSIGNED,
    QuestionID		MEDIUMINT UNSIGNED
);



-- INSERT bảng 

INSERT INTO Department 	(DepartmentID, DepartmentName )
VALUES 					(          1, 'Nguyen Son Tung');


SELECT *
FROM Department
WHERE DepartmentName IS NOT NULL;


