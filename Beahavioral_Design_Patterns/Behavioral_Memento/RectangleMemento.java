package Behavioral_Memento;

public class RectangleMemento {
    private int width;
    private int length;
    public RectangleMemento(int width,int length){
        this.length=length;
        this.width=width;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

}
