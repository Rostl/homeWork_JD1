package com.rost.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SweetHome {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sideA = 0;
        int sideB = 0;
        int sideC = 0;
        int sideD = 0;
        int areaSideE = 0;
        int areaSideF = 0;

        try {
            System.out.println("Input size for side A");
            sideA = Integer.parseInt(reader.readLine());
            System.out.println("Input size for side B");
            sideB = Integer.parseInt(reader.readLine());
            System.out.println("Input size for side C");
            sideC = Integer.parseInt(reader.readLine());
            System.out.println("Inpunt size for side D");
            sideD = Integer.parseInt(reader.readLine());
            System.out.println("Input size for area E");
            areaSideE = Integer.parseInt(reader.readLine());
            System.out.println("Input size for area F");
            areaSideF = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(isHouseFitOnTheArea(sideA, sideB, sideC, sideD, areaSideE, areaSideF));
    }

    private static String isHouseFitOnTheArea(int sideA, int sideB, int sideC, int sideD, int areaSideE, int areaSideF) {

        String positiveResult = "Дома вмещаются на учасок";
        String negativeResult = "Дома не вмещаются на участок";
        if ((isPositivesideAandSideD(sideA,sideB,sideC,sideD,areaSideE,areaSideF)) || (isPositiveSideAandSideC(sideA,sideB,sideC,sideD,areaSideE,areaSideF)) || (isPositiveSideBAndSideC(sideA,sideB,sideC,sideD,areaSideE,areaSideF)) || (isPositiveSideBAndSideD(sideA,sideB,sideC,sideD,areaSideE,areaSideF))) {
            return positiveResult;
        }
        return negativeResult;
    }

    private static boolean isPositivesideAandSideD(int sideA, int sideB, int sideC, int sideD, int areaSideE, int areaSideF) {
        if (((sideA + sideD <= areaSideE) && (sideB <= areaSideF) && (sideC <= areaSideF)) || ((sideA + sideD <= areaSideF) && (sideB <= areaSideE) && (sideC <= areaSideE))) {
            return true;
        }
        return false;
    }

    private static boolean isPositiveSideAandSideC(int sideA, int sideB, int sideC, int sideD, int areaSideE, int areaSideF) {
        if (((sideA + sideC <= areaSideE) && (sideB <= areaSideF) && (sideD <= areaSideF)) || ((sideA + sideC <= areaSideF) && (sideB <= areaSideE) && (sideD <= areaSideE))) {
            return true;
        }
        return false;
    }
    private static boolean isPositiveSideBAndSideD(int sideA, int sideB, int sideC, int sideD, int areaSideE, int areaSideF){
        if (((sideB+ sideD <= areaSideE) && (sideA <= areaSideF) && (sideC <= areaSideF)) || ((sideB + sideD <= areaSideF) && (sideA <= areaSideE) && (sideC <= areaSideE))) {
            return true;
        }
        return false;
    }
    private static boolean isPositiveSideBAndSideC(int sideA, int sideB, int sideC, int sideD, int areaSideE, int areaSideF){
        if (((sideB+ sideC <= areaSideE) && (sideA <= areaSideF) && (sideD <= areaSideF)) || ((sideB + sideC <= areaSideF) && (sideA <= areaSideE) && (sideD <= areaSideE))) {
            return true;
        }
        return false;
    }

}
