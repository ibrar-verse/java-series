import java.util.Scanner;

public class basic {
    public static void main(String args[]) {
for(int i=2;i<=50;i++){
int count=0;
for(int j=1;j<=i;j++){//every i has at leat 1 diviser if count 2  then prime
if(i%j==0){
count++;
}
}
if(count==2){
System.out.println(i+"");
    }
}
}
}

