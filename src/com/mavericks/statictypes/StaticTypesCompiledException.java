package com.mavericks.statictypes;

public class StaticTypesCompiledException {
  public static void main(String[] args) {
    int result = addNumbers(new NumberAndStringHolder());

    System.out.println(String.format("Result = %d", result));
  }

  private static int addNumbers(Holder holder) {
    return holder.getX() + (int) holder.getY();
  }
}

class NumberAndStringHolder implements Holder {

  public int getX() { return 4; }

  public Object getY() { return "5"; }
}
