/*Concept of Mutuablity and Immutability*/
public class Ques8
{
    public static void main(String[] args) 
    {
        //Immutable String
        String immutableStr="Hello";
        System.out.println("Original Immutable string: "+immutableStr);
        immutableStr.concat("world");
        System.out.println("Immutable String After Concat():" + immutableStr);

        //Mutable String Buffer
        StringBuffer mutableStrBuffer=new StringBuffer("Hello");
        System.out.println("Original Mutable String Buffer: "+ mutableStrBuffer);
        mutableStrBuffer.append("World");
        System.out.println("Mutable StringBuffer After append():"+mutableStrBuffer);
    }
}