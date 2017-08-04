package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionHolder
{
	public Connection con;
	private ConnectionHolder()
	{
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib2","root", "andrey403kvak");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Проблемы с подключением");
			e.printStackTrace();
			System.exit(0);
		}
	}
	private static class SingletonHolder
	{
		private static ConnectionHolder instance = new ConnectionHolder();
	}
	public static ConnectionHolder getInstance()
	{
		return SingletonHolder.instance;
	}

}
