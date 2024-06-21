package app;
// import org.junit.Test;

// import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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


public class CreditCardTest {

    // @org.junit.jupiter.api.Test
    // public void testCreditCardIsValid() {
    //     CreditCard creditcard = new CreditCard();
    //     assertEquals( true, creditcard.verify("4242424242426742") );        
    // }

    // @org.junit.jupiter.api.Test
    // public void testCreditCardIsInValid() {
    //     CreditCard creditcard = new CreditCard();
    //     assertEquals( false, creditcard.verify("1111111111111111") );        
    // }

    
    @org.junit.jupiter.api.Test
    public void testAmericanCreditCardIsValid() {
        CreditCard creditcard = new CreditCard();
        assertEquals( true, creditcard.verify("378282246310005") );        
    }
    

}
