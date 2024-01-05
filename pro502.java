import java.util.Scanner;
class loop{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=0;i<=a;i++)System.out.print(i+" ");
System.out.println();
System.out.println();		
for(int i=0;i<=a;i=i+5)System.out.print(i+" ");
System.out.println();
System.out.println();		
for(int i=a;i>=0;i--)System.out.print(i+" ");
System.out.println();
System.out.println();		
for(int i=a;i>=0;i=i-5)System.out.print(i+" ");
}
}