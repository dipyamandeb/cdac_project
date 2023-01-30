package stud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CheckUser {

	

	public int check(Userbean ub) throws SQLException, ClassNotFoundException {
		
		
		Connection con=null;
		PreparedStatement ps=null;
		//ResultSet rs=null;
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@202.141.152.20:1521:xe","DAC14_140840320039","140840320039");
		
		ps=con.prepareStatement("insert into divs values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
		ps.setString(1,ub.getFname());
		ps.setString(2, ub.getLname());
		ps.setString(3, ub.getAddress());
		ps.setString(4,ub.getBloodg());
		ps.setString(5,ub.getCa());
		ps.setString(6,ub.getCategory());
		ps.setString(7,ub.getCity());
		ps.setString(8,ub.getDob());
		ps.setString(9,ub.getEmail());
		ps.setString(10,ub.getMobile());
		ps.setString(11,ub.getMoname());
		ps.setString(12,ub.getNationality());
		ps.setString(13,ub.getRegion());
		ps.setString(14,ub.getState());
		ps.setString(15,ub.getFaname());
		
		
		int x=0;
		int y=-2;
		x=ps.executeUpdate();
		System.out.println("xxxx"+x);
		if(x>0)
		{
			
			return x;
			
		}
		
		else
		{
			return y;
		}
		
		
		
		
		
	}

}
