package stud;

import java.sql.SQLException;

import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class View_Action extends ActionSupport implements ModelDriven<Userbean>{

	
	private static final long serialVersionUID = 1L;
	Userbean ub=new Userbean();
	@Override
	public Userbean getModel() {
		// TODO Auto-generated method stub
		return ub;
	}
	
	
	public String execute()
	{
		
		ViewUser v=new ViewUser();
		String s=null;
		try {
			s = v.view(ub);
			if(s.equals("found"))
			{
				System.out.println("in view profile");
				
				return "success1";
				
			}
			else if(s.equals("error"))
			{
				return "error1";
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
		
		
		
	}

}
