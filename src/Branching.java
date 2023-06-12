package src;

import java.util.Scanner;

public class Branching {


    public static void task1() {
        System.out.println("Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли\n" +
                "он прямоугольным.\n");
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.println("Enter number and press <Enter>:");
        double b = scan.nextDouble();
        if (180 - a - b > 0) {
            System.out.println("Such a triangle exists");
            if (180 - a - b == 90) {
                System.out.println("The triangle is right angled");
            } else {
                System.out.println("The triangle is not right");
            }
        } else {
            System.out.println("Such a triangle does not exist.");
        }
    }

    public static void task2() {
        double z;
        System.out.println("Найти max{min(a, b), min(c, d)}");
        System.out.println("Enter the value of variable a and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.println("Enter the value of variable b and press <Enter>:");
        double b = scan.nextDouble();
        System.out.println("Enter the value of variable c and press <Enter>:");
        double c = scan.nextDouble();
        System.out.println("Enter the value of variable d and press <Enter>:");
        double d = scan.nextDouble();
        z = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println("z= " + z);
    }

    public static void task3() {
        System.out.println("Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. ");
        System.out.println("Enter x value for point A and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        System.out.println("Enter y value for point A and press <Enter>:");
        double y1 = scan.nextDouble();
        System.out.println("Enter x value for point B and press <Enter>:");
        double x2 = scan.nextDouble();
        System.out.println("Enter y value for point B and press <Enter>:");
        double y2 = scan.nextDouble();
        System.out.println("Enter x value for point C and press <Enter>:");
        double x3 = scan.nextDouble();
        System.out.println("Enter y value for pointC and press <Enter>:");
        double y3 = scan.nextDouble();
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("The points lie on the same line");
        } else {
            System.out.println("Points do not lie on the same line");
        }
    }

    public static void task4() {
        System.out.println("Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через\n" +
                "отверстие. ");
        System.out.println("Enter A value  and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        System.out.println("Enter B value and press <Enter>:");
        double B = scan.nextDouble();
        System.out.println("Enter x value and press <Enter>:");
        double x = scan.nextDouble();
        System.out.println("Enter y value and press <Enter>:");
        double y = scan.nextDouble();
        System.out.println("Enter z value and press <Enter>:");
        double z = scan.nextDouble();
        if (x <= A && y <= B || y <= A && x <= B || x <= A && z <= B || z <= A && x <= B || z <= A && y <= B || y <= A && z <= B) {
            System.out.println("pass");
        } else {
            System.out.println("won't pass");
        }
    }

    public static void task5() {
        double z = 0;
        System.out.println("Вычислить значение функции");
        System.out.println("Enter the value of variable x and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        if (x <= 3) {
            z = Math.pow(x, 2) - 3 * x + 9;
        }
        if (x > 3) {
            z = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("F(x)= " + z);
    }
}


