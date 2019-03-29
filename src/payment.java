
import java.util.Scanner;

public class payment {

    private int id;
    private int total_money;
    private int money_paid;
    
    int paying(int id){return 0;
}
    public class card extends payment {
    private int cardno;
    private int id;
    private int total_money;
    private int money_paid;
    
    public void setmoney(int money_paid) {
        this.money_paid = money_paid;
    }
 
    public void setcardno(int cardno) {
        this.cardno = cardno;
    }
    public int getcardno() {
        return cardno;
    }
    public void setid(int id) {
        this.id = id;
    }
    public int getid() {
        return id;
    }
    void visacard_paing(){
        System.out.print("enetr card no." + "\n");
        Scanner x = new Scanner( System.in );
        int a,b,c;
        a =x.nextInt();
        setcardno(a);
        getcardno();
        System.out.print("enetr id." + "\n");
        b=x.nextInt();
        setid(b);
        getid();
        System.out.print("enetr money" + "\n");
        c=x.nextInt();
        setmoney(c);
         }
}
    public class cash extends payment {
    private int id;
    private int total_money;
    private int money_paid;
    
    public void setmoney(int money_paid) {
        this.money_paid = money_paid;
    }
 
    public void setid(int id) {
        this.id = id;
    }
    public int getid() {
        return id;
    }
    void visacard_paing(){
        int y;
        Scanner x = new Scanner( System.in );
        System.out.print("enetr money" + "\n");
        y=x.nextInt();
        setmoney(y);
         }
}
    
}

