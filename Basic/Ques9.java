public class Ques9
{
    public static void main(String[]args)
    {
        String str="graphic era university";
        System.out.println(str);
        StringBuffer sb=new StringBuffer(str);
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            if(isvowel(ch))
            {
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb.toString());
    }
    private static boolean isvowel(char ch)
    {
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}