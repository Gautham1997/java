import java.util.*;
class DoWhileDemo
{
public Static void main(String arg[])
{
int a,b=1;
Scanner scanner=new Scanner(System.in);
System.out.println("ENter the number a:");
a=scanner.nextInt();
do{
b=b*a;
}
while(a<=12);
System.out.println("multiply:"+b);
}}