package com.mavericks.generictypes;

public class Animal implements Walker {
  private final String name;
  private final String type;
  private final String breed;

  public Animal(String name, String type, String breed){
    this.name = name;
    this.type = type;
    this.breed = breed;
  }

  public boolean walk() {
    return true;
  }
}
