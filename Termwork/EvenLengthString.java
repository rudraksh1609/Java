package Java1609;
import java.util.ArrayList;

public class EvenLengthString 
{
    public static void removeEvenLength(ArrayList<String> list) 
    {
        list.removeIf(str -> str.length() % 2 == 0);
    }

    public static void main(String[] args) 
    {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Rudraksh");
        strings.add("is");
        strings.add("a");
        strings.add("good");
        strings.add("boy");
        System.out.println("Original list: " + strings);
        removeEvenLength(strings);
        System.out.println("List after removing even length strings: " + strings);
    }
}