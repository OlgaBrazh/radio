package org.example.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void test(){

    }

    @Test
    public void testNumberOfStations (){
        Radio radio = new Radio(30);

        Assertions.assertEquals(30, radio.numberOfStations);


    }

    @Test
    public void shouldSetVolumeIfCorrectValues() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(3);

        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeBelowMinByOne() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMinByMoreTheOne() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(-15);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMinByOne() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMaxByOne() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(9);

        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMaxByOne() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMaxByMoreTheOne() {
        //Radio radio = new Radio();

        radio.setCurrentVolume(125);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeIfMiddleVolume() {
        //Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfMaxVolume() {
        //Radio radio = new Radio();
        radio.setCurrentVolume(radio.maxVolume);

        radio.increaseVolume();

        int expected = radio.maxVolume;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfVolumeBelowMaxByOne() {
        //Radio radio = new Radio();
        radio.setCurrentVolume(radio.maxVolume-1);

        radio.increaseVolume();

        int expected = radio.maxVolume;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfMinVolume() {
        //Radio radio = new Radio();
        radio.setCurrentVolume(radio.minVolume);

        radio.increaseVolume();

        int expected = radio.minVolume+1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfMiddleVolume() {
        //Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfMaxVolume() {
        //Radio radio = new Radio();
        radio.setCurrentVolume(radio.maxVolume);

        radio.decreaseVolume();

        int expected = radio.maxVolume-1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfVolumeBelowMaxByOne() {
        //Radio radio = new Radio();
        radio.setCurrentVolume(radio.maxVolume-1);

        radio.decreaseVolume();

        int expected = radio.maxVolume-2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfMinVolume() {
        //Radio radio = new Radio();
        radio.setCurrentVolume(radio.minVolume);

        radio.decreaseVolume();

        int expected = radio.minVolume;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfAboveMinByOne() {
        //Radio radio = new Radio();
        radio.setCurrentVolume(radio.minVolume+1);

        radio.decreaseVolume();

        int expected = radio.minVolume;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIfCorrectValue() {
        //Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {
        //Radio radio = new Radio();

        radio.setCurrentStation(radio.minStation);

        int expected = radio.minStation;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStationBelowMinByOne() {
        //Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = radio.minStation;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMinByMoreTheOne() {
        //Radio radio = new Radio();

        radio.setCurrentStation(-15);

        int expected = radio.minStation;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveMinByOne() {
        //Radio radio = new Radio();

        radio.setCurrentStation(radio.minStation+1);

        int expected = radio.minStation+1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        //Radio radio = new Radio();

        radio.setCurrentStation(radio.maxStation);

        int expected = radio.maxStation;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMaxByOne() {
        //Radio radio = new Radio();

        radio.setCurrentStation(radio.maxStation-1);

        int expected = radio.maxStation-1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveMaxByOne() {
        //Radio radio = new Radio();

        radio.setCurrentStation(radio.maxStation+1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveMaxByMoreTheOne() {
        //Radio radio = new Radio();

        radio.setCurrentStation(radio.maxStation+30);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationIfMiddleVolume() {
        //Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.nextStation();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationIfMaxStation() {
        //Radio radio = new Radio();
        radio.setCurrentStation(radio.maxStation);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationIfBelowMaxByOne() {
        //Radio radio = new Radio();
        radio.setCurrentStation(radio.maxStation-1);

        radio.nextStation();

        int expected = radio.maxStation;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationIfMinStation() {
        //Radio radio = new Radio();
        radio.setCurrentStation(radio.minStation);

        radio.nextStation();

        int expected = radio.minStation+1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationIfAboveMinByOne() {
        //Radio radio = new Radio();
        radio.setCurrentStation(radio.minStation+1);

        radio.nextStation();

        int expected = radio.minStation+2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationIfMiddleStation() {
        //Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.prevStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationIfMaxStation() {
        //Radio radio = new Radio();
        radio.setCurrentStation(radio.maxStation);

        radio.prevStation();

        int expected = radio.maxStation-1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationIfMinStation() {
        //Radio radio = new Radio();
        radio.setCurrentStation(radio.minStation);

        radio.prevStation();

        int expected = radio.maxStation;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationIfAboveMinByOne() {
        //Radio radio = new Radio();
        radio.setCurrentStation(radio.minStation+1);

        radio.prevStation();

        int expected = radio.minStation;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

}













