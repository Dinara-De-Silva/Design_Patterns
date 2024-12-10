package Creational_Prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

abstract class Shape implements Cloneable{
    public int x;
    public int y;
    private String colour;
    public Shape(){}
    public Shape(Shape shape){
        if (shape != null){
            this.x=shape.x;
            this.y=shape.y;
            this.colour=shape.colour;
        }
    }
    public abstract Shape Clone();


    public boolean equals(Object obj) {
        if (!(obj instanceof Shape))
            return false;
        Shape shape = (Shape) obj;
        return shape.x==this.x &&
                shape.y==this.y &&
                Objects.equals(shape.colour,this.colour);
    }
}

//-------------------------------------------------------------------------
class Circle extends Shape{
    public int radius;
    public String colour;

    public Circle(){};
    public Circle(Circle circle){
        super(circle);  // ai mehema danne?
        if(circle != null){
            this.radius=circle.radius;
            //this.colour=circle.colour;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Circle))
            return false;
        Circle circle=(Circle) obj;
        return circle.radius==this.radius &&
                Objects.equals(circle.colour,this.colour);
    }

    @Override
    public Shape Clone() {
        return new Circle(this);
    }
}
//------------------------------------------------------------------------
class Rectangle extends Shape{
    public int width;
    public int height;
    public String colour;

    public Rectangle(){};
    public Rectangle(Rectangle rectangle){
        super(rectangle);
        if(rectangle != null){
            this.width=rectangle.width;
            this.height =rectangle.height;
        }
    }
    @Override
    public Shape Clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.height == height;
    }
}
//=======================================================================

public class ShapeDemo {
    public static void main(String[] arg){
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.colour = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.Clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.colour = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.Clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}

