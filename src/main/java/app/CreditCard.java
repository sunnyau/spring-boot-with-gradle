package app;

/**
 * The Luhn algorithm or Luhn formula, also known as the "modulus 10" or "mod 10" algorithm 
 
The following is a credit card check algorithm: 
From the last digit moving backwards, double every second digit  
If the doubled number is greater than 9, add its two digits together  
Sum all card digits together  
If the total ends in a zero, then the number is a valid credit card  
 
Test cases  
 
 4242424242426742 true  
 1111111111111111 false 
 */

public class CreditCard {
    
    public boolean verify( String digits )
    {
        int total = 0;
        for( int i = digits.length()-1 ; i >= 0 ; i-- ) {
            char c = digits.charAt(i);
            int digit = Integer.parseInt(String.valueOf(c));
            boolean logic = ( i  % 2 == 0 );
            if ( digits.length() % 2 != 0 ) {
                logic = !logic;
            }

            if ( logic )  {
                int doubleDigit = digit * 2;
                if ( doubleDigit > 9 ) {
                    total += doubleDigit % 10 + 1;
                } else {
                    total += doubleDigit;
                }
            } else {
                total += digit;
            }
        }
        System.out.println(total);
        return total % 10 == 0 ;
        // return false;
    }
}