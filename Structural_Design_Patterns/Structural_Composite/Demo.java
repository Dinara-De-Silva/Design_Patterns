package Structural_Composite;

public class Demo {
    public static void main(String[] arg){
        Leaf CR80 = new Leaf("CR80",150);
        Leaf CR160 = new Leaf("CR160",230);
        Leaf CR200 = new Leaf("CR80",350);
        Leaf BluePen = new Leaf("Blue Pen",30);
        Leaf RedPen = new Leaf("Red Pen",30);
        Leaf Pencil = new Leaf("pencil",25);

        Composite CR_Books = new Composite("CR_Books");
        Composite Pen = new Composite("pens");
        Composite School_Equipments = new Composite("School Equipments");

        CR_Books.addComponent(CR80);
        CR_Books.addComponent(CR160);
        CR_Books.addComponent(CR200);

        Pen.addComponent(RedPen);
        Pen.addComponent(BluePen);

        School_Equipments.addComponent(CR_Books);
        School_Equipments.addComponent(Pen);
        School_Equipments.addComponent(Pencil);

        School_Equipments.showPrice();
        System.out.println("...............................");
        CR_Books.showPrice();

    }
}
