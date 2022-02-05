//Здесь происходят все операции.
//В душе не знаю почему я разделил название и время проекта от общего класса Инфо

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    static ArrayList<Info> infos = new ArrayList<Info>();
    public static void start() {
        Scanner sc = new Scanner(System.in);
        Info newProject = new Info();
        System.out.println("Название проекта: ");
        newProject.setProjectName(sc.next());
        System.out.println("Месяцы работы над проектом: ");
        newProject.setMonthsOfWork(sc.nextInt());
        // Не забудь поменять цифру на 7
        for (int i = 0;i < 3;i++){
            Info.CreateWorker();
        }
    }
}
