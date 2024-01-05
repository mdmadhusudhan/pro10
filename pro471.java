import java.util.Scanner;
class uni{
public static void main(String args[]){
boolean c=true;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println( "c="+c);
System.out.println("a="+a);
System.out.println("b="+b);
// using unirary NOT
System.out.println("c="+!c);
System.out.println("!(a<b)="+!(a<b));
System.out.println("!(a>b)="+!(a>b));
}
}