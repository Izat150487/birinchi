package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        int a = ran.nextInt(10);//3 рандом сан алып алардын суммасын жана орточо арифметикалык санын табабыз
        int b = ran.nextInt(10);
        int c = ran.nextInt(10);
        System.out.println(a+b+c/3);



    }
}
