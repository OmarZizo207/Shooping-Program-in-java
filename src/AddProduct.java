import static java.lang.System.out;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class AddProduct  {
	static String P_name;
	static int P_id;
	static String P_Category;
	static int P_Price;
	static List<String> PName = new ArrayList<String>();
	static List<Integer> PId = new ArrayList<Integer>();
	static List<Integer> PPrice = new ArrayList<Integer>();
	static List<String> PCategory = new ArrayList<String>();
	Scanner A1 = new Scanner(System.in);
	Scanner A2 = new Scanner(System.in);
	Scanner A3 = new Scanner(System.in);
	Scanner A4 = new Scanner(System.in);
	public AddProduct()
	{
		P_name = "";
		P_id = 0;
		P_Category="";
		P_Price=0;
	}
	void Add()
	{
		out.println("Enter Product ID :");
		P_id = A1.nextInt();
		
		if(PId.isEmpty())
		{
			PId.add(P_id);
			
			out.println("Enter Product Name :");
			P_name = A2.nextLine();
			PName.add(P_name);
			
			out.println("Enter Product Category :");
			P_Category = A3.nextLine();
			PCategory.add(P_Category);
			
			out.println("Enter Product Price :");
			P_Price = A4.nextInt();
			PPrice.add(P_Price);
			
		}
		else
		{
			for(int i = 0; i < PId.size(); i++)
			{
				if(P_id == PId.get(i))
				{
					out.println("This ID Is Taken");
					break;
					
				}
				else
				{
					PId.add(P_id);

					out.println("Enter Product Name :");
					P_name = A2.nextLine();
					PName.add(P_name);
					
					out.println("Enter Product Category :");
					P_Category = A3.nextLine();
					PCategory.add(P_Category);
					
					out.println("Enter Product Price :");
					P_Price = A4.nextInt();
					PPrice.add(P_Price);
				}
			}
		}
		
	}
	void Display()
	{
//		Product P = new Product();
		for(int i = 0; i < PId.size(); i++)
		{
			out.println("Product Number " + (i+1));
				out.println("Product ID Is: " + PId.get(i));
				out.println("Product Name Is: " + PName.get(i));
				out.println("Product Price Is: " + PPrice.get(i));
				out.println("Product Category Is: " + PCategory.get(i));
		}				
	}
	
	
	
}
