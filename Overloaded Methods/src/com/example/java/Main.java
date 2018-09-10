package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter your selection: ");
            System.out.println("1. Business Customer");
            System.out.println("2. Residential Customer");
            choice = in.nextInt();
            if (choice != 1 && choice != 2)
                System.out.println("Invalid answer, please try again.");
        } while (choice != 1 && choice != 2);
        switch (choice) {
            case 1:
                System.out.println("You selected: 1. Business Customer");
                String bname = nameInput("Enter your business name: ");
                String cname = nameInput("Enter your contact name: ");
                String bphone = phoneInput("Enter your phone number: ");
                System.out.println(bname);
                System.out.println(cname);
                System.out.println(bphone);
            break;
            case 2:
                System.out.println("You selected: 2. Residential Customer");
                String name = nameInput("Enter your name: ");
                String rphone = phoneInput("Enter your phone number: ");
                System.out.println(name);
                System.out.println(rphone);
            break;
        }
    }

    private static String nameInput(String name){
        System.out.println(name);
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    private static String phoneInput(String phone){
        System.out.println(phone);
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }
}
