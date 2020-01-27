package com.rost.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class numbers {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> digits = new ArrayList<>();

        int value = 0;
        int sum = 0;
        System.out.println("Ведите чилсо");
        try {
            value = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (value != 0) {
            int subValue = value % 10;
            value = value / 10;
            sum += subValue;
            digits.add(subValue);
        }
        Collections.reverse(digits);
        for (Integer values : digits) {

            System.out.println(values);
        }
        System.out.println("Сумма всех цифр числа - " + sum);
    }

}