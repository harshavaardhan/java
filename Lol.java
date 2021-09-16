import java.util.Scanner;
class Lol  
{
    public static void main(String args[])
    {
        Scanner scob = new Scanner(System.in);
        String str=scob.nextLine();
       
        String word="";
       
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ' ||str.charAt(i)=='.')
            {
                int f=str.indexOf(word);
                int l=str.lastIndexOf(word);
                if(f==l)
                    System.out.println(word);
                word=new String();
            }
            else
                word=word+str.charAt(i);
        }
    }
}
