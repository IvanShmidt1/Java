package com.epam.ivan_shmidt1.java.lesson1.task1;

import java.util.Arrays;

public class ApplicationName {
    public static void main(String[] args) {
        ApplicationName app = new ApplicationName();
        app.startApplication();
    }
    private void startApplication() {

        int[] arrayMain;
        arrayMain = new int[20];
//
//
        for (int i = 0; i <arrayMain.length ; i++) {
            arrayMain[i] = ((int) (Math.random() * 21) -10);
        }
        System.out.println(" Исходный Массив чисел (рандомный) arrayMain: \n " + Arrays.toString(arrayMain));
//
//
        int sum = 0;

        for (int i = 0; i < arrayMain.length; i++) {
            if(i%2 == 1){
                sum += arrayMain[i];
            }
        }
        System.out.println("==============================================");
        System.out.println("Сумма элементов, состоящих на чётных позициях: \n" + sum);
//
//
        int[] arrayTask3 = Arrays.copyOf(arrayMain, arrayMain.length); //копирование массива

        for (int j = 0; j < arrayTask3.length; j++){
            if(arrayTask3[j] <= 0) {
                arrayTask3[j] = 0;
            }
        }
        System.out.println("==============================================");
        System.out.println(" Изменённый массив без минусовых значений arrayTask3: \n " + Arrays.toString(arrayTask3));
//
//
//
        double result = 0;
        double arifmetic;
        int min = 0;

        for(int i = 0; i < 20; i++){
            result += arrayMain[i];
        }
        result /= 20;

        for (int i = 0; i < arrayMain.length; i++){
            if(arrayMain[i] < min){
                min = arrayMain[i];
            }
        }
        arifmetic = min - result;
        System.out.println("==============================================");
        System.out.println("Среднее арифметическое " + result + " \nМинимальное значение массива" + min);
        System.out.println("Разница между средним арифметическим и значением минимального элемента: \n " + arifmetic);
//
//
        for(int i = 0; i < 20; i++){
            result += arrayTask3[i];
        }
        result = result / 20;
        System.out.println("==============================================");
        System.out.println(" Среднее арифметическое arrayTask3: \n " + result);
//
//
        int min1 = 0;
        int max1 = 0;
        int minIndex = 0;
        int maxIndex = 0;
        int[] arrayTask1 = Arrays.copyOf(arrayMain, arrayMain.length);

        for (int i = 0; i < arrayTask1.length; i++) {
            if(arrayTask1[i] < min1){
                min1 = arrayTask1[i];
                minIndex = i;
            }
            if(arrayTask1[i] > max1){
                max1 = arrayTask1[i];
                maxIndex = i;
            }

        }
        System.out.println("==============================================");
        System.out.println("Max: " + max1 + " Min: " + min1);
        System.out.println("MaxIndex: " + maxIndex + " MinIndex: " + minIndex);
        int a;
        a = arrayTask1[maxIndex];
        arrayTask1[maxIndex] = arrayTask1[minIndex];
        arrayTask1[minIndex] = a;
        System.out.println(Arrays.toString(arrayTask1));

    }
}
