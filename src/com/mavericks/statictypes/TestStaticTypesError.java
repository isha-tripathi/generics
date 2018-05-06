package com.mavericks.statictypes;

public class TestStaticTypesError {
    public static void main(String[] args) {
      int aNumber = "some string";

      System.out.println(String.format("The number: %d", aNumber));
    }

}
