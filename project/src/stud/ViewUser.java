package stud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class ViewUser {

	public String view(Userbean ub) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("in view connection");
		String div=null;
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@202.141.152.20:1521:xe","DAC14_140840320039","140840320039");
		
		ps=con.prepareStatement("select * from student_master1");
		
		System.out.println("after prepared statement");
		System.out.println(ub.getUser_id());
		
		//System.out.println(ub.getUser_id());
		
		rs=ps.executeQuery();
		System.out.println("hey"+rs);
		while(rs.next())
		{
			
			
			
			ub.setUser_id(rs.getString(1));
			/*ub.setFirstname(rs.getString(3));
			ub.setLastname(rs.getString(4));
			ub.setFather_name(rs.getString(5));
			ub.setMother_name(rs.getString(6));
			ub.setGender(rs.getString(7));
			ub.setEmail(rs.getString(8));
			ub.setDob(rs.getString(9));
			ub.setBlood_group(rs.getString(10));
			ub.setAddress(rs.getString(11));
			ub.setCity(rs.getString(12));
			ub.setPin_code(rs.getString(13));
			ub.setState(rs.getString(14));
			ub.setMobile(rs.getString(15));
			ub.setAlternate_mobile(rs.getString(16));
			ub.setNationality(rs.getString(17));
			ub.setReligion(rs.getString(18));
			ub.setCategory(rs.getString(19));
			ub.setCourse(rs.getString(20));
			*/
			System.out.println("found return");
			System.out.println(rs.getString(1));
			
			div=ub.getUser_id();
			System.out.println("heyyy"+div);
			return "found";
			
		}
		
		return "error";
	}

}
