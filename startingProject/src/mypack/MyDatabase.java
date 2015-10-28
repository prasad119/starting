package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyDatabase 
{
	public static void main(String[] args) throws Exception,ClassNotFoundException 
	{
		//get Driver class dynamically w.r.t Ms Access
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//connect to database
		Connection con=DriverManager.getConnection("jdbc:odbc:kalam");
		//ExecuteStatement 
		Statement st=con.createStatement();
		st.executeUpdate("update orders set cutomer_name='stevejobs' where order_number=4");
		ResultSet rs=st.executeQuery("select * from orders");
		while(rs.next())
		{
			String o=rs.getString(1);
			if(o.equals("stevejobs"))
			{
				System.out.println("updated Successfully");
			}
			else
			{
				System.out.println("updation not possible");
			}
		}
		con.close();
	}

}
