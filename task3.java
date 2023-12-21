import java.util.*;
public class task3{

    public static class bankAccount{
        long balance=0;
    } 
     static   bankAccount account = new bankAccount();
    
     
    static void withdraw(long amount){
      if(amount >account.balance){
        System.out.println("Balance not sufficient");return;
      }else{
        account.balance=account.balance-amount;
        System.out.println("Rs " +amount + " debitted from your account");
        checkalance();
        return;
      }
    }
      
    static void deposit(long amount){

      account.balance=account.balance +amount;
      System.out.println("Rs " +amount + " credited to your account");
      checkalance();
      return;

    }

     static  void checkalance(){
    System.out.println("avilable balance :Rs "+account.balance);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     task3 atm= new task3(); 
     boolean a=true;
     while(a){
        long amount=0;
        System.out.println();
        System.out.println("_______________________________________");
       System.out.println("Welcome to ATM , what you want to do");
       System.out.println("1 for Withdraw");
       System.out.println("2 for deposit");
       System.out.println("3 for checking  balance");
       System.out.println("4 for exit");
         System.out.println("_______________________________________");
       int choice =sc.nextInt();
       if(choice==1|| choice ==2){
        System.out.println("Enter Amount");
        amount=sc.nextInt();
       }

       switch (choice) {
        case 1:atm.withdraw(amount); break;
        case 2:atm.deposit(amount); break;
        case 3:atm.checkalance();break;
        case 4:a=false;break;
        default:System.out.println("invalid choice");
                 break;
       }
        
     
    
    
    }  
     
    }
}
