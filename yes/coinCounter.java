//Mitchell Kaszuba
// 9/1/22
// coin counter
// count coins
// import scanner and number formater
import java.util.Scanner;
import java.text.NumberFormat;

public class coinCounter
{
    public static void main(String args[])
{
    // the coinAmt variables convert the amount of coins in cents
    int quarters, dimes, nickles, pennies;
    double quarterAmt, dimeAmt, nickleAmt, pennieAmt, total;
    
    // create scanner and formatter
    Scanner scanner = new Scanner(System.in);
    NumberFormat dollar = NumberFormat.getCurrencyInstance();
    
    // get input from user
    System.out.print("Enter # of pennies: ");
    pennies = scanner.nextInt();
    
    System.out.print("Enter # of nickles: ");
    nickles = scanner.nextInt();

    System.out.print("Enter # of dimes: ");
    dimes = scanner.nextInt();
    
    System.out.print("Enter # of quarters: ");
    quarters = scanner.nextInt();
    
    // calculate the amount of coins into dollars
    pennieAmt = pennies * .01;
    
    nickleAmt = nickles * .05;
    
    dimeAmt = dimes * .1;
    
    quarterAmt = quarters * .25;
    
    // calculate total
    total = pennieAmt + nickleAmt + dimeAmt + quarterAmt;
    
    // print info to user with formatter
    System.out.print("\nTotal amount in dollars: " + dollar.format(total));
    }
}
