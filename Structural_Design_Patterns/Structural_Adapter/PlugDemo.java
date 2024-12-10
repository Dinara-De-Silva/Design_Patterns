package Structural_Adapter;

class RoundHole{
    private double radius;

    public RoundHole(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public boolean isFit(RoundPeg peg){
        if (peg.getRadius()<=this.radius){
            return true;
        }
        return false;
    }
}

class RoundPeg{
    private double radius;
    public RoundPeg(){};
    public RoundPeg(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
}

class SquarePeg{
    double width;
    public SquarePeg(double width){
        this.width=width;
    }

    public double getWidth() {
        return width;
    }
}

class SquarePegAdaptor extends RoundPeg{
    private SquarePeg peg;
    public SquarePegAdaptor(SquarePeg peg){
        this.peg=peg;
    }

    @Override
    public double getRadius() {
        double r;
        r= Math.sqrt(Math.pow(peg.getWidth()/2,2 )*2);
        return r;
    }
}
public class PlugDemo {
    public static void main(String[] arg){
        RoundPeg peg=new RoundPeg(5);
        RoundHole hole = new RoundHole(5);
        if(hole.isFit(peg)){
            System.out.println("round peg r=5 fits round hole r=5");
        }
        SquarePeg speg1=new SquarePeg(8);
        SquarePeg speg2=new SquarePeg(4);

        SquarePegAdaptor a1= new SquarePegAdaptor(speg1);
        SquarePegAdaptor a2= new SquarePegAdaptor(speg2);
        if (hole.isFit(a1))
            System.out.println("square peg w=8 fits round hole r=5");
        else
            System.out.println("square peg w=5 does not fit round hole r=5");

        if (hole.isFit(a2))
            System.out.println("square peg w=4 fits round hole r=5");
        else
            System.out.println("square peg w=4 does not fit round hole r=5");
    }
}
