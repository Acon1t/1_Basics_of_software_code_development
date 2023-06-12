package src;

import java.math.BigInteger;
import java.util.Scanner;

public class Cycles {
    ;

    public static void task1() {
        int z = 0;
        System.out.println("Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует\n" +
                "все числа от 1 до введенного пользователем числа.");
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            z = z + i;
        }
        System.out.println("Sum of numbers= " + z);
    }

    public static void task2() {
        double y = 0;
        System.out.println("Вычислить значения функции на отрезке [а,b] c шагом h");
        System.out.println("Enter a and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.println("Enter b and press <Enter>:");
        double b = scan.nextDouble();
        System.out.println("Enter h and press <Enter>:");
        double h = scan.nextDouble();
        for (double i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            }
            if (i <= 2) {
                y = -i;

            }
        }
        System.out.println("Function value= " + y);
    }

    public static void task3() {
        int z = 0;
        System.out.println("Найти сумму квадратов первых ста чисел.");
        for (int i = 1; i <= 100; i++) {
            z += i * i;
        }
        System.out.println("Sum of numbers= " + z);
    }

    public static void task4() {
        BigInteger z = BigInteger.valueOf(1);
        System.out.println("Составить программу нахождения произведения квадратов первых двухсот чисел.");
        for (int i = 1; i <= 200; i++) {
            z = z.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println("Product of numbers= " + z);
    }

    public static void task5() {
        double z = 0;
        double s = 0;
        System.out.println("Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен\n" +
                "заданному е.");
        System.out.println("Enter e and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        double e = scan.nextDouble();
        System.out.println("enter the length of the number series and press <Enter>:");
        int n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            z = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            if (e <= Math.abs(z)) {
                s = s + z;
            }
        }
        System.out.println("Sum of numbers= " + s);
    }

    public static void task6() {
        System.out.println("Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.");
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }
    }
    public static void task7() {
        int z = 0;
        System.out.println("Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.\n" +
                "m и n вводятся с клавиатуры.");
        System.out.println("Enter m and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        System.out.println("Enter n and press <Enter>:");
        int n = scan.nextInt();
        while (m <= n) {
            System.out.print("\n"+ m);
            System.out.print("-------");
            for (int i = 2; i <= m - 1; i++) {
                if (m % i == 0) {
                    System.out.print(i + ",");
                }
            }
            m = m + 1;
        }
    }
    public static void task8() {
        System.out.println("Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a and press <Enter>:");
        String a = scan.nextLine();
        System.out.println("Enter b and press <Enter>:");
        String b = scan.nextLine();
        for (int e = 0; e < a.length(); e++) {
            a.charAt(e);
        }
        for (int r = 0; r < b.length(); r++) {
            b.charAt(r);
        }
        System.out.println("----------");
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    System.out.print(b.charAt(j)+" ");
                }
            }
        }
    }
}
