package lld.designPatterns.interpreter;

public class NumberTerminalExpression implements AbstractExpression{

    String value;

    public NumberTerminalExpression(String value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return context.get(value);
    }
}
