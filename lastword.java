import java.util.Scanner;
class Main
  {
     public static void main(String args[])
        {
	Scanner sc=new Scanner(System.in);
	String st1=sc.nextLine();
while(true) {
    String temp = st1.substring(1 +st1.indexOf(" "));
    if(temp.equals(st1)) {
        break;
    } else {
        st1 = temp;
    }
}
System.out.println(st1);
        }
  }
