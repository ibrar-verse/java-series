class phone{
private int mic;
private int cam;
void set(){
mic=23;
cam=45;
}
void display(){
System.out.println(mic);
System.out.println(cam);
}
}
class pro1{
public static void main(String[] args){
phone p1=new phone();
p1.display();
p1.set();
p1.display();
}
}