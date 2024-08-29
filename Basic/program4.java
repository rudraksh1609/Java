//sum of arguments
class program4
{
    public static void main(String[]args)
    {
        int sum=0;
        for(int i=0; i<args.length; i++) //do not use <=
        {
            sum=sum+ Integer.parseInt (args[i]);
        }
        System.out.println("Sum is:"+ sum);
    }
}