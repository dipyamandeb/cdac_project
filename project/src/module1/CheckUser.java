package module1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckUser {

	

	public boolean check(Userbean ub) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@202.141.152.20:1521:xe","DAC14_140840320039","140840320039");
		ps=con.prepareStatement("select * from student_master1 where user_id=? and password=? ");
		System.out.println("before");
		ps.setString(1, ub.getUser_id());
		ps.setString(2, ub.getPassword());
		
		
		rs=ps.executeQuery(); 
		System.out.println("after");
		if(rs.next())
		{
				ub.setUser_id(rs.getString(1));
				System.out.println(rs.getString(1));
				System.out.println(ub.getUser_id());
				System.out.println("hii");
				return true;
			
	
		}
		else
		{
			return false;
		}
		
	
	}

}
