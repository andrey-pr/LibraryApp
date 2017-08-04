package trash;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import providers.DataProvider;

public class SQLCartridge implements DBCartridge
{
	Connection con;
	public SQLCartridge()
	{
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib2","root", "andrey403kvak");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Проблемы с подключением");
			e.printStackTrace();
			System.exit(0);
		}
	}
	@Override
	protected void finalize() throws Throwable
	{
		con.close();
		super.finalize();
	}
	@Override
	public DataProvider standardBookRead()
	{
		return new DataProvider(con, "SELECT * FROM books");
	}
	@Override
	public DataProvider authorBookRead(String str, String str1)
	{
		return new DataProvider(con, "SELECT * FROM author_conformity WHERE author_id = (SELECT DISTINCT id FROM authors WHERE name = '" + str + "' AND fname = '" + str1 + "');");
	}
	@Override
	public DataProvider issuedBookRead()
	{
		return new DataProvider(con, "SELECT * FROM s_cards;");
	}
	@Override
	public DataProvider rootControl(String command)
	{
		return new DataProvider(con, command);
	}
	@Override
	public DataProvider getFacultities()
	{
		return new DataProvider(con, "SELECT FacultityName FROM faculties LIMIT 500");
	}

}
