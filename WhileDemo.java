import java.util.*;
class WhileDemo
{
public static void main(String arg[])
{
int a,b;
b=0;
Scanner scanner=new Scanner(System.in);
System.out.println("enter the value of a");
a=scanner.nextInt();
while(a<=10)
{
b=b+a;
a++;
}
System.out.println("sum of numbers:"+b);
}} 