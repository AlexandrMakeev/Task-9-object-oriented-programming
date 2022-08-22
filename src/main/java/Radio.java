public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationCount;

    public Radio() {
        this.stationCount = 10;
    }

    public Radio(int stationCount) {
        this.stationCount = stationCount;
    }


    public void next() {
        if (currentStation < stationCount - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = stationCount -1;
        }
    }

    public void nextVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void prevVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return currentStation;
        }
        if (currentStation > stationCount - 1) {
            return currentStation;
        }

        this.currentStation = currentStation;
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return currentVolume;
        }
        if (currentVolume > 100) {
            return currentVolume;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
    }
}

