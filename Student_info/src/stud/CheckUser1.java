package stud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CheckUser1 {

	public String check(Userbean ub) throws ClassNotFoundException, SQLException {
		
		ArrayList<Userbean> list1=new ArrayList<Userbean>();
		

		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@202.141.152.20:1521:xe","DAC14_140840320039","140840320039");
		
		ps=con.prepareStatement("Select * from divs");
		
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			Userbean u=new Userbean();
		ub.setFname(rs.getString(1));
		ub.setLname(rs.getString(2));
		ub.setFaname(rs.getString(3));
		ub.setMoname(rs.getString(4));
		ub.setCa(rs.getString(5));
		ub.setEmail(rs.getString(6));
		ub.setBloodg(rs.getString(7));
		ub.setDob(rs.getString(8));
		ub.setMobile(rs.getString(9));
		ub.setAddress(rs.getString(10));
		ub.setNationality(rs.getString(11));
		ub.setCity(rs.getString(12));
		ub.setState(rs.getString(13));
		ub.setCategory(rs.getString(14));
		ub.setReligion(rs.getString(15));
		
		list1.add(u);
		
		}
	
		return null;
	}

}
