public class Radio {
    private int station;
    private int volume;

    public int getStation() {
        return station;
    }

    public int getVolume() {
        return volume;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        station = newStation;
    }

    public void setNextStation() {
        if (station < 9) {
            station++;
        } else {
            station = 9;
        }
    }

    public void setPrevStation() {
        if (station > 0) {
            station--;
        } else {
            station = 0;
        }
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        volume = newVolume;
    }


    public void increaseVolume() {
        if (volume < 10) {
            volume++;
        } else {
            volume = 10;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        } else {
            volume = 0;
        }
    }
}
