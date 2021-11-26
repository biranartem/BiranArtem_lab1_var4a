package bsu.rfe.java.group6.lab1.Biran.var4a;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
        Food[] breakfast = new Food[7];
        System.out.println("Введите кол-во продуктов");
        String nfood = scanner.nextLine();
        int intfood=Integer.parseInt(nfood);
        if (intfood>7)
        {
            System.out.println("Многовато ешь, больше 7 продуктов нельзя");
            intfood=7;
        }
        for (int i = 0; i < intfood; i++) {
            System.out.println("Введите блюдо");
            String food = scanner.nextLine();
            switch (food) {
                case "сыр" -> breakfast[i] = new Cheese();
                case "яблоко/большое" -> breakfast[i] = new Apple("большое");
                case "яблоко/маленькое" -> breakfast[i] = new Apple("маленькое");
                case "картофель/жареный" -> breakfast[i] = new Potato("жареный");
                case "картофель/фри" -> breakfast[i] = new Potato("фри");
                case "картофель/вареный" -> breakfast[i] = new Potato("вареный");
                default ->  throw new IllegalArgumentException("invalid value");
            }
        }
        for (Food food : breakfast) {
            if (food != null)
                food.consume();
            else break;
        }


        int apple_counter = 0;
        int cheese_counter = 0;
        int potato_counter = 0;
        for (int i = 0; i < 7; i++) {
            if (breakfast[i] instanceof Apple) {
                apple_counter++;
            } else if (breakfast[i] instanceof Cheese) {
                cheese_counter++;
            } else if (breakfast[i] instanceof Potato) {
                potato_counter++;
            }
        }
        System.out.println("CЫР - " + cheese_counter);
        System.out.println("ЯБЛОКО - " + apple_counter);
        System.out.println("КАРТОФЕЛЬ - " + potato_counter);
    }
}