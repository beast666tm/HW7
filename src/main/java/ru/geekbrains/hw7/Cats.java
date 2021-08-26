package ru.geekbrains.hw7;

public class Cats extends Plate {
    String name;
    static String hunger;
    static int appetite;
    static boolean satiety;

    public Cats(String name, int appetite, boolean satiety, String hunger) {
        super();
        this.name = name;
        this.hunger = hunger;
        this.appetite = appetite; // аппетит
        this.satiety = satiety;   // сытость кошки

    }

    public void hungry() {
        if (satiety) {
            hunger = "hungry";
        }
        if (!satiety) {
            hunger = "wel-feed";
        }
    }

    public static void feedTheCats() {
        do {
            if (appetite >= currentVolume) {
                volume++;
                System.out.println("кому то не хватило, надо пополнить тарелку.");
                System.out.println("Наполняем тарелку");
            }
            if (appetite < currentVolume) {
                currentVolume = appetite;
                System.out.println(" поела");
            }
            break;
        } while (Cats.satiety);

    }

    public void info() {
        System.out.println(name + " " + "аппетит: " + appetite + "%" + " " + " Сытость: " + hunger);
    }
}
