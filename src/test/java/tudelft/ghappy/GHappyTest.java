package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
  @ParameterizedTest
  @CsvSource({ // Unhappy Gs
               "'xgx', false", "'xg', false", "'gx', false", "'g', false",
               "'xggxgx', false", "'xgggxgx', false",
               // Happy Gs
               "'xggx', true", "'ggx', true", "'xgg', true", "'gg', true",               
               "'xggxggx', true", "'xgggx', true", "'ggg', true",
               "'', true"})
  public void isGHappy(String str, boolean expected) {
      GHappy gHappy = new GHappy();
      Assertions.assertEquals(expected, gHappy.gHappy(str));
  }
}