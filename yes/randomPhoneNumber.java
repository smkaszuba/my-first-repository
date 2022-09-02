// Mitchell Kaszuba
// 9/1/22
// random phone number maker
// makes random phones numbers
// import random
import java.util.Random;

public class randomPhoneNumber 
{
  public static void main(String[] args) 
  {
    // number is input, phoneNumber is output
    String number, phoneNumber;
    
    // create random class
    Random random = new Random();
    
    // create a random 10 digit number usi32\ng random, then converting to string
    number = String.valueOf(random.nextDouble() * 6770000000L + 1000000000L);
    
    // create a phone number by inserting dashes where they usually are
    phoneNumber = new String(number.substring(0 , 3) + "-" + number.substring(3 , 6) + "-" + number.substring(6 , 10));
    
    // print info to user
    System.out.print(phoneNumber);
  }
}

