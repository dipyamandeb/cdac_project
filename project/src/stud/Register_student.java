package stud;

import java.sql.SQLException;

import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Register_student extends ActionSupport implements ModelDriven<Userbean> {

	
	private static final long serialVersionUID = 1L;
	
	Userbean ub=new Userbean();

	@Override
	public Userbean getModel() {
		
		
		return ub;
	}
	
	private SessionMap<String,Object> sessionMap;
	
	public String execute() throws ClassNotFoundException, SQLException
	{
		sessionMap.put("student", ub.getUser_id());
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
