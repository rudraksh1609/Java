package Java1609;
import java.io.*;
public class FileHandling 
{
    public static void main(String[] args) 
    {
        createSourceFile();
        copyFileUsingStream();
        copyFileUsingReaderWriter();
    }
    public static void createSourceFile() 
    {
        String content = "He is very smart, content copied\n";
        try (FileOutputStream fos = new FileOutputStream("source.txt")) 
        {
            fos.write(content.getBytes());
            System.out.println("source.txt created and content written.");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    public static void copyFileUsingStream() {
        try (FileInputStream fis = new FileInputStream("source.txt");
             FileOutputStream fos = new FileOutputStream("target.txt", true)) 
        { 
        	byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) 
            {
                fos.write(buffer, 0, length);
            }
            System.out.println("Content copied to target.txt using FileInputStream and FileOutputStream.");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    public static void copyFileUsingReaderWriter() 
    {
        try (FileReader fr = new FileReader("source.txt");
             FileWriter fw = new FileWriter("target.txt", true)) 
        {
            int c;
            while ((c = fr.read()) != -1) 
            {
                fw.write(c);
            }
            System.out.println("Content copied to target.txt using FileReader and FileWriter.");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}