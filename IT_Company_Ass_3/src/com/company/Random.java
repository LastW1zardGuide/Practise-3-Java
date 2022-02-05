// Святой рандом

package com.company;

public class Random {
    public static int Price() {
        int n = (int) (50000 + (Math.random()*5));
        return n;
    }

    //Доработать ,чтоб не попадались одинаковые
    public static String RandomProfession() {
        String[] profession = {"FrontEnd разработчик", "BackEnd разработчик", "Юрист", "Дата-инженер", "Маркетолог", "Менеджер Проекта", "Бугалтер"};
        int n = (int) (Math.random()*7);
        System.out.println(profession[n]);
        return profession[n];
    }
}
