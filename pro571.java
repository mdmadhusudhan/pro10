import java.util.Scanner;
class pattern{
public static void display(char c,int n){
int i=0;
while(i<n){
show(c,i);
i++;
}
}
public static void show(char c,int n){
	System.out.println();
        int j=0;	
	while(j<=n){
	System.out.print(c);
	j++;
	}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int a=sc.nextInt();
display(ch,a);
}
}