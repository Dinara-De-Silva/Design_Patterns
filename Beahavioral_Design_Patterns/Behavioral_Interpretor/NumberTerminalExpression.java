package Behavioral_Interpretor;

public class NumberTerminalExpression implements AbstractExpression{
    String stringValue;
    public NumberTerminalExpression(String expression){this.stringValue =expression;}
    @Override
    public int interpret(Context context) {
        return context.get(stringValue);
    }
}
