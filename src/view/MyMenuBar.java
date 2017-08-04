package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MyMenuBar extends JMenuBar implements ActionListener
{

	public MyMenuBar()
	{
		JMenu newMenu = new  JMenu("Помощь");
		 
		JMenuItem help = new JMenuItem("Помощь");
		newMenu.add(help);
		help.addActionListener(this);
		add(newMenu);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null, "");
		
	}

}
