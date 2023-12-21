import java.util.*;
public class task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       boolean playing=true;
       while(true){
        
         double a = Math.ceil(Math.random()*100);
        boolean guessed =false;
        while(!guessed){
         System.out.println("guess the random number between 1 and 100");
         double b = sc.nextDouble();
         if(b==a){
            System.out.println(" your guess is correct");
            guessed=true;
         }
         else if(b>a){
           System.out.println("your guess is too high");
         }
         else{
            System.out.println("your guess is too low");
         }
        }
        System.out.println("want to play again ? write Y to play again");
         String c= sc.next();
        if(c.equals("Y") || c.equals("y")){
           playing=true;
        }
        else{
            playing=false;
            break;
        }
        
       }
    }
}