package model;

public class Facultity
{
	String name;
	String phone;
	public Facultity(String name, String phone)
	{
		this.name = name;
		this.phone = phone;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
}
