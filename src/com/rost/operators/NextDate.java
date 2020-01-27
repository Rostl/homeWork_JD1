package com.rost.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextDate {

    public static void main(String[] args) {

        int day = 0;
        int month = 0;
        int year = 0;

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Введите день: ");
                day = Integer.parseInt(reader.readLine());
                System.out.println("Введите  месяц: ");
                month = Integer.parseInt(reader.readLine());
                System.out.println("Введите год: ");
                year = Integer.parseInt(reader.readLine());

            } catch (IOException e) {
                e.printStackTrace();
            }

            if (!isValidate(day, month, year)) {
                System.out.println("Дата введена некоректно");
            } else {
                break;
            }
        }
        nextDay(day, month, year);
    }

    private static boolean isValidate(int day, int month, int year) {
        if ((isTemporal(year) && month == 2 && day > 29) || ((!isTemporal(year) && month == 2 && day > 28))) {
            System.out.println("неправильная дата февраля для " + year + " года");
            return false;
        } else if ((day < 1 || day > 31) || (month < 1 || month > 12)) {
            System.out.println("Неправильная дата или месяц");
            return false;
        } else {
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day == 31) {

                        return false;
                    }
                    break;
            }
        }
        return true;
    }

    private static boolean isTemporal(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static void nextDay(int day, int month, int year) {
        switch (month) {
            case 2:
                if (isTemporal(year) && day == 29) {
                    day = 1;
                    month++;
                } else if (!isTemporal(year) && day == 28) {
                    day = 1;
                    month++;
                } else {
                    day++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 30) {
                    day++;
                } else {
                    day = 1;
                    month++;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day < 31) {
                    day++;
                } else {
                    month++;
                    day = 1;
                }
                break;
            case 12:
                if (day < 31) {
                    day++;
                } else {
                    month = 1;
                    day = 1;
                    year++;
                }
                break;
        }
        System.out.println(day + ":" + month + ":" + year);

    }

}
