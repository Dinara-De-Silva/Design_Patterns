package Creational_Factory_method;


abstract class Ecommerce{
    public abstract Product createProduct();
}

interface Product{

}

class Electronics implements Product{
    public Electronics(){
        System.out.println("An electronic product is created");
    }

}
class ElectronicFactory extends Ecommerce{
    public ElectronicFactory(){
        System.out.println("The electronic factory is open");
    }
    @Override
    public Product createProduct() {
        System.out.println("An electronic product is ordered.");
        return new Electronics();
    }
}

class Books implements Product{
    public Books(){
        System.out.println("A book is created");
    }
}

class BookFactory extends Ecommerce{
    public BookFactory(){
        System.out.println("Book Factory is open");
    }
    @Override
    public Product createProduct() {
        System.out.println("A book is ordered");
        return new Books();
    }
}
public class ClientCode {
    public static void main(String[] arg){
        Ecommerce myBookShop = new BookFactory();
        Ecommerce myElectronicShop = new ElectronicFactory();

        Product mybook1=myBookShop.createProduct();
        Product mychip=myElectronicShop.createProduct();
    }
}


