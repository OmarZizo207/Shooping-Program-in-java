import static java.lang.System.out;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Product extends AddProduct {
//	String Name;
//	int id;
//	String Category;
//	String Price;
//	String Details;
	static List<Integer> ProductList = new ArrayList<Integer>();
	
	public Product()
	{
		
	}
	
	
//	boolean SearchProduct(int SID)
//	{
//		Scanner S = new Scanner(System.in);
//		out.println("Enter Product ID: ");
//		SID = S.nextInt();
//		Product S = new Product();
//		for(int i = 0; i < S.PId.size(); i++)
//		{
//			if(SID == S.PId.get(i))
//			{
//				return true;
//			}
//			else
//				return false;
//		}
//	}
	void DisplayProducts()
	{
//		int SearchId;
//		Scanner D = new Scanner(System.in);
//		out.println("Enter Product ID: ");
//		SearchId = D.nextInt();
//		Product P = new Product();
		for(int i = 0; i < PId.size(); i++)
		{
			out.println("Product Number " + (i+1));
				out.println("Product ID Is: " + PId.get(i));
				out.println("Product Name Is: " + PName.get(i));
				out.println("Product Price Is: " + PPrice.get(i));
				out.println("Product Category Is: " + PCategory.get(i));
				out.println("*************************");
		}				
	}
	void SelectProduct()
	{
		int SID;
		Scanner S = new Scanner(System.in);
		out.println("Enter Product ID: ");
		SID = S.nextInt();
//		Product s = new Product();
		for(int i = 0; i < PId.size(); i++)
		{
			if(SID == PId.get(i))
			{
				out.println("*******Product Details********");
				out.println("Product ID Is: " + PId.get(i));
				out.println("Product Name Is: " + PName.get(i));
				out.println("Product Price Is: " + PPrice.get(i));
				out.println("Product Category Is: " + PCategory.get(i));
			}
		}
	}
	
	void BuyProduct()
	{
		Scanner L = new Scanner(System.in);
		int LID;
		out.println("Enter Product ID: ");
		LID = L.nextInt();
		ProductList.add(LID);
		for(int i = 0; i < ProductList.size();i++)
		{
			if(LID == ProductList.get(i))
			{
				out.println("Added Successfully :)");
			}
		}
	}
	
	void DisplayBuy()
	{
		for(int i = 0; i < ProductList.size(); i++)
		{
			if(ProductList.isEmpty())
			{
				out.println("Buying List is Empty");
			}
			else
			{
				out.println("Buying List Is:");
				out.println("Product Number" + (i+1) );
				out.println("Product ID: " + ProductList.get(i));
				out.println("Product Name: " + PName.get(i));
				out.println("Product Price: " + PPrice.get(i));
				out.println("Product Category: " + PCategory.get(i));
				out.println("*********************");
		
			}
				}
	}
	
	// Edit Fun Rip

}
