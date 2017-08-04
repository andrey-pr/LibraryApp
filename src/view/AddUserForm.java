package view;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class AddUserForm extends JPanel
{
	JComboBox<String> facultities;
	JComboBox<String> groups;
	JButton cancel;
	JButton save;
	public AddUserForm()
	{
		facultities = new JComboBox<String>();
		groups = new JComboBox<String>();
		cancel = new JButton("cancel");
		save = new JButton("save");
		add(facultities);
		add(groups);
		add(cancel);
		add(save);
	}

}
