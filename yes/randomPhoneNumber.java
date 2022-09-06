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
    Long minimum,max;
    max = new Long(666999                                                                 9999L);
    minimum = new Long(1000000000);
    
    // create random class
    Random random = new Random();
    
    // create a random 10 digit number using random, then converting to string
    number = String.valueOf((long) Math.floor((Math.random() * (max - minimum)) + minimum));

    
    // create a phone number by inserting dashes where they usually are
    phoneNumber = new String(number.substring(0 , 3) + "-" + number.substring(3 , 6) + "-" + number.substring(6 , 10));
    
    // print info to user
    System.out.println(number);
    System.out.print(phoneNumber);
  }
}

