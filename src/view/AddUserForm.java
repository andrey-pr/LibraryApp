package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Student;
import providers.FacultityProvider;
import providers.GroupsProvider;
import providers.StudentProvider;

public class AddUserForm extends JPanel implements ActionListener
{
	JComboBox<Object> facultities;
	JComboBox<Object> groups;
	JTextField name;
	JTextField fname;
	JTextField mname;
	JTextField phone;
	JTextField logbook;
	JButton save;
	public AddUserForm()
	{
		Object[] o = new FacultityProvider().getFacultityNames().toArray();
		facultities = new JComboBox<Object>(o);
		groups = new JComboBox<Object>(new GroupsProvider().getGroupNamesByFacultity(o[0].toString()).toArray());
		save = new JButton("Сохранить");
		name = new JTextField("Имя         ");
		fname = new JTextField("Фамилия     ");
		mname = new JTextField("Отчество    ");
		phone = new JTextField("Телефон     ");
		logbook = new JTextField("Зачетка     ");
		name.setSize(20, 100);
		facultities.addActionListener(this);
		save.addActionListener(this);
		add(facultities);
		add(groups);
		add(name);
		add(fname);
		add(mname);
		add(phone);
		add(logbook);
		add(save);
	}
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Сохранить"))
		{
			new StudentProvider().saveStudent(new Student(facultities.getSelectedItem().toString(), groups.getSelectedItem().toString(), fname.getText(), name.getText(), mname.getText(), Integer.parseInt(logbook.getText())), phone.getText());
		}
		else
		{
			@SuppressWarnings("unchecked")
			JComboBox<Object> box = (JComboBox<Object>)ae.getSource();
			groups.setModel(new DefaultComboBoxModel<Object>(new GroupsProvider().getGroupNamesByFacultity(box.getSelectedItem().toString()).toArray()));
		}
//		remove(groups);
//		groups = new JComboBox<Object>(new GroupsProvider().getGroupNamesByFacultity(box.getSelectedItem().toString()).toArray());
//		add(groups);
//		repaint();
//		revalidate();
//		invalidate();
//		System.out.println();
		
	}

}
