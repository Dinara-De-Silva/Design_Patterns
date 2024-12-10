package Creational_Singleton;

class MySingleton {
    private static volatile MySingleton instance;
    private String data;

    private MySingleton(String data){
        this.data=data;
    }
    public static MySingleton getInstance(String data){

        if (instance==null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton(data);
                }
            }
        }
        return instance;
    }
    public String getData(){
        return data;
    }

}

public class Singleton {
    public static void main(String[] arg){
        MySingleton[] mine= new MySingleton[5];
        mine[0]=MySingleton.getInstance("queen");
        mine[1]=MySingleton.getInstance("king");
        mine[2]=MySingleton.getInstance("son");
        mine[3]=MySingleton.getInstance("cse");
        mine[4]=MySingleton.getInstance("night");
        for (int i=0;i<5;i++){
            System.out.println(mine[i].getData());
        }
    }
}
