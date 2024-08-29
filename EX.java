package Java;
import java.util.Scanner;

public class EX 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence terminated by '.', '?' or '!': ");
        String sentence = sc.nextLine();

        WordExample wordExample = new WordExample(sentence);

        wordExample.countWord();

        wordExample.placeWord();
        sc.close();
    }
} 

class WordExample 
{
    private String strdata;
    public WordExample(String strdata) 
    {
        this.strdata = strdata;
    }
    private boolean isVowel(char ch) 
    {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public void countWord() 
    {
        int count = 0;
        String[] words = strdata.split("\\s+");
        for (String word : words) 
        {
            if (word.length() > 0 && isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) 
            {
                count++;
            }
        }
        System.out.println("Number of words beginning and ending with a vowel: " + count);
    }
    public void placeWord() 
    {
        StringBuilder result = new StringBuilder();
        StringBuilder nonVowelWords = new StringBuilder();
        String[] words = strdata.split("\\s+"); // Split sentence into words
        for (String word : words) 
        {
            if (word.length() > 0 && isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) 
            {
                result.insert(0, word + " ");
            } 
            else 
            {
                nonVowelWords.append(word).append(" ");
            }
        }
       result.append(nonVowelWords);
        System.out.println("Resulting sentence: " + result.toString());
    }
}