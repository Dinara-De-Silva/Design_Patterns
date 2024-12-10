package Behavioral_Memento;

public class Client {
    public static void main(String Arg[]){
        RectangleOriginator myRectangle=new RectangleOriginator(5,6);
        RectangleMemento memento1= myRectangle.createMemento();
        System.out.println(myRectangle.toString());
        myRectangle.setLength(10);
        System.out.println(myRectangle.toString());
        myRectangle.restoreMemento(memento1);
        System.out.println(myRectangle.toString());
    }
}
