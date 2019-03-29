import static java.lang.System.out;

import java.util.Scanner;
//import java.
public class Main { 
	public static void main (String args[])
	{
		Registration Re = new Registration();
		Product D = new Product();
		StoreOwner S = new StoreOwner();
		RemoveProduct R = new RemoveProduct();
		AddProduct O = new AddProduct();
		payment P = new payment();
		Order OR = new Order();
		Rating r = new Rating();
		
		Scanner C = new Scanner(System.in);
		int Choice;
		while(true)
		{
			out.println(" 1- User \n 2- Adminstrator ");
		
			Choice = C.nextInt();
			if(Choice == 1)
			{
				Scanner Log = new Scanner(System.in);
				int log = 0;
				out.println(" 1- Sign UP \n 2- Log In");
				log = Log.nextInt();
				
				if(log == 1)
				{
					out.println("************* Sign UP *************");
					Re.Reg();
				}
				else if(log == 2)
				{
					User user = new User();
					int ID = 0; 
					String Pass = "";
					Scanner LoginID = new Scanner(System.in);
					Scanner LoginPass = new Scanner(System.in);
					
					out.println("Enter Your ID:");
					ID = LoginID.nextInt();
					out.println("Enter Your Password:");
					Pass = LoginPass.nextLine();
					user.VerifyLogin(ID, Pass);
				}
				else 
				{
					out.println("Wrong Choice!");
				}
				
				Scanner choose = new Scanner(System.in);
				int Choose =0;
				
				while(Choose != 6)
				{	
					out.println("**********************************************************");
					out.println(" 1- Display Products \n 2- Select Product \n 3- Buy Product ");
					out.println(" 4- Edit Product \n 5- Buying List \n 6- Exit");
					out.println("**********************************************************");
					Choose = choose.nextInt();
					
					if(Choose == 1)
					{
						D.DisplayProducts();
					}
					else if(Choose == 2)
					{
						D.SelectProduct();
					}
					else if(Choose == 3)
					{
						D.BuyProduct();
						Scanner Price = new Scanner(System.in);
						int price;
						out.println("Enter Product Price:");
						price = Price.nextInt();
						P.paying(price);
						//Then Shipping Fun  ( Doesn't Exist )
						r.addingRate();
					}
					else if(Choose == 4)
					{
						OR.EditProduct();
					}
					else if(Choose == 5)
					{
						D.DisplayBuy();
					}
				}
			}
			else if(Choice == 2)
			{
				Scanner s = new Scanner(System.in);
				Scanner c = new Scanner(System.in);
				int id = 0;
				String pas = "";	
				out.println("Enter Admin ID");
				id = s.nextInt();
				out.println("Enter Admin Password");
				pas = c.nextLine();
				User u = new User();
				u.VerifyLogin(id, pas);
				
				int store = 0;
				while(store != 5)
				{
					Scanner Store = new Scanner(System.in);
					out.println("**********************************************************");
					out.println(" 1- Add Product \n 2- Remove Product \n 3- Edit Product \n 4- Display");
					out.println(" 5- Exit");
					out.println("**********************************************************"); 	
					store = Store.nextInt();
					if(store == 1)
					{
						S.Store_Add(id , pas);
					}
					else if(store == 2)
					{
						R.Remove();
					}
					else if(store == 3)
					{
						S.Store_Edit();
					}
					else if(store == 4)
					{
						O.Display();
					}
//					else if(store == 5)
//					{
//						break;
//					}
				}
				
			}
		}
	}
	
}
