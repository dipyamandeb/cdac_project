package combo;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Add_book extends ActionSupport implements ModelDriven<Book_Bean>{

	
	private static final long serialVersionUID = 1L;

		Book_Bean bb=new Book_Bean();
	@Override
	public Book_Bean getModel() {
		// TODO Auto-generated method stub
		return bb;
	}
	
	public String execute()
	{
		Book_data db=new Book_data();
		
		try {
			int i= db.insert(bb);
			
			if(i>0)
			{
				return "book_added";
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "book_not_added";
		
		
		
	
	}
	
	

}
