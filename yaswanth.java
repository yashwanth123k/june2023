class B
{
public static void main(){
System.out.println("Main method without argument called.");
}
public static void main(String args[]){
System.out.println("Anil Is Typing");
main();
main(20);
}
public static void main(int X){
System.out.println("Main method with argument called"+X*2);
}
}