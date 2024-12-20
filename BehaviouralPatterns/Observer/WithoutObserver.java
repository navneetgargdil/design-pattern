package BehaviouralPatterns.Observer;

class DisplayDeviceOld {

    public void showTemp(float Temp) {
        System.out.println("Current Temp: " + Temp + " C");
    }
   
}

class WeatherStationOld {

    private float Temp;
    private DisplayDeviceOld displayDevice;
    
    public WeatherStationOld(DisplayDeviceOld displayDevice) {
        this.displayDevice = displayDevice;
    }

    public void setTemperature(float temp) {
        this.Temp = temp;
        notifyDevice();
    }
    
    public void notifyDevice() {
        displayDevice.showTemp(Temp);
    }
}

public class WithoutObserver {
    public static void main(String[] args) {
        DisplayDeviceOld device = new DisplayDeviceOld();
        WeatherStationOld station = new WeatherStationOld(device);
        station.setTemperature(26);
        station.setTemperature(30);
    }
}
