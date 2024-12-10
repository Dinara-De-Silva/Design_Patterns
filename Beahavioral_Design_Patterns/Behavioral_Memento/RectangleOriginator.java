package Behavioral_Memento;

public class RectangleOriginator {
    private int width;
    private int length;

    public RectangleOriginator(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public RectangleMemento createMemento(){
        return new RectangleMemento(this.width,this.length);
    }
    public void restoreMemento(RectangleMemento memento){
        this.setWidth(memento.getWidth());
        this.setLength(memento.getLength());
    }

    @Override
    public String toString() {
        return "RectangleOriginator{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
