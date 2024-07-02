package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (double) x / (double) y;
  }

  public int sigma(int start, int end) {
    int result = 0;
    for (int i = start; i <= end; i++)
      result = sum(result, i);

    return result;
  }

  public int sigmaOnlyOdd(int start, int end) {
    int result = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 1)
        result = sum(result, i);
    }
    return result;
  }

  public int sigmaOnlyEven(int start, int end) {
    int result = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0)
        result = sum(result, i);
    }
    return result;
  }
}
