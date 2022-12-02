import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        int expected = 4;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-2);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSetNextStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setNextStation();
        int expected = 6;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNoSetNextAfterMax(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setPrevStation();
        int expected = 4;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNoSetPrevBelowMin(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevStation();
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        int expected = 6;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNoSetVolumeMoreThanMax(){
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldNoSetVolumeLessThanMin(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-4);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNoSetVolumeAboveMax(){
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNoSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNoIncreaseVolumeAboveMax(){
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNoDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

}