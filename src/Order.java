import static java.lang.System.out;

import java.util.*;

public class Order extends Product {
	void EditProduct()
	{
		out.println(" 1- Edit Product \n 2- Cancel Product");
		Scanner C = new Scanner(System.in);
		int choice;
		choice = C.nextInt();
		Scanner E = new Scanner(System.in);
		int EID;
		if(choice == 1)
		{
			out.println("Enter Edited Product ID: ");
			EID = E.nextInt();
			for(int i = 0; i < PId.size();i++)
			{
				if(EID == PId.get(i))
				{
					ProductList.set(i , EID);
					out.println("Successful Edited");
				}else
					out.println("Doesn't Exist Try another something");
			}
		}
		else if(choice == 2)
		{
			if(ProductList.isEmpty())
			{
				out.println("There Is No products To Remove! ");
			}
			else
			{
				out.println("Enter Canceled Order!");
				EID = E.nextInt();
				for(int i = 0; i < ProductList.size();i++)
				{
					if(EID == ProductList.get(i))
					{
						ProductList.remove(EID);
						out.println("Successful");
					}else
						out.println("Doesn't Exist Try another something");
				}
			}
			
		}
		
	}
}
	  