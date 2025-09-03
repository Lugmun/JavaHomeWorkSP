package org.example;

public class Main {
    public static void main(String[] args) {

        //task #1
        System.out.println("Task #1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog +"\n"+
                           "cat = " + cat + "\n"+
                           "paper = " + paper);

        //task #2
        System.out.println("\nTask #2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog +"\n"+
                "cat = " + cat + "\n"+
                "paper = " + paper);

        //task #3
        System.out.println("\nTask #3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog +"\n"+
                           "cat = " + cat + "\n"+
                           "paper = " + paper);

        //task #4
        System.out.println("\nTask #4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        //task #5
        System.out.println("\nTask #5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        //task #6
        System.out.println("\nTask #6");
        var boxer_1 = 78.2;
        var boxer_2 = 82.7;
        System.out.println("Sum of two boxers: " + (boxer_1 + boxer_2));
        System.out.println("Diff of two boxers: " + Math.abs(boxer_1 - boxer_2));

        //task #7
        System.out.println("\nTask #7");
        System.out.println("Division with remainder: " +(boxer_2 % boxer_1));

        //task #8
        System.out.println("\nTask #8");
        //task #8.1
        var allTime = 640;
        var employeeTime = 8;
        var numberOfEmployees = allTime/employeeTime;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек");
        //task #8.2
        var newEmployees = 94;
        var numberOfOldAndNewEmployees = newEmployees + numberOfEmployees;
        System.out.println("Если в компании работает "+
                           numberOfOldAndNewEmployees +
                           " человек, то всего " +
                           (allTime / numberOfOldAndNewEmployees) +
                           " часов работы может быть поделено между сотрудниками");
    }
}