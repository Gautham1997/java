import java .util.*;
class Big
{
public static void main(String arg[])
{
int a,b,d;
Scanner scanner=new Scanner(System.in);
System.out.println("enter the value of a:");
a=scanner.nextInt();
System.out.println("enter the value of b:");
b=scanner.nextInt();
System.out.println("enter the value d:");
d=scanner.nextInt();
if(a>b&&a>d)
{
System.out.println("a is bigger");
}else
if(b>d&&b>a)
{
System.out.println("bis bigger");
}
else
{
System.out.println("d id bigger");
}
}
}