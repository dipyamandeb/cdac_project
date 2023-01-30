package combo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Register_Stud {

	public int register(Student_Bean sb) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		int temp = 0;
		
		Connection con=null;
		PreparedStatement ps=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@202.141.152.20:1521:xe","DAC14_140840320039","140840320039");
		
		ps=con.prepareStatement("insert into student1 values(?,?,?)");
		
		ps.setString(1, sb.getStud_id());
		ps.setString(2, sb.getStud_fname());
		ps.setString(3, sb.getStud_lname());
		
		temp=ps.executeUpdate();
		
		return temp;
	}

}
