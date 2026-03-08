import java.util.Scanner;
public class q2{
  public static void main(String[] args){
    Scanner scc=new Scanner(System.in);
    System.out.println("Enter the number binary your want to show decimal:");
    int binary=scc.nextInt();
    int t=binary;
    int power=0;
    int decimal=0;
    while(t>0){
      int b=binary%10;
      decimal=decimal+b*(int) Math.pow(2, power);
      power++;
    b=b/10;
    }
    System.out.println("the decimal form is:"+decimal);
  }
}