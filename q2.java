import java.util.Scanner;
public class q2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER A NUMBER IF EVEN THEN WOULD SHOW:");
    int num=sc.nextInt();
    if(num%2==0){
      System.out.println("EVEN NUMBER");
    }
  }
}
