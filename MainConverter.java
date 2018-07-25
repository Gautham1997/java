import java .util.*;
class Converter
{
float mi,km;
Scanner scanner=new Scanner(System.in);
void value()

{
System.out.println("enter the miles:");
mi=scanner.nextFloat();
}
float calc()
{
km=mi*1.60934f;
return km;
}
void display()
{
System.out.println("miles="+mi);
float kilometer=calc();
System.out.println("convert to km="+kilometer);
}
}
class MainConverter
{
public static void main(String arg[])
{
Converter con=new Converter();
con.value();
con.display();
}
}
