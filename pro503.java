import java.util.Scanner;
class loop{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int i=0;
while(i<=a)
{System.out.print(i+" ");
i++;}
System.out.println();
System.out.println();
int j=a;
while(j>=0)
{System.out.print(j+" ");
j--;}
System.out.println();
System.out.println();		
int k=0;
while(k<=a)
{System.out.print(k+" ");
k=k+5;}
System.out.println();
System.out.println();
int m=a;
while(m>=0)
{System.out.print(m+" ");
m=m-5;}		
}
}