import static java.lang.System.out;

import java.util.Scanner;


public class RemoveProduct extends AddProduct{
	private static int R_id;
//	private String R_name;
	
	public RemoveProduct()
	{
		
	}
	public void Remove()
	{
		Scanner R = new Scanner(System.in);
//		Scanner Rn = new Scanner(System.in);
		out.println("Enter ID:");
		R_id = R.nextInt();
//		out.println("Enter ID:");
//		R_name = Rn.nextLine();
		
		for(int i = 0; i < PId.size() ;i++)
		{
			if(R_id == PId.get(i))
			{
				PId.remove(i);
				PName.remove(i);
				PPrice.remove(i);
				PCategory.remove(i);
				out.println("Removed Successfully");
			}
			else
			{
				out.println("This Product ID Doesn't Exist!");
			}
		}
	}
	
}




