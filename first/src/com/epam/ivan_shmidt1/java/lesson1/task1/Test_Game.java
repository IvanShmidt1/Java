package com.epam.ivan_shmidt1.java.lesson1.task1;

public class Test_Game {
    public static void main(String[] args) {
        int num = 8;
        switch(num){

            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }

        int x=3;
        int y=5;
        int z = x<y? (x+y) : (x-y);
        System.out.println(z);

        for (int i = 1; i < 9; i++){
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
        }

        int[] nums = new int[] { 1, 2, 3, 4, 12, 9 };
        for (int i = 0; i < nums.length; i++){

            if (nums[i] > 10)
                continue;
            System.out.println(nums[i]);
        }
    }
}
