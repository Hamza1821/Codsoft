import java.util.Scanner;
public  class task2 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the no. of subjects");
    int sub=sc.nextInt();
    int total=0;
    int arr[]=new int[sub];
    for(int i=0;i<sub;i++){
        System.out.println("enetr the marks of "+(i+1)+" th subject");
        arr[i]=sc.nextInt();
         total=total + arr[i];

    }
    double p=(total/sub);
    String grade;
    if(p>90&&p<=100){
        grade="A+";

    }
    else if(p>80&&p<=90){
        grade="A";
    }
    else if(p>70&&p<=80){
        grade="B+";
    }
    else if(p>60&&p<=70){
        grade="B";
    }
    else if(p>50&&p<=60){
        grade="c";
    }
    else if(p>=40&&p<=50){
        grade="D";
    }
    else{
        grade="F";
    }
    System.out.println("       RESULT        ");
    System.out.println();
    System.out.println();
    for(int i =0 ;i<sub;i++){
        System.out.println("marks obtain in subject "+(i+1)+"="+arr[i]);
    }
    System.out.println("percentage          = "+p);
    System.out.println("grade recieved      = "+grade);
    
  }
    
}
