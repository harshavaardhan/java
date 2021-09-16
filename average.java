import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();++++++++++++++++++++++++++++++++++++++++++++
        String a = reader.readLine();
        int x =Integer.parseInt(a);
        String b = reader.readLine();
        int y =Integer.parseInt(b);
        String c = reader.readLine();
        int z =Integer.parseInt(c);
        String d = reader.readLine();
        int p =Integer.parseInt(d);
        String e = reader.readLine();
        int q =Integer.parseInt(e);
        int avg = ((p+q+x+y+z)/5);
        System.out.println(avg);
    }
}
