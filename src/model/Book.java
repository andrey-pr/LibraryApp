package model;

public class Book
{
	private String name;
	private String ISBN;
	private int yearPress;
	private String theme;
	private String category;
	private String press;
	private int pages;
	private String comment;
	private int quantity;
	public Book(String name, String iSBN, int yearPress, String theme, String category, String press, int pages, String comment, int quantity)
	{
		this.name = name;
		ISBN = iSBN;
		this.yearPress = yearPress;
		this.theme = theme;
		this.category = category;
		this.press = press;
		this.pages = pages;
		this.comment = comment;
		this.quantity = quantity;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getISBN()
	{
		return ISBN;
	}
	public void setISBN(String iSBN)
	{
		ISBN = iSBN;
	}
	public int getYearPress()
	{
		return yearPress;
	}
	public void setYearPress(int yearPress)
	{
		this.yearPress = yearPress;
	}
	public String getTheme()
	{
		return theme;
	}
	public void setTheme(String theme)
	{
		this.theme = theme;
	}
	public String getCategory()
	{
		return category;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	public String getPress()
	{
		return press;
	}
	public void setPress(String press)
	{
		this.press = press;
	}
	public int getPages()
	{
		return pages;
	}
	public void setPages(int pages)
	{
		this.pages = pages;
	}
	public String getComment()
	{
		return comment;
	}
	public void setComment(String comment)
	{
		this.comment = comment;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
}
