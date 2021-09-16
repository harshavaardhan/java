import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0, j = s.length()-1;
        boolean flag = true;
        while (i < j)
        {
            if (s.charAt(i) != s.charAt(j))
            {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag)
            System.out.print("Palindrome");
        else
            System.out.print("Not a Palindrome");
    }
}
