package com.testegit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite sua idade");
        int idade = scan.nextInt();
        System.out.println("Você e essa idade exatamente acredita = " + idade);

    }
}