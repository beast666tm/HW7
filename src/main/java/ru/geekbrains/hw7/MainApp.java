package ru.geekbrains.hw7;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Plate plate = new Plate(5);
        plate.info();

        Cats[] cat = new Cats[5];
        cat[0] = new Cats("Sonya", 10);
        cat[1] = new Cats("Sima", 20);
        cat[2] = new Cats("Musya", 15);
        cat[3] = new Cats("Neo", 30);
        cat[4] = new Cats("Fox", 5);
        for (Cats cats : cat) {
            cats.info();
            cats.catEat(plate);
            plate.info();
        }

        System.out.println('\n' + "После: ");
        plate.info();

    }
}
