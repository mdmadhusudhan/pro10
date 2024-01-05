import  java.util.*;
class findmax{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int max;
if(a>b)
{
	if (a>c){max=a;
	System.out.println("1 st number is maximum ");
	}
	else {
	max=c;
	System.out.println("3 rd number is maximum");
	}
}
else
{
	if (b>c){
	max=b;
	System.out.println("2 nd s number is maximum");
	}
	else {
	max=c;
	System.out.println("3 rd number is maximum");
	}
}
}
}
