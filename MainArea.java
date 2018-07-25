class Area
{
void accept()
{
int l=10;//local varaiable only accessed inside the funtion or methods
int b=20;
int area=l*b;

}
void disp()
{
System.out.println(area);
}
}
class MainArea
{
public static void main(String arg[])
{
Area aobj=new Area();
aobj.disp();
}
} 