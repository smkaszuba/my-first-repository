// Mitchell Kaszuba
// 9/1/22
// random phone number maker
// makes random phones numbers
// import math
import java.util.Random;

class phoneNumberGenerator 
{
  public static void main(String[] args) 
  {
    // areacode is first 3 digits, number1 is next 3 digits, number2 is final 4 digits
    String areaCode, number1, number2;

    // create random object
    Random random = new Random();

    // make range between 100-777 with no digit being 8 or 9
    areaCode = String.valueOf(random.nextInt(8) + random.nextInt(8) * 10 + (random.nextInt(7) + 1) * (100));

    // make first part of adress a range between 100-742
    number1 = String.valueOf(random.nextInt(43) + (random.nextInt(6) + 1) * (100));

    // make last digit between 1000-9999
    number2 = String.valueOf(random.nextInt(8999) + 1000);
    
    // print info to user
    System.out.println(areaCode + number1 + number2);
    System.out.print(areaCode + "-" + number1 + "-" + number2);
  }
}