package providers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import main.Commands;
import main.ConnectionHolder;
import model.Book;

public class BookProvider
{
	public ArrayList<Book> getBooks()
	{
		return convertToBook(getData(Commands.getBooks));
	}
	public ResultSet getBooksRS()
	{
		return getData(Commands.getBooks);
	}
	private ArrayList<Book> convertToBook(ResultSet rs)
	{
		ArrayList<Book> al = new ArrayList<Book>();
		try
		{
			while(rs.next())
			{
				al.add(new Book(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9)));
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
	public double countBeer()
	{
		ResultSet rs = getData(Commands.countBeer);
		try
		{
			rs.next();
			return rs.getDouble(1);
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
