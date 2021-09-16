import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int j = 0;
        Scanner myObj = new Scanner(System.in);
        String  s= myObj.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char character =s.charAt(i);
            if(character=='a' || character=='A' || character=='e' || character=='E' ||
                    character=='i' || character=='I' || character=='o' || character=='O' ||
                    character=='u' || character=='U'){
                j=j+1;
            }
        }
        System.out.println(j);
    }
}
