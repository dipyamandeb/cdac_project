package combo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Book_data {

	public int insert(Book_Bean bb) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		int temp;
		
		Connection con=null;
		PreparedStatement ps=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@202.141.152.20:1521:xe","DAC14_140840320039","140840320039");
		
		ps=con.prepareStatement("insert into book values(?,?,?)");
		
		ps.setString(1, bb.getBook_id());
		ps.setString(2, bb.getBook_name());
		ps.setString(3, bb.getAuthor_name());
		
		temp=ps.executeUpdate();
		
		return temp;
	}

}
