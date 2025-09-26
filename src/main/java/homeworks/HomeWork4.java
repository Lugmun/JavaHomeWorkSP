package homeworks;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class HomeWork4 {
    public static void main(String[] args) {

        //task #1
        System.out.println(" Задача №1");
        byte age = 27;
        byte majorityAge = 18;
        System.out.print("Если возаст человека равен " + age + ", то ");
        if (age >= majorityAge) {
            System.out.println("он совершеннолетний.");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать.");
        }

        //task #2
        System.out.println("\n Задача №2");
        byte temperature = 10;
        byte temperatureLimit = 5;
        System.out.print("На улице " + temperature + " градусов, ");
        if (temperature < temperatureLimit) {
            System.out.println("нужно надеть шапку.");
        } else {
            System.out.println("можно идти без шапки.");
        }

        //task #3
        System.out.println("\n Задача №3");
        byte tempSpeed = 61;
        byte speedLimit = 60;
        System.out.print("Если скорость " + tempSpeed + ", то ");
        if (tempSpeed > speedLimit) {
            System.out.println("придется заплатить штраф.");
        } else {
            System.out.println("можно ездить спокойно.");
        }

        //task #4
        System.out.println("\n Задача №4");
        byte tempAge = 6;
        byte initAge = 2;
        byte ageReadyForSchool = 7;
        byte ageReadyForUniversity = 18;
        byte ageReadyForJob = 24;
        System.out.print("Если возраст человека равен " + tempAge + ", то ");
        if (tempAge < initAge) {
            System.out.println("он слишком мал.");
        } else if (tempAge < ageReadyForSchool) {
            System.out.println("он должен ходить детский сад.");
        } else if (tempAge < ageReadyForUniversity) {
            System.out.println("он должен ходить в школу.");
        } else if (tempAge < ageReadyForJob) {
            System.out.println("его место в университете.");
        } else {
            System.out.println("ему пора ходить на работу");
        }

        //task #5
        System.out.println("\n Задача №5");
        byte childAge = 6;
        byte childAgeWithParent = 5;
        byte childAgeWithoutParent = 14;
        System.out.print("Если возраст ребенка равен " + childAge + ", то ему ");
        if (childAge < childAgeWithParent) {
            System.out.println("нельзя кататься на аттракционе.");
        } else if (childAge < 14) {
            System.out.println("можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("можно кататься без сопровождения взрослого.");
        }

        //task #6
        System.out.println("\n Задача №6");
        short numOfPeopleInVan = 79;
        short numOfSeatsInVan = 60;
        short maxPeopleInVan = 102;
        System.out.print("Если в вагоне " + numOfPeopleInVan + " человек, то ");
        if (numOfPeopleInVan < numOfSeatsInVan) {
            System.out.println("остались сидячие места.");
        } else if (numOfPeopleInVan < maxPeopleInVan) {
            System.out.println("остались только стоячие места.");
        } else {
            System.out.println("вагон полностью забит.");
        }

        //task #7
        System.out.println("\n Задача №7");
        int one = 1;
        int two = 2;
        int three = 3;
        System.out.print("Наибольшее число из 3х это ");
        if (one > two) {
            if (one > three) {
                System.out.println("One");
            } else {
                System.out.println("Three");
            }
        } else if (two > three) {
            System.out.println("Two");
        } else {
            System.out.println("Three");
        }
    }
}
