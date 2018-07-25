class Student
{
static String school;
int sid;
String sname;
}
class StaticVariable
{
public static void main(String arg[])
{
Student s1=new Student();
s1.school="ssh";         //copy of one memory share into two or more variable 
s1.sid=1234;
s1.sname="bala";
Student s2=new Student();
s2.sid=12345;
s2.sname="surya";
System.out.println("Student 1 name="+s1.school);
System.out.println("Student 1 name="+s1.sid);
System.out.println("Student 1 name="+s1.sname);
System.out.println("Student 1 name="+s2.school);
System.out.println("Student 1 name="+s2.sname);
System.out.println("Student 1 name="+s1.sid);

}
}