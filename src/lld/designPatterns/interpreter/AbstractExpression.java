package lld.designPatterns.interpreter;

public interface AbstractExpression {
    // based on the expression terminal or non terminal we have different logic on the interpret method
    int interpret(Context context);
}
