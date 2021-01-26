package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        CountLetters counter = new CountLetters();
        
        int words = counter.count("cats|dogs");
        Assertions.assertEquals(2, words);

        words = counter.count("catr|dogr");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordBeforeNoLetterDoesNotMatch() {
        int words = new CountLetters().count("cat|dogs");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void matchWordDoesNotCount() {
        int words = new CountLetters().count("cardogs");
        Assertions.assertEquals(1, words);
    }
    
    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }
}