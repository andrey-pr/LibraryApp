package main;

public class Commands
{
	public final static String getStudents = "SELECT faculties.FacultyName, groups.GroupName, students.FirstName, students.LastName, students.MiddleName, students.LogbookNumber FROM faculties NATURAL JOIN groups NATURAL JOIN students;";
	public final static String getBooks = "SELECT books.BookName, books.ISBN, books.YearPress, themes.Theme, categories.Category, press.PressName, books.Pages, books.Comment, books.Quantity FROM books NATURAL JOIN themes NATURAL JOIN categories NATURAL JOIN press;";
	public final static String countBeer = "SELECT SUM((SELECT DATEDIFF(DATE(SUBDATE(NOW(), Interval 1 MONTH)), DATE(DateOut)) / 7 FROM s_cards));";
}
