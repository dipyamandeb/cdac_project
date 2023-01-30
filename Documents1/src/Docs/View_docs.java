package Docs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class View_docs extends ActionSupport implements ModelDriven<UserBean> {

	
	private static final long serialVersionUID = 1L;
		UserBean ub=new UserBean();
		
	@Override
	public UserBean getModel() {
		
		return ub;
	}
	
	public String execute()
	{
		
		
		try 
		
		{
			

			Connection con=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@202.141.152.20:1521:xe","DAC14_140840320039","140840320039");
			
			ps=con.prepareStatement("select * from STUDENT_DOCS where doc1='false' or doc2='false' or doc3='false' or doc4='false'");
			//ps.setString(1,ub.getUser_id());
			rs=ps.executeQuery();
			
			System.out.println("hello"+rs);
		while(rs.next())
		{
			System.out.println(rs.getString(2));
			ub.setBatch_ID(rs.getString(1));
			ub.setStudent_ID(rs.getString(2));
			ub.setDoc1(rs.getString(3));
			ub.setDoc2(rs.getString(4));
			ub.setDoc3(rs.getString(5));
			ub.setDoc4(rs.getString(6));
			


			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			"found";
		
			
		}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		return "not_found";
		
		
		
		
		

		
	}

}
