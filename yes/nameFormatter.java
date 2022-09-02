// Mitchell Kaszuba
// 9/1/22
// name formatter
// formats names
// import scanner
import java.util.Scanner;

public class nameFormatter
{
    public static void main(String args[])
    {
        // create strings
        String name, first, middle, last;
        
        // create scanner
        Scanner scanner = new Scanner(System.in);
        
        // get input from user
        System.out.print("Enter your full name: ");
        name =  new String(scanner.nextLine());
        
        // get first name by slicing string from start to first occurence of space
        first = new String(name.substring(0, name.indexOf(" ")));
        
        // get middle by slicing string from length of first name to the first letter
        // of their middle name and add a period to the end
        middle = new String(name.substring(first.length(), first.length() + 2) + ".");
        
        // get last name by slicing string from last occurence of space to the end of the string
        last = new String(name.substring(name.lastIndexOf(" ") + 1, name.length()));
        
        // print data to user
        System.out.println("\n" + first + middle);
        System.out.print(last);
    }
}
