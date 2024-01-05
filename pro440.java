import java.util.Scanner;
class lion
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
if((n1>n2)&&(n1>n3)){
System.out.println("1 st number is largest "+n1);
}
if((n2>n1)&&(n2>n3)){
System.out.println("2 nd is number largest"+n2);
}
if((n3>n1)&&(n3>n2)){
System.out.println("3rd is number largest"+n3);}

if((n1<n2)&&(n1<n3)){
System.out.println("1 st number is smallest"+n1);
}
if((n2<n1)&&(n2<n3)){
System.out.println("2 nd is number smallest"+n2);
}
if((n3<n1)&&(n3<n2)){
System.out.println("3rd is number smallest"+n3);
}
}
}