package com.company;

public class Main {

    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//        try {
//            task1.inputSides();
//        } catch (IOException e) {
//            System.err.print(e.getMessage() + "\n");
//            System.out.println("error");
//        }
//
//        System.out.println("hello");

        Plant[] plants = new Plant[5];
        try {
        Plant plant1 = new Plant("White", "Rose", 5);
        System.out.println(plant1);
        Plant plant2 = new Plant("Yel", "Chamomile", 2);
        System.out.println(plant2);
        Plant plant3 = new Plant("Black", "Chamomile", 7);
        System.out.println(plant3);
        Plant plant4 = new Plant("Green", "CHRYSANTHEMUMS", 15);
        System.out.println(plant4);
        Plant plant5 = new Plant("Blue", "Rose", 21);
        System.out.println(plant5);
            System.out.println("new     ");
        plants[0] = plant1;
        plants[1] = plant2;
        plants[2] = plant3;
        plants[3] = plant4;
        plants[4] = plant5;
        for (int p=0; p<plants.length;p++)  {
            System.out.println(plants[p]);
        }
    } catch (ColorException | TypeException e) {
        System.err.println(e.getMessage() + "\n");
        e.printStackTrace();
    }


    }
}
