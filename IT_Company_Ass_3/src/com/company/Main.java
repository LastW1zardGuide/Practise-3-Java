// Я так устал писать этот код
// 3 дня разбирался как подключть sql
// И столько же пытался сформулировать что от меня требуют в задании
// Ибо нам до конца не обьясняют ,что наша программа должна делать
// =( Kill me....


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int n;
            System.out.println("------------------------------------------------------------------");
            System.out.println("1.Запустить программу \n2.Показать проект. \n3.Завершить программу");
            System.out.println("------------------------------------------------------------------");
            n = sc.nextInt();
            if (n == 3){
                break;
            }else{
                switch (n){
                    case 1 : Application.start();
                    case 2 : Info.toInform();
                }
            }
        }
    }
}
