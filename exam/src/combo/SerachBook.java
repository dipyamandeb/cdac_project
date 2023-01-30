package combo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SerachBook {

	public String search(SearchBean sb) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@202.141.152.20:1521:xe","DAC14_140840320039","140840320039");
		ps=con.prepareStatement("select * from book where book_id=? or book_name=? or author_name=?");
		ps.setString(1, sb.getBook_id());
		ps.setString(2,sb.getBook_name());
		ps.setString(3,sb.getAuthor_name());
		
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println("Displaying Book Details");
			return "found";
		}
		return "not_found";
		
	}

}
