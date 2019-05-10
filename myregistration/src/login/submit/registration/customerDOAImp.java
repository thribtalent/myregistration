package login.submit.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class customerDOAImp implements customerDOA {
	static Connection con;
	static PreparedStatement ps;

	@Override
	public int insertcustomer(customer c) {
		int status=0;
		try
		{
			con=Mycoonectionprovider.getCon();
			ps=con.prepareStatement("insert into customer values(?,?,?)");
			ps.setString(1, c.getname());
			ps.setString(2, c.getusername());
			ps.setString(3, c.getpassword());
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}

	@Override
	public customer getcustomer(String username, String pass) {
		customer c=new customer();
		
		try
		{
			con=Mycoonectionprovider.getCon();
			ps=con.prepareStatement("select * from customer where username=? and password=?");
			ps.setString(1, c.getusername());
			
			ps.setString(2, c.getpassword());
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				c.setusername(rs.getString(1));
				c.setname(rs.getString(2));
				c.setpassword(rs.getString(3));
			}
			
		}
		catch(Exception e)
		{
			System.out.println();
		}
		return c;
	}

}
