import java.util.Scanner;
class pattern{
public static void display(char c,int n){
for(int i=0;i<n;i++){
	System.out.println();
	for(int j=0;j<=i;j++){
	System.out.print(c);
	}
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int a=sc.nextInt();
display(ch,a);
}
}