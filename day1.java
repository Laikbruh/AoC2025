import java.util.Scanner;
import java.io.*;
import java.util.Vector;

public class day1
{
    public static void main (String[] args) throws IOException
    {
        Scanner inputFile = new Scanner(new File("input.txt"));
        Vector<String> v = new Vector<String>();
        while(inputFile.hasNextLine())
        {
            String lock = inputFile.nextLine();
            v.add(lock);
        }
        inputFile.close();

        int dial = 50;

        char letter = v.get(0).charAt(0);
        int number = Integer.parseInt(v.get(0).substring(1));
        
        switch(letter)
        {
            case 'L':
                dial -= number;
            break;
            case 'R':
                dial += number;
            break;
        }
        
    }
}