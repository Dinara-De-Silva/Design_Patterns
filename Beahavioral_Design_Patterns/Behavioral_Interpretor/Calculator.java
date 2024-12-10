package Behavioral_Interpretor;

public class Calculator implements AbstractExpression{
    AbstractExpression leftValue,rightValue;
    char operator;

    public Calculator(AbstractExpression leftValue, AbstractExpression rightValue,char operator) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
        this.operator=operator;
    }

    @Override
    public int interpret(Context context) {
        switch (operator){
            case '*':
                return leftValue.interpret(context)*rightValue.interpret(context);
            case '+':
                return leftValue.interpret(context)+rightValue.interpret(context);
            case '-':
                return leftValue.interpret(context)-rightValue.interpret(context);
            case '/':
                return leftValue.interpret(context)/rightValue.interpret(context);
            default:
                return 0;
        }
    }
}
