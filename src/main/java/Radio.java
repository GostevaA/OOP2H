public class Radio {
    public int station;
    public int volume;

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

    public void setMaxStation() {
        station = 9;
    }

    public void setNextStation(int newStation) {
        if (newStation < 9) {
            newStation = newStation + 1;
        }
        station = newStation;
    }

    public void setPrevStation(int newStation) {
        if (newStation > 0) {
            newStation = newStation - 1;
        }
        station = newStation;
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
    public void increaseVolume(){
        if(volume < 10){
            volume = volume + 1;
        }
    }
    public void decreaseVolume(){
        if(volume > 0){
            volume = volume - 1;
        }
    }
}
