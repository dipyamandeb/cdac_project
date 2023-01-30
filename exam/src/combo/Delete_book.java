package combo;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Delete_book extends ActionSupport implements ModelDriven<DeleteBean>{

	
	private static final long serialVersionUID = 1L;
		DeleteBean db=new DeleteBean();
		@Override
		public DeleteBean getModel() {
			// TODO Auto-generated method stub
			return db;
		}
	
		
		public String execute() throws ClassNotFoundException, SQLException
		{
			
			Delete d=new Delete();
			
			int i=d.delete(db);
			
			if(i>0)
			{
				return "deleted";
			}
			else
				return "not_deleted";
			
			
			
		}

		
	
}
