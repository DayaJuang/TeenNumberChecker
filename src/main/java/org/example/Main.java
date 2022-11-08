package org.example;

public class Main {
    public static void main(String[] args) {
        boolean ans = hasTeen(1,30,20);
        System.out.println(ans);
    }

    public static boolean hasTeen(int num1,int num2,int num3){
        return (isTeen(num1) || isTeen(num2) || isTeen(num3));
    }

    public static boolean isTeen(int number){
        int minRange = 13;
        int maxRange = 19;

        return (number >= minRange && number <= maxRange);
    }
}