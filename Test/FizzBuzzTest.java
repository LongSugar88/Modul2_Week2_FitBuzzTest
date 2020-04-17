import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void isFitBuzz() {
        int number = 5;
        String expect = "Buzz";
        String result = FizzBuzz.isFitBuzz(number);
        assertEquals(result, expect);

    }

    @org.junit.jupiter.api.Test
    void isFitBuzz1() {
        int number = 3;
        String expect = "Fit";
        String result = FizzBuzz.isFitBuzz(number);
        assertEquals(result, expect);
    }

    @org.junit.jupiter.api.Test
    void isFitBuzz2() {
        int number = 15;
        String expect = "FitBuzz";
        String result = FizzBuzz.isFitBuzz(number);
        assertEquals(result, expect);
    }

    @org.junit.jupiter.api.Test
    void isFitBuzz3() {
        int number = 4;
        String expect = "bốn";
        String result = FizzBuzz.isFitBuzz(number);
        assertEquals(result, expect);
    }

    @org.junit.jupiter.api.Test
    void isFitBuzz4() {
        int number = 4522;
        String expect = "Buzz";
        String result = FizzBuzz.isFitBuzz(number);
        assertEquals(result, expect);
    }

    @org.junit.jupiter.api.Test
    void isFitBuzz5() {
        int number = 13426;
        String expect = "Fit";
        String result = FizzBuzz.isFitBuzz(number);
        assertEquals(result, expect);
    }

    @org.junit.jupiter.api.Test
    void isFitBuzz6() {
        int number = 26;
        String expect = "hai mươi sáu";
        String result = FizzBuzz.isFitBuzz(number);
        assertEquals(result, expect);
    }

    @org.junit.jupiter.api.Test
    void isFitBuzz7() {
        int number = 1;
        String expect = "một";
        String result = FizzBuzz.isFitBuzz(number);
        assertEquals(result, expect);
    }

    @org.junit.jupiter.api.Test
    void isFitBuzz8() {
        int number = 31;
        String expect = "ba mươi mốt";
        String result = FizzBuzz.isFitBuzz(number);
        assertEquals(result, expect);
    }

    @org.junit.jupiter.api.Test
    void isFitBuzz9() {
        int number = 101;
        String expect = "101";
        String result = FizzBuzz.isFitBuzz(number);
        assertEquals(result, expect);
    }
}