package Behavioral_State;

interface VendingMachineState{
    void handleRequest();
}

class ReadyState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("This is ready state.");
    }
}
class ProductSelectState implements VendingMachineState{

    @Override
    public void handleRequest() {
        System.out.println("This is product selecting state.");
    }
}

class PaymentPendingState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("This is payment state.");
    }
}

class OutOfStockState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("This out of stock state.");
    }
}

class VendingMachineContext{
    private VendingMachineState state;

    public void setState(VendingMachineState state) {
        this.state = state;
    }
    public void request(){
        state.handleRequest();
    }
}

public class client {
    public static void main(String[] arg){
        VendingMachineContext machine =new VendingMachineContext();
        VendingMachineState readyState = new ReadyState();
        VendingMachineState outOfStock = new OutOfStockState();
        machine.setState(readyState);
        machine.request();
        machine.setState(outOfStock);
        machine.request();
    }
}