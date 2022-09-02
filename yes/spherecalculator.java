// Mitchell Kaszuba
// 8/31/22
// sphere calculator
// calculates volume and surface area of sphere
// import Scanner, Math, and DecimalFormat
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class spherecalculator
{
    public static void main(String[] args)
    {
        double radius, volume, surfaceArea;
        
        // create scanner and decimal format objects
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.##");
        
        // get input from user
        System.out.print("Enter the radius of a circle: ");
        radius = scanner.nextFloat();
        
        // calculate volume (4/3pi*r^3)
        volume = (4 / 3) * Math.PI * radius * radius * radius;
        
        // calculate surface area (4pi*r^2)
        surfaceArea = 4 * Math.PI * radius * radius;
        
        // print info to user with formatting
        System.out.printf("Volume: %s%n", decimal.format(volume));
        System.out.printf("Surface area: %s", decimal.format(surfaceArea));
    }
}