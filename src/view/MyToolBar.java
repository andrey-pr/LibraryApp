package view;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class MyToolBar extends JToolBar
{
	public JButton _standardbookread;
	public JButton _authorbookread;
	public JButton _issuedbookread;
	public JButton _rootcontrol;
	public JButton _beercount;
	public MyToolBar()
	{
		_standardbookread = new JButton("SBR");
		_authorbookread = new JButton("ABR");
		_issuedbookread = new JButton("IBR");
		_rootcontrol = new JButton("RC");
		_beercount = new JButton("BC");
		add(_standardbookread);
//		add(_authorbookread);
//		add(_issuedbookread);
//		add(_rootcontrol);
		add(_beercount);
	}

}
