package ru.geekbrains.hw7;

public class Plate {
    private int food;
    private final int startFood;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.startFood = food;
        this.food = food;
    }

    public void isFull(int n) {
        if (food > n && food <= 0) {
            food += n;
        } else {
            fillThePlate(n);
            food += n;
            System.out.printf("В тарелке осталось еды: %d \n", food);
        }
    }

    public void fillThePlate(int n) {
        setFood(startFood);
        System.out.println("Тарелку наполнили на: " + n);
    }

    public void info() {
        System.out.printf("В тарелке еды: %d \n", food);
    }

}



