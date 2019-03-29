import static java.lang.System.out;

import java.util.Scanner;

public class StoreOwner extends AddProduct{

	static private String StoreName;
	static private int StoreID;

	public StoreOwner()//int StoreID , String StoreName
	{
//		this.StoreID = StoreID;
//		this.StoreName = StoreName;
	}
	public int Get_StoreID()
	{
		return StoreID;
	}
	
	public void Set_StoreID(int StoreID)
	{
		this.StoreID = StoreID;
	}
	public String Get_StoreName()
	{
		return StoreName;
	}
	
	public void Set_StoreName(String StoreName)
	{
		this.StoreName = StoreName;
	}

	public void Store_Add(int i , String a)
	{
		StoreID = i; StoreName = a;
		StoreOwner add = new StoreOwner();
		if(i == 1 && a.equals("admin"))
		{
			add.Add();
		}else
		{
			out.println("your permission aren't allow to add products");
		}
	}
	public void Store_Edit()
	{
		Scanner E = new Scanner(System.in);
		int Eid;
		int EPrice;
		String ECategory;
		String EName;
		out.println("Enter Edited ID:");
		Eid = A1.nextInt();
		out.println("Enter Edited Name:");
		EName = A2.nextLine();
		out.println("Enter Edited Price:");
		EPrice = A3.nextInt();
		out.println("Enter Edited Category:");
		ECategory = A4.nextLine();
		for(int i = 0; i < PId.size() ;i++)
		{
			if(Eid == PId.get(i))
			{
				PId.set(i, Eid);
				PName.set(i, EName);
				PPrice.set(i, EPrice);
				PCategory.set(i, ECategory);
				out.println("Edited Successfully");
			}
			else
			{
				out.println("This Product ID Doesn't Exist!");
			}
		}
	}

}
