package providers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import main.Commands;
import main.ConnectionHolder;
import model.Facultity;

public class FacultityProvider
{
	public ArrayList<String> getFacultityNames()
	{
		ResultSet rs = getData(Commands.getFacultityNames);
		ArrayList<String> al = new ArrayList<String>();
		try
		{
			while(rs.next())
			{
				al.add(rs.getString(1));
			}
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}
	public ArrayList<Facultity> getFacultities()
	{
		return convertToFacultities(getData(Commands.getFacultities));
	}
	public ResultSet getFacultitisRS()
	{
		return getData(Commands.getFacultities);
	}
	private ArrayList<Facultity> convertToFacultities(ResultSet rs)
	{
		ArrayList<Facultity> al = new ArrayList<Facultity>();
		try
		{
			while(rs.next())
			{
				al.add(new Facultity(rs.getString(1), rs.getString(2)));
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
}
