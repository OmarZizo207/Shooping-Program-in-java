
import java.io.*;
import static java.time.Clock.system;
import java.util.*;


public class Registration {

    static class Regestriation
    {
        private
                String f_name;
                String l_name;
                String password;
                String email;
                String username;

       public Regestriation(String f_name, String l_name, String email, String username, String password)
       {
           this.email = email;
           this.f_name = f_name;
           this.l_name = l_name;
           this.password = password;
           this.username = username;
       }

        public String getF_name()
        {
            return f_name;
        }

        public String getL_name() {
            return l_name;
        }

        public String getPassword() {
            return password;
        }

        public String getEmail() {
            return email;
        }

        public String getUsername() {
            return username;
        }
        
         
     
         void displayInfo()
         {
             System.out.println("First name: " + f_name );
             System.out.println("Last name: " + l_name );
             System.out.println("Username: " + username );
             System.out.println("Email: " + email );
         }
         
    
    }
    void Reg()
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter your First Name");
        String fname = s.nextLine();
        System.out.println("Enter your Last Name");
        String lname = s.nextLine();
        System.out.println("Enter your Email");
        String e_mail = s.nextLine();
        System.out.println("Enter your Password");
        String passWord = s.nextLine();
        System.out.println("Enter your Username");
        String userName = s.nextLine();
        Regestriation r = new Regestriation(fname, lname,e_mail,passWord, userName);
        User u = new User();
        u.signUp(r);
        System.out.println("Registrated Successfully");
        r.displayInfo();
    }
    
     static public class User 
       {
           private ArrayList<Regestriation> users = new ArrayList<Regestriation>();
    
           public void signUp(Regestriation user)
         {
             users.add(user);
         }
           public boolean signIn(String email,String password)
         {
             for(int i=0;i<users.size();i++)
             {
            if(users.get(i).getEmail().equals(email) && users.get(i).getPassword().equals(password)){
                return true;
            }
        }
        return false;
        }
       }
    
    
}
