package com.epam.ivan_shmidt1.java.lesson1.task1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//1
        double d = 2.0 - 1.1;
        System.out.println(d);
//2
        boolean a1 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
        boolean a2 = (5 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false, поэтому возвращается false
        boolean a3 = (5 > 6) && (4 < 6); // 5 > 6 - false, 4 < 6 - true, поэтому возвращается false
        boolean a4 = (50 > 6) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается true
        boolean a5 = (5 > 6) ^ (4 < 6); // 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
        boolean a6 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается false
        if (!a1){
            System.out.println("Брехня");
        }
        else {
            System.out.println("Ты чертовски прав Бродяга!!");
        }
//3
//        Scanner in = new Scanner(System.in);
//        System.out.println("Эй Вася, как тебя зовут?");
//        String name = in.nextLine();
//        System.out.printf("%s а на сколько же ты старый?", name);
//        int age = in.nextInt();
//        System.out.printf("Фигасе %s, ну ты и старый, целых %d года? \n Как ты ещё жив то?", name, age);
//4
        Scanner number = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int num1 = number.nextInt();
        System.out.println("Enter second num: ");
        int num2 = number.nextInt();
        if (num1 > num2){
            System.out.println("Первое число больше второго");
        }
        else {
            System.out.println("Первое число меньше второго");
        }
    }
}
