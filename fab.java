import java.util.*;
public class fab{
public static void main(String [] arg){
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();

int c;
int a=0;
int b=1;
System.out.print(" \t" + a);
System.out.print(" \t" + b);


for(int i=3;i<=n;i++){

c=a+b;
a=b;
b=c;

System.out.print("\t"+c);
}
}
}