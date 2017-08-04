package model;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.table.AbstractTableModel;

import providers.DataProvider;


public class DataTableModel extends AbstractTableModel
{
	private ResultSetMetaData _metadata;
	private ResultSet _rs;

	public DataTableModel(ResultSet rs)
	{
		_rs = rs;
		try
		{
			_metadata = _rs.getMetaData();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public int getColumnCount()
	{
		// TODO Auto-generated method stub
		try
		{
			return _metadata.getColumnCount();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int getRowCount()
	{
		// TODO Auto-generated method stub
		try
		{
			_rs.last();
			return _rs.getRow();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Object getValueAt(int row, int collumn)
	{
		// TODO Auto-generated method stub
		try
		{
			_rs.absolute(row+1);
			return _rs.getObject(collumn + 1);
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getColumnName(int column)
	{
		// TODO Auto-generated method stub
		try
		{
			return _metadata.getColumnName(column+1);
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.getColumnName(column+1);
	}

}
