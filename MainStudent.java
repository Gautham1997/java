import java.util.*;
class Student
{
int sid;
int m,p,c,total;
String sname;
Scanner scanner=new Scanner(System.in); 
void infoStud()
{
System.out.println("enter the student name:");
sname=scanner.next();
System.out.println("enter the student id:");
sid=scanner.nextInt();
System.out.println("enter the physics,chemistry and maths marks:");
p=scanner.nextInt();
c=scanner.nextInt();
m=scanner.nextInt();
total=m+p+c;

}
float averageStud()
{
float avg;
avg=total/3;
return avg;
}
void displayStud()
{
System.out.println("studentname:"+sname);
System.out.println("studentid:"+sid);
System.out.println("total marks:"+total);
System.out.println("student average:"+averageStud());
}
}
class MainStudent
{
public static void main(String arg[])
{
Student stu=new Student();
stu.infoStud();
stu.displayStud();
}

}






























