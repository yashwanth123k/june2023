class A{
public void people(){
System.out.print("Peaple called from class A");
}
public void anilkumar(){
System.out.print("Anilkumar called from class A");
}
}
class B{
public static void main(String args[]){
A ob=new A();
ob.people();
ob.anilkumar();
}
}