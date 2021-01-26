package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest
    @CsvSource({
      "'abc', 3, 'def'", "'xyz', 2, 'zab'", "'xyz', -2, 'vwx'",
      "'abc', -2, 'yza'", "'abc', 0, 'abc'",
      "'', 1, ''", "'aBc', 2, 'invalid'", "'{b}', 4, 'invalid'",
      "'abc', 25, 'zab'", "'abc', 26, 'abc'", "'abc', 27, 'bcd'",
      "' ', 2, 'invalid'",
    })
    public void caesarShifterWorks(String msg, int shift, String expected) {
        CaesarShiftCipher shifter = new CaesarShiftCipher();
        String result = shifter.caesarShifter(msg, shift);
        Assertions.assertEquals(expected, result);
    }
}
