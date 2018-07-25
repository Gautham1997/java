import java.util.*;
class SwitchDemo
{
public static void main(String arg[])
{
char le;
Scanner scanner=new Scanner(System.in);
System.out.println("enter any charater:");
le=scanner.next().charAt(0);
switch(le)
{
case'A':
System.out.println("vowels");
break;
case'E':
System.out.println("vowels");
break;
case'I':
System.out.println("vowels");
break;
case'O':
System.out.println("vowels");
break;
case'U':
System.out.println("vowels");
break;
default:
System.out.println("consonant");
}
}
}