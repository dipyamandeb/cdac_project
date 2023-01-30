package module1;


import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.omg.CORBA.Request;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Login_Check extends ActionSupport implements ModelDriven<Userbean>,SessionAware{


	private static final long serialVersionUID = 1L;

	Userbean ub=new Userbean();
	@Override
	public Userbean getModel() {
		// TODO Auto-generated method stub
		return ub;
	}
	
	private SessionMap<String,Object> sessionMap;
	
	public SessionMap<String, Object> getSessionMap() {
		return sessionMap;
	}

	public void setSessionMap(SessionMap<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	public String execute()
	{
		System.out.println("111");
		
		
		
		if(ub.getUser_id().equals("admin"))
		{
			
			System.out.println("123");
			CheckUser ck=new CheckUser();
			System.out.println("124");
			boolean i;
			try {
				i = ck.check(ub);
				if(i)
				{
					sessionMap.put("admin", ub);
					return "admin";
				}
				else
				{
					System.out.println("125");
					return "login_again";
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		else if(ub.getUser_id().equals("operator"))
		{
			System.out.println("a");
			CheckUser ck=new CheckUser();
			System.out.println("b");
			boolean i;
			try {
				i = ck.check(ub);
				if(i)
				{
					sessionMap.put("operator", ub);
					return "operator";
				}
				else
				{
					System.out.println("c");
					return "login_again";
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else 
		{
			
			System.out.println("d");
			
			CheckUser ck=new CheckUser();
			
			System.out.println("e");
			boolean i;
			try {
				i = ck.check(ub);
				if(i)
				{
					
					sessionMap.put("student", ub.getUser_id());
					System.out.println(ub.getUser_id());
					System.out.println("in student");
					return "student";
				}
				else
				{
					System.out.println("f");
					return "login_again";
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return null;

	}

	@Override
	public void setSession(Map<String, Object> map) {
		 sessionMap=(SessionMap<String, Object>)map;
	}

}
