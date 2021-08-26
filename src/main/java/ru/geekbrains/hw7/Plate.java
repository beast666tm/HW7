package ru.geekbrains.hw7;

public class Plate {
    static int volume; // в тарелке максимум
    static int currentVolume; // сейчас в тарелке

    Plate(int volume, int currentVolume){
        this.volume = volume;
        this.currentVolume = currentVolume;
    }

    public Plate() {

    }

    public void info() {
        System.out.println("сейчас в тарелке:" + currentVolume + "%" + " в тарелке максимум:" + volume + "%");
    }

    public void isValidVolume(){
        if (volume < 0) {
            volume = 0;
        } if (volume > currentVolume){
            volume = currentVolume;
        }
    }

}



