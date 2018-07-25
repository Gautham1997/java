import java.util.*;
class Array
{
public static void main(String arg[])
{
int a;
int array[]=new int[5];
Scanner scanner=new Scanner(System.in);
for(a=0;a<5;a++)
{
System.out.println("enter the array element"+a+":");
array[a]=scanner.nextInt();}

for(a=0;a<5;a++)
{
System.out.println("array ["+a+"]="+array[a]);}
}
}