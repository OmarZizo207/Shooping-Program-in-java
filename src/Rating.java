import java.util.*;

public class Rating {
	String notes;
	   int rate;
	   
	   void addingRate()
	   {
	       Scanner r = new Scanner(System.in);
	       System.out.println("Please enter your rate ");
	       int rating = r.nextInt();
	       
	                switch (rating)
	                {
	                    default:
	                        System.out.println("Invaild Rating");
	                        break;
	                        
	                    case 1:
	                        System.out.println("Your rating: Bad");;
	                        break;
	                    case 2:
	                        System.out.println("Your rating: Not Bad");
	                        break;
	                    case 3:
	                        System.out.println("Your rating:Good");
	                        break;
	                    case 4:
	                        System.out.println("Your rating: Very Good");
	                        break;
	                    case 5: 
	                        System.out.println("Your rating: Perfect");
	                        break;
	                }
	           
	       System.out.println("Thanks for rating");
	        
	   }
	    public static void main(String[] args) {
	        
	        Rating r = new Rating();
	        r.addingRate();
	    }
	    

}
