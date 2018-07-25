class Account
{
String name;
int accno;
double amount;
void value(int a,String aname,float amt)
{
name=aname;
accno=a;
amount=amt;
}
void deposit(float amt)
{
amount=amt+amount;
System.out.println("deposited amunt="+amount);
}
void withDrawn(float amt)
{
if(amount<amt)
{
System.out.println("insuffient balane");
}
else
{
amount=amount-amt;
System.out.println("balane amount after with drawn="+amount);
}
}
void display(){
System.out.println(accno+" "+name+" "+amount);
}
}
class NewAccount
{
public static void main(String arg[])
{
Account b=new Account();
b.value(242354432,"anath",10000f);
b.deposit(3000f);
b.withDrawn(4000f);
b.display();
}
}

