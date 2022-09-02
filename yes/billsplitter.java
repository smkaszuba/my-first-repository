// Mitchell Kaszuba + Vinay
// 8/31/22
// bill splitter
// splits the bill
// import Scanner and NumberFormat
import java.util.Scanner;
import java.text.NumberFormat;

public class billsplitter
{
    public static void main(String[] args)
    {
        // singlepay is the amount each person has to pay
        double bill, totalcost, tip, singlepay;
        int people;
        
        // define the tip, scanner, and number formatter
        tip = .2;
        Scanner scanner = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        // get inputs from user
        System.out.print("Enter bill: ");
        bill = scanner.nextFloat();
        
        System.out.print("Enter # of people to split bill: ");
        people = scanner.nextInt();
        
        // calculate the bill plus the tip
        totalcost = bill * (1 + tip);
        
        // calculate cost each person has to pay
        singlepay = totalcost / people;
        
        // print info to user with formatting
        System.out.printf("Bill: %26s%,.2f %n", "$", bill);
        System.out.printf("Tip: %29s%n", percent.format(tip));
        System.out.printf("Total cost: %20s%,.2f %n", "$", totalcost);
        System.out.printf("Amount each person has to pay: $%,.2f %n", singlepay);
    }
}