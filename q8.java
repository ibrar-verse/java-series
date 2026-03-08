import java.util.Scanner;
public class q8{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int num1=sc.nextInt();
    int num2=num1;
    int rev=0;
    int sum=0;
    while(num2>0){
      int a=num2%10;
      rev=rev*10+a;
      sum=sum+a;
      num2=num2/10;
    }
    System.out.println("The reverse of the number is:"+rev);
    System.out.println("The sum of the digits is:"+sum);
}
}

  