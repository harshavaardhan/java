class Negative
{
    public static void main(String []args)
    {
        int sum=0;
        int flag=0;
        int length=args.length;
        for(String i:args)
        {
            int m=Integer.parseInt(i);
            if(m<0)
                break;
            sum+=m;
        }
        System.out.println(sum);
    }
}
