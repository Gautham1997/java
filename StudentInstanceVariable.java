class Student
{
String sname;
int sid;
String school;//this all instance variable accessed all the funtion and class inside the program
}
class StudentInstanceVariable
{
public static void main(String arg[])
{
Student s1=new Student();
s1.sname="gautham";
s1.sid=1234;               //access the instane variable by creating the object
s1.school="ssh";
Student s2=new Student();
s2.sname="vignesh";
s2.sid=12345;
System.out.println("Student 1 name="+s1.sname);

System.out.println("Student 1 id="+s1.sid);
System.out.println("Student 1 school="+s1.school);
System.out.println("Student 2 name="+s2.sname);
System.out.println("Student 2 id="+s2.sid);
System.out.println("Student 2 shool="+s2.school);
}
}