package day02.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerfectNumberTest {
    @Test
    void testIsPerfectNumber(){
        PerfectNumbers perfectNumbers = new PerfectNumbers();

        assertTrue(perfectNumbers.isPerfectNumber(8128));
        assertTrue(perfectNumbers.isPerfectNumber(6));

        assertFalse(perfectNumbers.isPerfectNumber(88));
        assertFalse(perfectNumbers.isPerfectNumber(27));
    }

}
