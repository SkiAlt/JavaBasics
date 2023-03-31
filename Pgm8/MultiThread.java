/*
Aim: Demonstrate creation of threads using Thread class and Runnable interface, multithreaded programming.
Program: Write a Java program that implements a multi-thread application that has three
threads. First thread generates a random integer for every 1 second; second thread computes
the square of the number and prints; third thread will print the value of cube of the number.
*/
import java.util.Random;
// This class defines a thread that calculates the square of a number
class Square extends Thread {
  int x;

  Square(int n) {
    x = n;
  }

  public void run() {
    int sqr = x * x;
    System.out.println("Square of " + x + " = " + sqr);
  }
}

// This class defines a thread that calculates the cube of a number
class Cube extends Thread {
  int x;

  Cube(int n) {
    x = n;
  }

  public void run() {
    int cub = x * x * x;
    System.out.println("Cube of " + x + " = " + cub);
  }
}

// This class defines a thread that generates a random number and starts
// the Square and Cube threads with the generated number
class Rnumber extends Thread {
  public void run() {
    Random random = new Random();
    for (int i = 0; i < 5; i++) {
      int randomInteger = random.nextInt(10);
      System.out.println("Random Integer generated : " + randomInteger);
      Square s = new Square(randomInteger);
      s.start();
      Cube c = new Cube(randomInteger);
      c.start();
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
        System.out.println(ex);
      }
    }
  }
}

public class MultiThread {
  public static void main(String[] args) {
    Rnumber n = new Rnumber();
    n.start();
  }
}
