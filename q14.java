 import java.util.Scanner;

public class q14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
      int num=num1;
  int sum=0;
while(num>0){
int power=1;
int a=num%10;
for(int i=1;i<=3;i++){
power*=a;
}
sum+=power;
num=num/10;
}
System.out.println("The armstong number before"+num1);
System.out.println("The armstong number after sum "+sum);
    } 
  }
