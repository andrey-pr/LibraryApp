package providers;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import main.Commands;
import main.ConnectionHolder;
import model.Student;

public class StudentProvider
{
	public ArrayList<Student> getStudents()
	{
		return convertToStudents(getData(Commands.getStudents));
	}
	public ArrayList<Student> getStudentsByGroup(String groupName)
	{
		return convertToStudents(getData(Commands.getStudentsByGroupFirstPart + groupName + Commands.getStudentsByGroupLastPart));
	}
	public ArrayList<Student> getStudentsByFaculty(String facultyName)
	{
		return convertToStudents(getData(Commands.getStudentsByFacultityFirstPart + facultyName + Commands.getStudentsByFacultityLastPart));
	}
	private ArrayList<Student> convertToStudents(ResultSet rs)
	{
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
	private ResultSet getData(String script)
	{
		return new DataProvider(ConnectionHolder.getInstance().con, script).getData();
		

	}
	public void saveStudent(Student student, String phone)
	{
		try
		{
			Statement st = ConnectionHolder.getInstance().con.createStatement();
			st.execute(Commands.saveStudentFirstPart);
			st.execute(Commands.saveStudent2Part + student.getName() + Commands.saveStudent3Part + student.getLname() + Commands.saveStudent4Part + student.getMname() + Commands.saveStudent5Part + student.getLogbook() + Commands.saveStudent6Part + student.getGroup() + Commands.saveStudent7Part);
			st.execute(Commands.saveStudent8Part + phone + Commands.saveStudent9Part);
			st.execute(Commands.saveStudentLastPart);
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
