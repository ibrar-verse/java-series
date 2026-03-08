import java.util.Scanner;
public class q11 {
  public static void main(String args[]){
    int enter=0;
    int sum=0;
    do{
System.out.println("enter for sum until its neg:");
Scanner sc=new Scanner(System.in);
enter =sc.nextInt();
sum+=enter;
    }while(enter>=0);
    System.out.println("the sum is:"+sum);
  }
}