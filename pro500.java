 class a{
public static void main(String args[]){
int i=1;
System.out.println("by for loop");
for(i=1;i<=100;i++)System.out.print(i+" ");
System.out.println("\n");
System.out.println("by while loop");
int j=1;
while(j<=100){
System.out.print(j+" ");
j++;
}
System.out.println("\n");
System.out.println("by do while loop");
int k=1;
do{
System.out.print(k+" ");
k++;
}while(k<=100);
}
}