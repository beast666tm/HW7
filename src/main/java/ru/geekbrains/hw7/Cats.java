package ru.geekbrains.hw7;

public class Cats {
    private String name;
    private int appetite;
    int satiety;
    private boolean hungry;

    public Cats(String name) {
        this.name = name;
        this.appetite = 5;
        this.hungry = true;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }


    public int getAppetite() {
        return appetite;
    }

    public void info() {
        System.out.println(name + " голод: " + hungry);
    }

    public void catEat(Plate plate){
        if(plate.getFood() <= 0 && appetite != 0){
            hungry = true;
            return;
        }
        plate.decreaseFood(appetite);
        hungry = false;
    }

}
