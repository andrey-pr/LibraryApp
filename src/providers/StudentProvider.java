package providers;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import main.Commands;
import main.ConnectionHolder;
import model.Student;

public class StudentProvider
{
	public ArrayList<Student> getStudents()
	{
		return getData(Commands.getStudents);
	}
	public ArrayList<Student> getStudentsByGroup(String groupName)
	{
		ArrayList<Student> al = new ArrayList<Student>();
		//TODO: Must be released before
		return al;
	}
	public ArrayList<Student> getStudentsByFaculty(String facultyName)
	{
		ArrayList<Student> al = new ArrayList<Student>();
		//TODO: Must be released before
		return al;
	}
	private ArrayList<Student> getData(String script)
	{
		ResultSet rs = new DataProvider(ConnectionHolder.getInstance().con, script).getData();
		ArrayList<Student> al = new ArrayList<Student>();
		try
		{
			while(rs.next())
			{
				al.add(new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
			}
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;

	}
}
