package Behavioral_Observer;

public class YouTube {
    public static void main(String arg[]) {
        YTChannel disney = new YTChannel("Disney");
        Subscriber sub1 = new Subscriber("nadev");
        Subscriber sub2 = new Subscriber("kasun");
        Subscriber sub3 = new Subscriber("dasun");
        Subscriber sub4 = new Subscriber("dilanka");

        sub1.subscribeAChannel(disney);
        sub2.subscribeAChannel(disney);
        sub3.subscribeAChannel(disney);
        sub4.subscribeAChannel(disney);

        disney.addVideo("Sleeping beauty and the prince");
    }
}
