package combo;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Search_book extends ActionSupport implements ModelDriven<SearchBean>{

	
	private static final long serialVersionUID = 1L;
	
	SearchBean sb=new SearchBean();
	@Override
	public SearchBean getModel() {
		// TODO Auto-generated method stub
		return sb;
	}

	public String execute()
	{
		SerachBook s=new SerachBook();
		
		try {
			String i=s.search(sb);
			if(i.equals("found"))
			{
				return "book_found";
			}
			else if(i.equals("not_found"))
			{
				return "not_found";
			}
				
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
		
	}
	
}
