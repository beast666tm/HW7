package ru.geekbrains.hw7;

public class MainApp {
    public static void main(String[] args) {
        Cats cat = new Cats("Sonya");
        Plate plate = new Plate(50);
        cat.info();
        plate.info();

        cat.catEat(plate);

        cat.info();
        plate.info();

    }
}
