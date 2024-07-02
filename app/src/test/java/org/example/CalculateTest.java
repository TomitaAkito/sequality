package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @SuppressWarnings("deprecation")
  @Test
  public void testAverage() {
    Calculate calc = new Calculate();
    double expected = 3.3;
    assertEquals(expected, calc.average(10, 3));
  }
}
