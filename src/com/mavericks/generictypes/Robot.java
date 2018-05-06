package com.mavericks.generictypes;

public class Robot implements Walker{
  private final String name;

  public Robot(String name) {
    this.name = name;
  }

  public boolean walk() {
    return true;
  }
}
