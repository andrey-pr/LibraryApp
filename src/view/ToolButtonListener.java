package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.DataTableModel;
import providers.BookProvider;

public class ToolButtonListener implements ActionListener
{
	JScrollPane _mp;
	public ToolButtonListener(JScrollPane mp)
	{
		_mp = mp;
		mountTable(new BookProvider().getBooksRS());
	}
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		switch(ae.getActionCommand())
		{
		case "SBR": mountTable(new BookProvider().getBooksRS()); break;
//		case "ABR": mountTable(_cartridge.authorBookRead(JOptionPane.showInputDialog("¬ведите им€ автора:"), JOptionPane.showInputDialog("¬ведите фамилию автора:"))); break;
//		case "IBR": mountTable(_cartridge.issuedBookRead()); break;
//		case "RC": mountTable(_cartridge.rootControl(JOptionPane.showInputDialog("¬ведите команду"))); break;
		case "BC": mountText("¬ам должны " + new BookProvider().countBeer()  + " бокалов пива"); break;
		case "AU": mountPanel(new AddUserForm()); break;
		}
		_mp.repaint();
		_mp.revalidate();
		_mp.invalidate();
	}
	private void mountTable(ResultSet rs)
	{
		_mp.setViewportView(new JTable(new DataTableModel(rs)));

	}
	private void mountText(String str)
	{
		_mp.setViewportView(new JLabel(str));

	}
	private void mountPanel(JPanel panel)
	{
		_mp.setViewportView(panel);

	}
}
