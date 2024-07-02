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
    double expected = 6;
    assertEquals(expected, calc.average(1, 11));
  }

  @Test
  public void testSigma() {
    Calculate calc = new Calculate();
    int expected = 15;
    assertEquals(expected, calc.sigma(1, 5));
  }

  @Test
  public void testSigmaOnlyOdd() {
    Calculate calc = new Calculate();
    // 単純な計算
    int expected = 9;
    assertEquals(expected, calc.sigmaOnlyOdd(1, 5));
    // 偶数のみ
    expected = 0;
    assertEquals(expected, calc.sigmaOnlyOdd(2, 2));
  }

  @Test
  public void testSigmaOnlyEven() {
    Calculate calc = new Calculate();
    // 単純な計算
    int expected = 6;
    assertEquals(expected, calc.sigmaOnlyEven(1, 5));
    // 奇数のみ
    expected = 0;
    assertEquals(expected, calc.sigmaOnlyOdd(3, 3));
  }
}
