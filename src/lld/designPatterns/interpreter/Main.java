package lld.designPatterns.interpreter;

public class Main {
    // Based on the context, interpreter should interpret
    public static void main(String[] args) {
        //Initialize the context
        Context context = new Context();
        context.put("a",2);
        context.put("b",4);

        AbstractExpression expression = new MultiplyNonTerminalExpression(
                new NumberTerminalExpression("a"), new NumberTerminalExpression("b")
        );

        System.out.println(expression.interpret(context));
    }
}
