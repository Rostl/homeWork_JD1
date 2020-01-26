package com.rost.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RootsFinder {
    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        double c = 0;
        double[] roots = new double[2];
        double discriminant = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Введите а");
            a = Integer.parseInt(reader.readLine());
            System.out.println("Введите b");
            b = Integer.parseInt(reader.readLine());
            System.out.println("Введите c");
            c = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        discriminant = getDiscriminant(a, b, c);

        if ((discriminant) < 0) {
            System.out.println("Дискриминант отритцательный, уравнение не имеет корней ");
        } else {
            roots = rootFinder(a, b, discriminant);
            for (int i = 0; i < roots.length; i++) {
                if (roots[i] != 0) {
                    System.out.print("1-й корень уравнения равен - ");
                    System.out.println(roots[i]);
                }
            }

        }
    }

    private static double getDiscriminant(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    private static boolean isPositive(double discriminant) {
        return discriminant < 0;
    }

    private static boolean isZero(double discriminant) {
        return discriminant == 0;
    }

    private static double[] rootFinder(double a, double b, double discriminant) {
        double[] roots = new double[2];
        if (isPositive(discriminant)) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant) / (2 * a));
            return roots;
        }
        if (isZero(discriminant))
            roots[0] = -b / (2 * a);
        return roots;
    }
}