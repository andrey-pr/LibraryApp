package providers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import main.Commands;
import main.ConnectionHolder;
import model.Group;

public class GroupsProvider
{
	public ArrayList<String> getGroupNamesByFacultity(String facultityName)
	{
		ResultSet rs = getData(Commands.getGroupsByFacultityFirstPart + facultityName + Commands.getGroupsByFacultityLastPart);
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
	public ArrayList<Group> getGroups()
	{
		return convertToGroups(getData(Commands.getGroups));
	}
	public ResultSet getGroupsRS()
	{
		return getData(Commands.getGroups);
	}
	private ArrayList<Group> convertToGroups(ResultSet rs)
	{
		ArrayList<Group> al = new ArrayList<Group>();
		try
		{
			while(rs.next())
			{
				al.add(new Group(rs.getString(1), rs.getString(2)));
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
