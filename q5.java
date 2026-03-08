import java.util.Scanner;
public class q2{
  public static void main(String[] args){
    Scanner scc=new Scanner(System.in);
    System.out.println("Enter the marks:");
    int  marks=scc.nextInt();
    String str;
    if(marks>90){
      str="excellent";
    }
    else if(marks>80){
      str="good";
    }
    else{
      str="not bad";
    }
    System.out.println("The marks show that:"+str);
  }
}