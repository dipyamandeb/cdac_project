package stud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CheckUser {

	

	public int check(Userbean ub) throws SQLException, ClassNotFoundException {
		
		
		Connection con=null;
		PreparedStatement ps=null;
		
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@202.141.152.20:1521:xe","DAC14_140840320039","140840320039");
		
		ps=con.prepareStatement("insert into student_master1 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
		
		ps.setString(1,ub.getUser_id());
		ps.setString(2, ub.getPassword());
		ps.setString(3, ub.getFirstname());
		ps.setString(4, ub.getLastname());
		ps.setString(5, ub.getFather_name());
		ps.setString(6, ub.getMother_name());
		ps.setString(7, ub.getGender());
		ps.setString(8, ub.getEmail());
		ps.setString(9, ub.getDob());
		ps.setString(10, ub.getBlood_group());
		ps.setString(11, ub.getAddress());
		ps.setString(12, ub.getCity());
		ps.setString(13, ub.getPin_code());
		ps.setString(14, ub.getState());
		ps.setString(15, ub.getMobile());
		ps.setString(16, ub.getAlternate_mobile());
		ps.setString(17, ub.getNationality());
		ps.setString(18, ub.getReligion());
		ps.setString(19, ub.getCategory());
		ps.setString(20, ub.getCourse());
		
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
