package Docs;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Verification extends ActionSupport implements ModelDriven<UserBean> {

	
	private static final long serialVersionUID = 1L;
	
	UserBean ub=new UserBean();

	@Override
	public UserBean getModel() {
		
		
		

		return ub;
	}
	

	public String execute() throws ClassNotFoundException, SQLException
	{

		CheckUser ck=new CheckUser();
		int i=0;
		
		i = ck.check(ub);
		System.out.println("iii"+i);
		if(i>0)
		{
			
			
			return "success";
			
			
		}
		else
		{
			
			return "error";
		}
		
		
		
		}
}
