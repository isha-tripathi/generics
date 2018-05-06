package com.mavericks.statictypes;

public class StaticTypesCompiledNoException {
    public static void main(String[] args) {
      int result = addNumbers(new NumberHolder());

      System.out.println(String.format("Result = %d", result));
    }

    private static int addNumbers(Holder holder) {
      return holder.getX() + (int) holder.getY();
    }
}

interface Holder {
  int getX();

  Object getY();
}

class NumberHolder implements Holder {

  public int getX() { return 5; }

  public Object getY() { return 3; }
}

