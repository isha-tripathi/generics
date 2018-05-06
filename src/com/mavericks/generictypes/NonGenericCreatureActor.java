package com.mavericks.generictypes;

public class NonGenericCreatureActor {
  public static void main(String[] args) {
    Animal dog = new Animal("Bruno", "Dog", "Siberian Husky");
    Robot robot = new Robot("Bumblebee");

    System.out.println(String.format("Making dog walk: %s", makeAnimalWalk(dog)));
    System.out.println(String.format("Making robot walk: %s", makeRobotWalk(robot)));
  }

  private static boolean makeAnimalWalk(Animal animal) {
    return animal.walk();
  }

  private static boolean makeRobotWalk(Robot robot) {
    return robot.walk();
  }
}
