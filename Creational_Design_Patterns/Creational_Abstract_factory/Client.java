package Creational_Abstract_factory;

public class Client {
    public static void main(String[] arg){
        CarFactory myA = new NorthAmericanCarFactory();
        CarFactory myE = new EuropeanCarFactory();

        Sedan mySedan =(Sedan) myA.createCar();
        mySedan.assemble();
    }
}


interface CarFactory{
    public Car createCar();
    public CarSpecification createCarSpecification();
}

class NorthAmericanCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createCarSpecification() {
        return new NorthAmericanSpec();
    }
}

class EuropeanCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecification createCarSpecification() {
        return new EuropeanSpec();
    }
}

interface Car{
    void assemble();
}

interface CarSpecification{
    void display();
}
class Sedan implements Car{

    @Override
    public void assemble() {
        System.out.println("Assembling Sedan car");
    }
}

class Hatchback implements Car{

    @Override
    public void assemble() {
        System.out.println("Assembling Hatchback car");
    }
}

class NorthAmericanSpec implements CarSpecification{

    @Override
    public void display() {
        System.out.println("""
                North America Car Specification: 
                    Safety features compliant with local regulations.""");
    }
}

class EuropeanSpec implements CarSpecification{

    @Override
    public void display() {
        System.out.println("Europe Car Specification: \n" +
                "   Fuel efficiency and emissions compliant with EU standards");
    }
}

