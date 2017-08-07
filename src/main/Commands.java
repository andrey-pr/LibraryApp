package main;

public class Commands
{
	public final static String getStudents = "SELECT faculties.FacultyName, groups.GroupName, students.FirstName, students.LastName, students.MiddleName, students.LogbookNumber FROM faculties NATURAL JOIN groups NATURAL JOIN students;";
	public final static String getBooks = "SELECT books.BookName, books.ISBN, books.YearPress, themes.Theme, categories.Category, press.PressName, books.Pages, books.Comment, books.Quantity FROM books NATURAL JOIN themes NATURAL JOIN categories NATURAL JOIN press;";
	public final static String countBeer = "SELECT SUM((SELECT DATEDIFF(DATE(SUBDATE(NOW(), Interval 1 MONTH)), DATE(DateOut)) / 7 FROM s_cards));";
	public final static String getStudentsByGroupFirstPart = "SELECT faculties.FacultyName, groups.GroupName, students.FirstName, students.LastName, students.MiddleName, students.LogbookNumber FROM faculties NATURAL JOIN groups NATURAL JOIN students WHERE group.GroupName = '";
	public final static String getStudentsByGroupLastPart = "';";
	public final static String getStudentsByFacultityFirstPart = "SELECT faculties.FacultyName, groups.GroupName, students.FirstName, students.LastName, students.MiddleName, students.LogbookNumber FROM faculties NATURAL JOIN groups NATURAL JOIN students WHERE faculties.FacultyName = '";
	public final static String getStudentsByFacultityLastPart = "';";
	public final static String getFacultities = "SELECT FacultyName, Phone FROM faculties;";
	public final static String getFacultityNames = "SELECT FacultyName FROM faculties;";
	public final static String getGroups = "SELECT groups.GroupName, faculties.FacultyName FROM groups NATURAL JOIN faculties;";
	public final static String getGroupsByFacultityFirstPart = "SELECT groups.GroupName, faculties.FacultyName FROM groups NATURAL JOIN faculties WHERE FacultyName = '";
	public final static String getGroupsByFacultityLastPart = "';";
	public final static String saveStudentFirstPart = "START TRANSACTION;";
	public final static String saveStudent2Part = "INSERT INTO students (FirstName, LastName, MiddleName, LogbookNumber, GroupId) VALUES ('";
	public final static String saveStudent3Part = "', '";
	public final static String saveStudent4Part = "', '";
	public final static String saveStudent5Part = "', ";
	public final static String saveStudent6Part = ", (SELECT GroupId FROM groups WHERE GroupName = '";
	public final static String saveStudent7Part = "'));";
	public final static String saveStudent8Part = "INSERT INTO s_phones (Phone, StudentId) VALUES ('";
	public final static String saveStudent9Part = "', @@IDENTITY);";
	public final static String saveStudentLastPart = "COMMIT;";
}
