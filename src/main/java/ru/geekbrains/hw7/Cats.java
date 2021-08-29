package ru.geekbrains.hw7;

public class Cats {
    private final String name;
    private int appetite;
    private boolean hungry = true;

        public Cats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        //hungry = true;
    }

    public void catEat(Plate plate) {
        if (plate.getFood() < 0 && plate.getFood() != 0){
            plate.fillThePlate(appetite);
        }
        plate.isFull(appetite);
        hungry = false;
        System.out.println(name + " поела на " + appetite + ". " + "голод: " + hungry);
    }

    public void info() {
        System.out.println(name + " голод: " + hungry);
    }

    public int getAppetite() {
        return appetite;
    }

}
