import java.util.*;
public  class p2{
public static void main(String arg[]){

System.out.print("enter the lower number :- ");
Scanner scn = new Scanner (System.in);
int L= scn.nextInt();
System.out.print("enter the lower number :- ");
int H = scn.nextInt();
for (int n= L;L<H;n++){

for(int div = 2; div<=n;div++){
int count=0;
if(n%div==0){
count++;

}
if(count==0){System.out.println("prime");}
}




}

}
}
