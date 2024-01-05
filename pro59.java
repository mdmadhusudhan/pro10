import java.util.Scanner;
class pattern{
public static void display(char c,int n){
for(int i=0;i<n;i++){
 show(c,i);
}
}
public static void displayr(char c,int n){
for(int i=n;i>=1;i--){
 show(c,i);
}
}

public static void show(char c,int n){
	System.out.println();	
	for(int j=0;j<=n;j++){
	System.out.print(c);
	}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int a=sc.nextInt();
int x;
int y;
if (a%2==0)
x=y=a/2;
else {
x=a/2;
y=a/2+1;
}
display(ch,x);
displayr(ch,y);
}
}