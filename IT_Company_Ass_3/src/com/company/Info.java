//Здесь будут все данные(почти).
//Не забыть залупить вопросы про профы

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Info {
    static Scanner sc = new Scanner(System.in);
    private static int monthsOfWork;
    private static String projectName;
    static ArrayList<Worker> workers = new ArrayList<Worker>();

    public static String getProjectName(){
        return projectName;
    }
    public static int getMonthsOfWork(){
        return monthsOfWork;
    }

    public void setProjectName(String projectName){
        this.projectName = projectName;
    }
    public void setMonthsOfWork(int monthsOfWork){
        this.monthsOfWork = monthsOfWork;
    }

    public static void CreateWorker(){
        Worker worker = new Worker();
        worker.setName(Random.RandomProfession());
        System.out.println("Сколько " + worker.getName() + "(ов) Вам необходио? ");
        worker.setNumber(sc.nextInt());
        System.out.println("Хотители вы сэкономить на данных специалистах?(1,0)");
        int n;
        n = sc.nextInt();
        if (n == 1){
            System.out.println("Вам будут подобраны дешевые специалисты.");
            worker.setLevel(1);
        }else{
            System.out.println("Какой уровень у них должен быть?(1,2,3,4)");
            worker.setLevel(sc.nextInt());
        }
        worker.setPrice(Random.Price() * worker.getLevel() * worker.getNumber());
        worker.setFirstName(RandomName.rtName());
        worker.setLastName(RandomName.rtSurname());
        workers.add(worker);
    }
    //Не спрашивай зачем я создал отдельный класс ,который будет суммировать всех работников
    public static int AllPrice(){
        int x = 0;
        for (int i = 0; i < workers.size(); i++){
            x = x + workers.get(i).getPrice();
        }
        return x;
    }

    // Опытным путем было выяснено ,что может существовать инфа лишь по одному проекту
    public static void toInform() {
        System.out.println("Название: " + Info.getProjectName());
        System.out.println("Количество месяцев: " + Info.getMonthsOfWork());
        System.out.println("-------------------------------------------------------------------------");
        for (int i = 0;i < workers.size();i++){
            System.out.println("Количество " + workers.get(i).getName() + "(ов): " + workers.get(i).getNumber());
            System.out.println("Их имена:" + workers.get(i).getFirstName() + " ," + workers.get(i).getLastName());
            System.out.println("Их оплата составляет: " + workers.get(i).getPrice());
            System.out.println("Их уровень равен: " + workers.get(i).getLevel());
            System.out.println("Общая стоимость будет равна: " + AllPrice());
            System.out.println("");
        }
    }

}


