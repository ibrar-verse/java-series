import java.util.Scanner; 
public class q21 { 
    public static void main(String args[]) { 
Scanner sc=new Scanner(System.in);
int room=5;
for(int i=1;i<=room;i++){
System.out.println("enter the room"+i+"\nHow much bright?");
 int bright=sc.nextInt();
if(bright<30){
System.out.println("Lights ON");
}
else if(bright>30 && bright<70){
System.out.println("Lights DIM");
}
else{
System.out.println("Lights OFF");
}
}
    } 
}