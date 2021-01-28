package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MirrorTest {

  private Mirror mirror;

  @BeforeEach
    public void initialize() {
        this.mirror = new Mirror();
    }

  @Test
  public void hasEmptyMirror() {
    String result = mirror.mirrorEnds("abcd");

    Assertions.assertEquals("", result);
  }

  @Test
  public void hasOneLetterMirror() {
    String result = mirror.mirrorEnds("abca");

    Assertions.assertEquals("a", result);
  }

  @Test
  public void hasMoreThanOneLetterMirror() {
    String result = mirror.mirrorEnds("abCDXba");

    Assertions.assertEquals("ab", result);
  }

  @Test
  public void hasOverlappingMirror() {
    String result = mirror.mirrorEnds("abcba");

    Assertions.assertEquals("abcba", result);
  }
}
