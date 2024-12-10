package Behavioral_Interpretor;

public class Client {
    public static void main(String arg[]){
        Context context =new Context();
        context.put("a",50);
        context.put("b",10);
        context.put("c",7);
        context.put("d",18);

        AbstractExpression numbers = new NumberTerminalExpression("c");
        System.out.println(numbers.interpret(context));

        AbstractExpression cal = new Calculator(
                new Calculator(new NumberTerminalExpression("a"),new NumberTerminalExpression("b"),'/'),
                new Calculator(new NumberTerminalExpression("c"),new NumberTerminalExpression("d"),'-'),
                '*'
        );
        System.out.println("(a/b)*(c-d) = "+ cal.interpret(context));

    }
}
