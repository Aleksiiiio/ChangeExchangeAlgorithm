package algorithm;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int[] groszamount = {50000,20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1};
        System.out.println("Prosze zaplacić ileś tam złotych nwm");
        double money = scaner.nextDouble();
        System.out.println("Oto reszta: ");
        System.out.println(Arrays.toString(exchangeMoney(money, groszamount)));
    }
    public static int[] exchangeMoney(double exchange, int[] groszamount){
        int size = groszamount.length;
        int[] amountOfBills = new int[size];
        int restInGroszes = (int) (exchange * 100);

        for(int i = 0; i < size;i++){
            amountOfBills[i] = 0;
        }

        for(int i = 0; i < size; i++){
            if(restInGroszes >= groszamount[i]){
                amountOfBills[i]  = restInGroszes/groszamount[i];
                restInGroszes -= groszamount[i] * amountOfBills[i];
            }
        }
        return amountOfBills;
    }
}