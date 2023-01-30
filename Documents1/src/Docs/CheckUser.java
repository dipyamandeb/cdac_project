package Docs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CheckUser {



	public int check(UserBean ub) throws ClassNotFoundException, SQLException {
		
		
		
		Connection con=null;
		PreparedStatement ps=null;
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@202.141.152.20:1521:xe","DAC14_140840320039","140840320039");
		
		ps=con.prepareStatement("insert into STUDENT_DOCS (BATCH_ID,STUDENT_ID,DOC1,DOC2,DOC3,DOC4) values(?,?,?,?,?,?)");
		ps.setString(1, ub.getBatch_ID());
		ps.setString(2, ub.getStudent_ID());
		ps.setString(3, ub.getDoc1());
		ps.setString(4,ub.getDoc2());
		ps.setString(5, ub.getDoc3());
		ps.setString(6, ub.getDoc4());
		
		
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
