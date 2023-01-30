package combo;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Student_Register extends ActionSupport implements ModelDriven<Student_Bean> {

	
	private static final long serialVersionUID = 1L;
	
	Student_Bean sb=new Student_Bean();
	@Override
	public Student_Bean getModel() {
		// TODO Auto-generated method stub
		return sb;
	}
	public void validate()
	{
		if(sb.getStud_id().equals(""))
		{
			addFieldError("stud_id", "Student id required");
		}
		if(sb.getStud_fname().equals(""))
		{
			addFieldError("stud_fname", "Firstname required");
		}
	}
	public String execute()
	{
		Register_Stud r=new Register_Stud();
		
		try {
			int i=r.register(sb);
			
			if(i>0)
			{
				return "success";
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error";
	
	}
	
	

}
