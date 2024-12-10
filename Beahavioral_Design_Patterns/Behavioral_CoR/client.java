package Behavioral_CoR;

abstract class PaymentHandler{
    protected PaymentHandler next;
    public void setNext(PaymentHandler next){
        this.next=next;
    }
    public abstract void doPayment(double amount);
}

class Bank extends PaymentHandler{
    @Override
    public void doPayment(double amount) {
        if(amount<500){
            System.out.println("paid via bank account.");
        }
        else{
            next.doPayment(amount);
        }
    }
}

class CreditCard extends PaymentHandler{
    @Override
    public void doPayment(double amount) {
        if(amount>=500 && amount <10_000){
            System.out.println("paid via credit card.");
        }
        else{
            next.doPayment(amount);
        }
    }
}

class PayPal extends PaymentHandler{
    @Override
    public void doPayment(double amount) {
        System.out.println("paid via paypal.");
    }
}

public class client {
    public static void main(String arg[]){
        PaymentHandler bank = new Bank();
        PaymentHandler creditCard=new CreditCard();
        PaymentHandler paypal=new PayPal();

        bank.setNext(creditCard);
        creditCard.setNext(paypal);

        bank.doPayment(105.50);
        bank.doPayment(500);
        bank.doPayment(25_000);
    }
}















