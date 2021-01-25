package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
  @ParameterizedTest
  @CsvSource({ "'xgx', false", "'xg', false", "'gx', false", "'g', false", 
               "'xggx', true", "'ggx', true", "'xgg', true", "'gg', true"})
  public void isGHappy(String str, boolean expected) {
      GHappy gHappy = new GHappy();
      Assertions.assertEquals(expected, gHappy.gHappy(str));
  }
}