import java.util.Scanner;
public class q2{
  public static void main(String[] args){
    Scanner scc=new Scanner(System.in);
    System.out.println("Enter the units consumed:");
    int units=scc.nextInt();
    double bill=0;
    if(units<=100){
      bill=units*5;
    }
    else{
      bill=units*10;
    }
    System.out.println("The bill is:"+bill);
  }
}