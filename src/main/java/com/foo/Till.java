package com.foo;

import java.util.Arrays;

public class Till {

    private static final String APPLE = "Apple";
    private static final String ORANGE = "Orange";

    public double calculateTotal(String[] basket) {

        double total = Arrays.stream(basket)
                              .mapToDouble(s -> {

                                  double result = 0;
                                  if (s.equals(APPLE)) {
                                      result = 0.60d;
                                  } else
                                  if (s.equals(ORANGE)) {
                                      result = 0.25d;
                                  } else {
                                      // shouldn't happen
                                      result = 0.0d;
                                  }

                                  return result;
                              })
                              .sum();

        return total;
    }
}
