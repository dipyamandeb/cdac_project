package combo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public int delete(DeleteBean db) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		int temp;
		
		Connection con=null;
		PreparedStatement ps=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@202.141.152.20:1521:xe","DAC14_140840320039","140840320039");
		ps=con.prepareStatement("delete from book where book_id=? ");
		ps.setString(1, db.getBook_id() );
		
		temp=ps.executeUpdate();
		
		return temp;
	}

}
