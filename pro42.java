import java.util.Scanner;
class opp{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
char a=sc.next().charAt(0);

               if (a=='+'){
		System.out.println("sum="+n1+"+"+n2+"="+(n1+n2));}
                if (a=='-'){
		System.out.println("sum="+n1+"-"+n2+"="+(n1-n2));}
                 if (a=='*'){
		 System.out.println("mul="+n1+"*"+n2+"="+(n1*n2));}
                  if (a=='/'||a=='%'){
                  if(n2==0){System.out.println("disable by 0 error");}
                 else 
                 if(a=='/')System.out.println("div="+n1+"/"+n2+"="+(n1/n2));
                else
		System.out.println("mod="+n1+"%"+n2+"="+(n1%n2));
		}

}
}