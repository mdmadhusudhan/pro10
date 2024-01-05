import java.util.Scanner;
class Test{
static boolean con(char c){
boolean b=false;
if (((c>='A')&&(c<='Z'))||((c>='a')&&(c<='z'))){
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='I'||c=='O'||c=='U'||c=='E')
		b=false;
	
	else
		b=true;
	}

return b;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int countc=0;
for(int i=0;i<s.length();i++){
 if(con(s.charAt(i))){
countc++;
}//if
}//for
System.out.println("consonents are present in:"+" "+s+" "+"is"+" "+countc);
}
}
