package trash;
import java.sql.ResultSet;

import providers.DataProvider;

public interface DBCartridge
{
	public DataProvider standardBookRead();
	public DataProvider authorBookRead(String str, String str1);
	public DataProvider issuedBookRead();
	public DataProvider rootControl(String command);
	public DataProvider getFacultities();
}
