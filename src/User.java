import static java.lang.System.out;

import java.util.Scanner;
public class User {
	private int ID;
	private String Password;
	
	public User()//int ID , String Password
	{
//		this.ID = ID;
//		this.Password = Password;
	}
	
	public int Get_ID()
	{
		return ID;
	}
	
	public void Set_ID(int ID)
	{
		this.ID = ID;
	}
	public String Get_Password()
	{
		return Password;
	}
	
	public void Set_Password(String Password)
	{
		this.Password = Password;
	}
	
	public void VerifyLogin(int id , String pass)
	{
//		User s = new User();//id , pass
//		id = s.Get_ID();
//		pass = s.Get_Password();
		
		if(id  >= 1 && pass.length() > 1)
		{
			out.println("Successful Login ");
		}
		else
		{
			out.println("Failed Login! ");
		}
	}

}
