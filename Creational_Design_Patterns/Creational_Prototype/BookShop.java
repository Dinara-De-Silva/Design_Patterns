package Creational_Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    String shopName;
    List<Book> store =new ArrayList<>(10);

    public String getShopName() {
        return shopName;
    }

    public List<Book> getStore() {
        return store;
    }

    @Override
    public String toString() {
        return shopName+" { store=" + store +
                '}';
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public List loadData(){
        for (int i=0; i<10;i++){
            Book b = new Book();
            b.setBookId(i*100);
            b.setBookName("book"+i);
            this.store.add(b);
        }
        return store;
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        for (Book book: this.getStore()){
            shop.getStore().add(book);
        }
        return shop;
    }
}
