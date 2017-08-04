package providers;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataProvider
{
	Connection con;
	String command;
	public DataProvider(Connection con, String command)
	{
		this.con = con;
		this.command = command;
	}
	public ResultSet getData()
	{
		try
		{
			Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			return s.executeQuery(command);
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
