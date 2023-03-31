/*
Aim: Introduce java Collections.
Program: Write a program to perform string operations using ArrayList. Write functions for
the following a. Append - add at end b. Insert – add at particular index c. Search d. List all
string starts with given letter.
*/
import java.util.*;
class ArrayL {
    ArrayList<String> list = new ArrayList<String>();

    void arrayDisplay() {
        list.add("CSE");
        list.add("ISE");
        list.add("ME");
        System.out.println("Array elements are:");
        System.out.println(list);
        System.out.println(" ");
    }

    void appendEnd() {
        System.out.println("Enter ele to be added to the end");
        Scanner sc = new Scanner(System.in);
        String ele = sc.next();
        list.add(ele);
        System.out.println(list);
        System.out.println(" ");
    }

    void insertPos() {
        System.out.println("Enter pos and ele:");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        String ele = sc.next();
        list.add(pos, ele);
        System.out.println(list);
        System.out.println(" ");
    }

    void search() {
        System.out.println("Which element to search for?");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int index = list.indexOf(key);
        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at " + index);
    }

    void print() {
        System.out.println("Enter starting letter:");
        Scanner sc = new Scanner(System.in);
        char firstLetter = sc.next().charAt(0);
        String firstLetterString = Character.toString(firstLetter);
        System.out.println("Strings starting with charecter " + firstLetterString);
        for (String s : list) {
            if (s.startsWith(firstLetterString))
                System.out.println(s);
        }
    }

    public static void main(String args[]) {
        ArrayL obj = new ArrayL();
        obj.arrayDisplay();
        obj.appendEnd();
        obj.insertPos();
        obj.print();
    }
}
