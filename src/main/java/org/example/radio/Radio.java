package org.example.radio;

public class Radio {

    public int currentStation;
    public int numberOfStations = 10;

    public int minStation = 0;
    public int maxStation = numberOfStations - 1;

    public int maxVolume = 100;
    public int minVolume = 0;
    public int currentVolume = minVolume;

    public Radio() {

    }

    public Radio(int numberOfStations) {

        this.numberOfStations = numberOfStations;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > (numberOfStations - 1)) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation == (numberOfStations - 1)) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }


    public void prevStation() {
        if (currentStation == 0) {
            currentStation = (numberOfStations - 1);
        } else {
            currentStation = currentStation - 1;
        }
    }
}



