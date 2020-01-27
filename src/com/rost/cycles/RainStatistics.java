package com.rost.cycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RainStatistics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int max = 0;
        int avg = 0;
        int sum = 0;
        int day = 0;

        System.out.println("Введите количество дней: ");
        int days = scanner.nextInt();
        System.out.println("Выедите количество остадков для каждого дня: ");
        for (int i = 1; i <= days; i++) {
            System.out.println(i + " -й день");
            day = scanner.nextInt();
            sum +=day;
            if (max < day){
                max = day;
            }
        }
        avg = sum / days;
        StringBuilder builder = new StringBuilder()
                .append("Сумма остадков за ")
                .append(days)
                .append(" дней ровна - ")
                .append(sum)
                .append("mm, среднее количество осадков - ")
                .append(avg)
                .append(", максимальное количество дневных осадков - ")
                .append(max);
        System.out.println(builder);
    }
}
