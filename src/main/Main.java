package main;

import view.MyFrame;

public class Main
{
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			new MyFrame();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
