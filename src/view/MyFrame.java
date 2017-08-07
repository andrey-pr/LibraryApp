package view;


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MyFrame extends JFrame
{
	private MyMenuBar _menuBar;
	private MyToolBar _toolBar;
	private JScrollPane _contentPane;
	private ToolButtonListener _manager;
	public MyFrame()
	{
		super("DB");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(800, 600);
		setLocationByPlatform(true);
		_menuBar = new MyMenuBar();
		_toolBar = new MyToolBar();
		_contentPane = new JScrollPane();
		_manager = new ToolButtonListener(_contentPane);
		setJMenuBar(_menuBar);
		_toolBar._standardbookread.addActionListener(_manager);
		_toolBar._authorbookread.addActionListener(_manager);
		_toolBar._issuedbookread.addActionListener(_manager);
		_toolBar._rootcontrol.addActionListener(_manager);
		_toolBar._beercount.addActionListener(_manager);
		_toolBar._adduser.addActionListener(_manager);
		getContentPane().add(_toolBar, BorderLayout.NORTH);
		getContentPane().add(_contentPane, BorderLayout.CENTER);
		setVisible(true);
	}
	
}
