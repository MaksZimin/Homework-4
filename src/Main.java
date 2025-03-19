public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int age = 20;
        boolean comingOfAgeOfPerson = age >= 18;
        if (comingOfAgeOfPerson) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача №2");
        int temperature = 4;
        boolean isItColdOutside = temperature < 5;
        if (isItColdOutside) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        System.out.println("Задача №3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        System.out.println("Задача №4");
        int age2 = 25;
        if (age2 > 2 && age2 < 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад.");
        }
        if (age2 > 7 && age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то его место в университете.");
        }
        if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу.");
        }

        System.out.println("Задача №5");
        int age3 = 80;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе.");
        } else if (age3 >= 5 && age3 < 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println("Задача №6");
        int numberOfPassengers = 110;
        if (numberOfPassengers < 60) {
            System.out.println("В вагоне есть сидячие места.");
        } else if (numberOfPassengers >= 60 && numberOfPassengers <= 102) {
            System.out.println("В вагоне остались только стоячие места.");
        } else {
            System.out.println("В вагоне мест нет.");
        }

        System.out.println("Задача №7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}