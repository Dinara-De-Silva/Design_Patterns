package Creational_Prototype;

public class Demo {
    public static void main(String[] arg) throws CloneNotSupportedException {
        BookShop my = new BookShop();
        my.loadData();
        my.setShopName("kumara");

//        Book book = new Book();
//        book.setBookId(100);
//        book.setBookName("Harry potter");
//        System.out.println(book.toString());

        BookShop my2 = (BookShop) my.clone();
        my2.setShopName("gunasena");
        my.getStore().remove(1);
        System.out.println(my.toString());
        System.out.println(my2.toString());

    }
}
