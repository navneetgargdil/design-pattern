package BehaviouralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;


interface Observer {
    void update(float temp);
    
}

interface Subject {
     void attach(Observer obs);
     void deattach(Observer obs);
     void notifyObserver();
}

class WeatherStation implements Subject{

    private float temprature;

    private List<Observer> observerList;

    WeatherStation() {
        observerList = new ArrayList<>();
    }

    public void setTemperature(float temprature) {
        this.temprature = temprature;
        notifyObserver();
    }

    
    @Override
    public void attach(Observer obs) {

        observerList.add(obs);
    }

    @Override
    public void deattach(Observer obs) {

        observerList.remove(obs);
    }

    @Override
    public void notifyObserver() {
        
        for (Observer observer : observerList) {
            observer.update(temprature); // Run Time Polymorphism
        }
    }
}

class DisplayDevice implements Observer {
    String name;

    DisplayDevice(String name) {
        this.name = name;
    }

    @Override
    public void update(float temp) {
        System.out.println("Temprature on " + name + " : " + temp);
    }

    
}

class  Mobile implements Observer {

    String name;

    Mobile(String name) {
        this.name = name;
    }

    @Override
    public void update(float temp) {
        System.out.println("Temprature on " + name + " : " + temp);
    }

    
}

public class ObserverPattern {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        DisplayDevice device1 = new DisplayDevice("Device 1");
        DisplayDevice device2 = new DisplayDevice("Device 2");

        Mobile android = new Mobile("Android");
        Mobile ios = new Mobile("IOS");
        

        weatherStation.attach(device1);
        weatherStation.attach(device2);
        weatherStation.attach(android);
        weatherStation.attach(ios);

        weatherStation.setTemperature(24);
    }

    
}
