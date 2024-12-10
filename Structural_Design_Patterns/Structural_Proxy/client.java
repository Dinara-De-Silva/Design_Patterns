package Structural_Proxy;

//subject
interface Image{
    void display() throws InterruptedException;
}

//real subject
class realImage implements  Image{
    private String fileName;
    public realImage(String fileName) throws InterruptedException {
        this.fileName=fileName;
        loadImageFromDB();
    }

    private void loadImageFromDB() throws InterruptedException {
        System.out.println("loading image : "+fileName);
        Thread.sleep(1000);
    }
    @Override
    public void display(){
        System.out.println("displaying image : "+fileName);
    }
}

class imageProxy implements Image{
    private realImage realImage;
    private String fileName;
    public imageProxy(String fileName)  {
        this.fileName=fileName;
    }
    @Override
    public void display() throws InterruptedException {
        if(realImage==null){
            realImage=new realImage(fileName);
        }
        realImage.display();
    }
}

public class client {
    public static void main(String[] arg) throws InterruptedException {
        Image image =new imageProxy("dinara.png");
        image.display();
        image.display();
    }
}