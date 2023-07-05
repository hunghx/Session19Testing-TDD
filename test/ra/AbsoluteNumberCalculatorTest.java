package ra;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("Kiem thu so 0")
    void findAbsolute0(){
        int input = 0;
        int expected = 0;
        int actual = AbsoluteNumberCalculator.findAbsolute(input);
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Kiem thu so 1")
    void findAbsolute1(){
        int number = 1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Kiem thu so -1")
    void findAbsolute_1(){
        int number = -1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Kiem tra so -2")
    void checkIsPrime1(){
        int number = -2;
        boolean expected = false;
        boolean result = AbsoluteNumberCalculator.isPrime(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Kiem tra so 10")
    void checkIsPrime2(){
        int number = 10;
        boolean expected = false;
        boolean result = AbsoluteNumberCalculator.isPrime(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Kiem tra so 101")
    void checkIsPrime3(){
        int number = 101;
        boolean expected = true;
        boolean result = AbsoluteNumberCalculator.isPrime(number);
        assertEquals(expected,result);
    }



}