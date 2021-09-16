import java.util.Scanner;
class Main{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int num=obj.nextInt();
int rev=0;
int org=num;
while(num!=0)
{
int digit=num%10;
num=num/10;
rev=rev*10+digit;
}
if(org==rev)
System.out.println("palindrome");
else
System.out.println("Not palindrome");
}
}
