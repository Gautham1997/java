import java.util.*;
class Matrix
{
public static void main(String arg[])
{
int i,j,row,coloumn;
Scanner scanner=new Scanner(System.in);
System.out.println("enter the rows:");
row=scanner.nextInt();
System.out.println("enter the coloumn:");
coloumn=scanner.nextInt();
int array[][]=new int[row][coloumn];
System.out.println("enter the matrix:");
for(i=0;i<row;i++)
{
for(j=0;j<coloumn;j++)
{
array[i][j]=scanner.nextInt();

}
}
System.out.println(" ");
for(i=0;i<row;i++)
{
for(j=0;j<coloumn;j++)
{
System.out.print(array[i][j]+"\t");
}
System.out.println();
}
}}