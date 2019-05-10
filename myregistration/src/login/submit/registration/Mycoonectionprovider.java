package login.submit.registration;
import java.sql.Connection;
import java.sql.DriverManager;

public class Mycoonectionprovider implements MyProvider{
	static Connection con=null;
	public static Connection getCon()
	{
		try
		{
			Class.forName("oracle.jdbc.Driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",username,pwd);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}

	

}
