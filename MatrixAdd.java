import java.util.*;
class MatrixAdd
{
public static void main(String arg[])
{
int i,j,r,c,k;
Scanner scanner=new Scanner(System.in);
System.out.println("enter the rows");
r=scanner.nextInt();
System.out.println("enter the coloumns");
c=scanner.nextInt();
int m1[][]=new int[r][c];
int m2[][]=new int[r][c];
int s[][]=new int[r][c];
System.out.println("enter the first matrix");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
m1[i][j]=scanner.nextInt();
}
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(m1[i][j]+"   ");
}
System.out.println();
}
System.out.println("enter the second matrix");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
m2[i][j]=scanner.nextInt();
}
}for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(m2[i][j]+"   ");
}
System.out.println();
}
System.out.println("add of two matrix");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
s[i][j]=m1[i][j]*m2[i][j];
}
}

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(s[i][j]+"    ");
}
System.out.println();
}
}
}


