package com.company;

public class RandomName {
    private static String[] names = {"James", "Robert", "John", "Michael", "William", "David", "Richard", "Joseph", "Thomas", "Charles", "Christopher", "Daniel", "Matthew", "Anthony", "Mark", "Donald", "Steven", "Adolf", "Andrew", "Joshua", "Kenneth", "Kevin", "Brian", "George", "Edward", "Ronald", "Timothy"};
    private static String[] surnames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez", "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", "Thomas", "Taylor", "Moore", "Jackson", "Martin", "Lee", "Perez", "Thompson", "White", "Harris", "Winston", "Marlboro "};
    private static int x = (int) (Math.random() * 27);
    private static int y = (int) (Math.random() * 27);

    public static String rtName() {
        String name = names[x];
        return name;
    }

    public static String rtSurname() {
        String surname = surnames[y];
        return surname;
    }
}