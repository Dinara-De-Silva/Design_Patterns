package Creational_Singleton;



abstract class LogisticApp{
    public abstract Transport createTransport();
}

class RoadLogistic extends LogisticApp{

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

class SeaLogistic extends LogisticApp{

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

interface Transport{
    public void deliver();
}

class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Deliver by sea in a container.");
    }
}

class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Deliver by land in a box.");
    }
}

public class LogisticClient {
    public static void main(String[] arg){
        LogisticApp myApp1 = new RoadLogistic();
        LogisticApp myApp2 =  new SeaLogistic();
        Truck myTruck = (Truck)myApp1.createTransport();
        Ship myShip = (Ship)myApp2.createTransport();
        myShip.deliver();
        myTruck.deliver();
    }
}