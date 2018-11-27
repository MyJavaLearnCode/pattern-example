package pattern.behavior.interpreter;

public class NonterminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端表达式");
    }
}
