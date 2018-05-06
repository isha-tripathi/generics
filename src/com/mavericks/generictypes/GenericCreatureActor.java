package com.mavericks.generictypes;

import java.util.Arrays;
import java.util.List;

public class GenericCreatureActor {
  public static void main(String[] args) {
    Animal dog = new Animal("Bruno", "Dog", "Siberian Husky");
    Robot robot = new Robot("Bumblebee");

    List<Walker> walkers = Arrays.asList(dog, robot);
    for (Walker walker : walkers) {
      String typeOfWalker = getTypeOfWalker(walker);
      System.out.println(String.format("Making %s walk: %s", typeOfWalker, makeWalkerWalk(dog)));
    }
  }

  private static <T> String getTypeOfWalker(T walker) {
    return walker.getClass().getSimpleName();
  }

  private static<T extends Walker> boolean makeWalkerWalk(T walker) {
    return walker.walk();
  }

}
