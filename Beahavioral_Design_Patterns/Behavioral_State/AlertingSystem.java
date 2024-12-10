package Behavioral_State;

// this interface allows creating behaviour-specific state objects
interface AlertState {
    public void alert(AlertStateContext asc);
}
// this is the object that wants to have its behaviour (here, the
// "alert()") changed when its state (here, the "AlertState") changes
class AlertStateContext {
    private AlertState currentState;
    private String contextData;
    public AlertStateContext(String contextData) {
        currentState = null;
        this.contextData = contextData;
    }
    public void setState(AlertState state) {
        currentState = state;
    }
    public String getContextData() {
        return contextData;
    }
    public void alert() {
        if(currentState != null)
            currentState.alert(this);
        else
            System.out.println(contextData+
                    "requires configuring an alert mechanism");
    }
}
// these are the behaviour-specific state objects
class Vibration implements AlertState {
    public void alert(AlertStateContext asc) {
        System.out.println(asc.getContextData()+"Vibrating alert");
    }
}

class Audible implements AlertState {
    public void alert(AlertStateContext asc) {
        System.out.println(asc.getContextData()+"Audible alert");
    }
}
class Visual implements AlertState {
    public void alert(AlertStateContext asc) {
        System.out.println(asc.getContextData()+"Visual alert");
    }
}

// this is the sample application class
public class AlertingSystem {
    public static void main(String [] args) {
        AlertStateContext stateContext = new AlertStateContext("iPhone7: ");
        stateContext.alert();
        stateContext.setState(new Vibration());
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Audible());
        stateContext.alert();
        stateContext.setState(new Visual());
        stateContext.alert();
        stateContext.alert();
    }
}

