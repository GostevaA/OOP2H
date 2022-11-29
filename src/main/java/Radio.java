public class Radio {
    private int station;
    private int volume;
    private int maxStation;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsAmount) {
        this.maxStation = stationsAmount - 1;
    }

    public int getStation() {
        return station;
    }

    public int getVolume() {

        return volume;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < minStation) {
            return;
        }
        if (newStation > maxStation) {
            return;
        }
        station = newStation;
    }

    public void setNextStation(int newStation) {
        if (newStation < maxStation) {
            newStation++;
        } else {
            newStation = minStation;
        }
        station = newStation;
    }

    public void setPrevStation(int newStation) {
        if (newStation > minStation) {
            newStation--;
        } else {
            newStation = maxStation;
        }
        station = newStation;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }
    public void increaseVolume() {
        if (volume < maxVolume) {
            volume++;
        }else{
            volume =  maxVolume;
        }
    }
    public void decreaseVolume() {
        if (volume > minVolume) {
            volume--;
        } else{
            volume = minVolume;
        }
    }
}

