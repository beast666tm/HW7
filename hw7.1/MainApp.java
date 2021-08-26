package ru.geekbrains.hw7;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Feed the cats.");

        Cats[] cat = new Cats[3];

        cat[0] = new Cats("Sonya", 10, false, "Sonya");
        cat[1] = new Cats("Sima", 30, true, "Sima");
        cat[2] = new Cats("AnyCat", 20, true, "AnyCat");
        for (int i = 0; i < cat.length - 1; i++) {
            cat[i].info();
        }

//        cat1.info();
//        cat2.info();

        Plate plate = new Plate(100, 50);
        plate.info();
        System.out.println();

        for (int i = 0; i < cat.length; i++) {
            cat[i].feedTheCats();
        }
//        Cats.feedTheCats();

        for (int i = 0; i < cat.length; i++) {
            cat[i].hungry();
            cat[i].info();
            System.out.println();
        }
        for (int i = 0; i < cat.length; i++) {
            cat[i].info();
            System.out.println();
        }
    }
}
