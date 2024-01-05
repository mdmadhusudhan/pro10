import java.util.Scanner;
class loop{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int i=0;
do
{System.out.print(i+" ");
i++;}while(i<=a);
System.out.println();
System.out.println();
int j=a;
do
{System.out.print(j+" ");
j--;}while(j>=0);

System.out.println();
System.out.println();		
int k=0;
do
{System.out.print(k+" ");
k=k+5;}while(k<=a);
System.out.println();
System.out.println();
int m=a;
do
{System.out.print(m+" ");
m=m-5;}	while(m>=0);	
}
}