import java.util.Scanner;
public class q2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter year to check if it is leap year or not:");
    int year=sc.nextInt();
    if(year%4==0){
          System.out.println("LEAP YEAR");
        } else {
          System.out.println("NOT A LEAP YEAR");
        }
}
  }

