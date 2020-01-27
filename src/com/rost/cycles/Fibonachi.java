package com.rost.cycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        System.out.println("Введите число: ");
        int value = scanner.nextInt();

        System.out.println("Числа фибоначи через цикл:");
        getFibonachiValues(value);
        System.out.println();

        System.out.println("Числа фибоначи через рекурсию:");
        List<Integer> fibonachiRecList = fillStartFibonachiList();
        getFibonachiRec(value, fibonachiRecList);
        printFibonachi(fibonachiRecList);
    }

    private static void getFibonachiValues(int value ) {
        List<Integer> fibonachiRecList = new ArrayList<>();
        fibonachiRecList.add(0, 0);
        fibonachiRecList.add(1, 1);
        int listValue = 0;

        for (int i = 2; listValue <= value; i++) {
            listValue = fibonachiRecList.get(i - 1) + fibonachiRecList.get(i - 2);
            if (listValue <= value){
                fibonachiRecList.add(listValue);
            }
        }
        printFibonachi(fibonachiRecList);
    }

    private static List getFibonachiRec(int value, List<Integer> list){
       int i =  list.size();
       int fibonachiValue = list.get(i-1) + list.get(i - 2);
       if (fibonachiValue <= value){
           list.add(fibonachiValue);
           return getFibonachiRec(value, list);
       }else {
           return list;
       }
    }

    private static void printFibonachi(List<Integer> values) {
        for (Integer fibonacji : values) {
            System.out.print(fibonacji + ". ");
        }
    }

    private static List<Integer> fillStartFibonachiList() {
        List<Integer> fibonachiRecList = new ArrayList<>();
        fibonachiRecList.add(0);
        fibonachiRecList.add(1);
        return fibonachiRecList;
    }
}