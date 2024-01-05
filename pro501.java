import java.util.Scanner;
class loop{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=1;i<=a;i++)System.out.print(i+" ");
int b=sc.nextInt();
for(int i=a;i>=1;i--)System.out.print(i+" ");
int c=sc.nextInt();
int d=sc.nextInt();
if(a>b)
for(int i=a;i==b;i--)System.out.print(i+" ");
else
for(int i=a;i<=b;i--)System.out.print(i+" ");
}
}