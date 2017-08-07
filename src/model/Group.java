package model;

public class Group
{
	private String name;
	private String facultityName;
	public Group(String name, String facultityName)
	{
		this.name = name;
		this.facultityName = facultityName;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getFacultityName()
	{
		return facultityName;
	}
	public void setFacultityName(String facultityName)
	{
		this.facultityName = facultityName;
	}
}
