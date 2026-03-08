import java.util.Scanner;
public class q11 {
  public static void main(String args[]){
    int enter=0;
    do{
System.out.println("enter 1 for happy and 5 for exit:");
Scanner sc=new Scanner(System.in);
enter =sc.nextInt();
if(enter==1){
  System.out.println("HAPPY");
}
    }while(enter!=5);
  }
}
