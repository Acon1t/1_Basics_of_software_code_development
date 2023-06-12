package src;

import java.util.Scanner;

public class LinearPrograms {
    public static void task1() {
        double z;
        System.out.println("Найдите значение функции: z = ( (a – 3 ) * b / 2) + c");
        System.out.println("Enter the value of variable a and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.println("Enter the value of variable b and press <Enter>:");
        double b = scan.nextDouble();
        System.out.println("Enter the value of variable c and press <Enter>:");
        double c = scan.nextDouble();
        z = ((a - 3) * b / 2) + c;
        System.out.println("z= " + z);
    }

    public static void task2() {
        double z;
        System.out.println("Вычислить значение выражения по формуле (все переменные принимают действительные значения)");
        System.out.println("Enter the value of variable a and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.println("Enter the value of variable b and press <Enter>:");
        double b = scan.nextDouble();
        System.out.println("Enter the value of variable c and press <Enter>:");
        double c = scan.nextDouble();
        z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Final value= " + z);
    }

    public static void task3() {
        double z;
        System.out.println("Вычислить значение выражения по формуле (все переменные принимают действительные значения)");
        System.out.println("Enter the value of variable x and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        System.out.println("Enter the value of variable y and press <Enter>:");
        double y = scan.nextDouble();
        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("Final value= " + z);
    }

    public static void task4() {
        double z;
        System.out.println("Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами\n" +
                "дробную и целую части числа и вывести полученное значение числа");
        System.out.println("Enter the value and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        z = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println("Final value= " + z);
    }

    public static void task5() {
        System.out.println("Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести\n" +
                "данное значение длительности в часах, минутах и секундах в следующей форме:\n" +
                "ННч ММмин SSc.");
        System.out.println("Enter the value and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int HH = x / 3600;
        int MM = (x - 3600 * HH) / 60;
        int SS = x % 60;
        System.out.println(HH + " ч " + MM + " мин " + SS + " с ");
    }

    public static void task6() {
        System.out.println("Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)\n" +
                "принадлежит закрашенной области, и false — в противном случае");
        System.out.println("Enter the value and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Enter the value and press <Enter>:");
        int y = scan.nextInt();
        if (((y <= 4) && (y >= 0) && (x >= -2) && (x <= 2)) || ((y >= -3) && (y <= 0) && (x >= -4) && (x <= 4))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

