package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите оценку по алгебре:");
        int algebra = x.nextInt();
        System.out.println("Введите оценку по мат анализу:");
        int matanal = x.nextInt();
        System.out.println("Введите оценку по мат логике:");
        int matlogic = x.nextInt();
        System.out.println("Введите оценку по английскому:");
        int english = x.nextInt();
        System.out.println("Введите оценку по истории:");
        int history = x.nextInt();
        int result = ((algebra + matanal + matlogic + english + history) / 5);
        System.out.println("Ваш средний балл:" + result);
        if (result >= 10) {
            System.out.print("Вы получите повышенную стипендию\n");
        } else if (result <= 10 && result >= 8) {
            System.out.print("Вы получите обычную стипендию\n");
        } else if (result <= 8) {
            System.out.print("Вы не получите стипендию\n");
        }
    }
}
