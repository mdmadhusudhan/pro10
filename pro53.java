import java.util.Scanner;
class Test{
static boolean digit(char c){
boolean b;
if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'){
b=true;
}
else{b=false;}
return b;
}
static boolean con(char c){
boolean b;
if ((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='I'||c=='O'||c=='U'||c=='E'){
b=false;
}
else{b=true;}
}
return b;
}
static boolean vowel(char c){
boolean b;
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='I'||c=='O'||c=='U'||c=='E'){
b=true;
}
else{b=false;}
return b;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int count=0;
int countc=0;
int counto=0;
for(int i=0;i<s.length();i++){
 if(digit(s.charAt(i))){
count++;
}
}
for(int i=0;i<s.length();i++){
 if(con(s.charAt(i))){
countc++;
}
}
for(int i=0;i<s.length();i++){
 if(vowel(s.charAt(i))){
counto++;
}
}
System.out.println("Digits are present in:"+" "+s+" "+"is"+" "+count);
System.out.println("consonents are present in:"+" "+s+" "+"is"+" "+countc);
System.out.println("vowels are present in:"+" "+s+" "+"is"+" "+counto);
}
}