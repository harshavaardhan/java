import java.util.Scanner;
class Main
  {
     public static void main(String args[])
        {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	int m=s1.length();
	Scanner sc1=new Scanner(System.in);
	String s2=sc1.nextLine();
	int n=s2.length();
	boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } 
        for(int i=0;i<m;i++){
            
        for(int j=0;j<n;j++){
        if (s1.charAt(i)==s2.charAt(j))
        status=true;
        else 
        status=false;
    }  
    }
    System.out.println(status);
        }
  }
