package model;

public class Student
{
	private String facultity;
	private String name;
	private String lname;
	private String mname;
	private String group;
	private int logbook;
	public Student(String facultity, String group, String name, String lname, String mname, int logbook)
	{
		this.facultity = facultity;
		this.name = name;
		this.lname = lname;
		this.mname = mname;
		this.group = group;
		this.logbook = logbook;
	}
	public String getFacultity()
	{
		return facultity;
	}
	public void setFacultity(String facultity)
	{
		this.facultity = facultity;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getLname()
	{
		return lname;
	}
	public void setLname(String lname)
	{
		this.lname = lname;
	}
	public String getGroup()
	{
		return group;
	}
	public void setGroup(String group)
	{
		this.group = group;
	}
	public String getMname()
	{
		return mname;
	}
	public void setMname(String mname)
	{
		this.mname = mname;
	}
	public int getLogbook()
	{
		return logbook;
	}
	public void setLogbook(int logbook)
	{
		this.logbook = logbook;
	}
}
