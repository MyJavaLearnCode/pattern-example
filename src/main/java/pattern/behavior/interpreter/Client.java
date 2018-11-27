package pattern.behavior.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 解释器模式:给定一个语言,定义它的文法的一种表示,并定义一个解释器,这个解释器使用该表示来解释语言中的句子;
 * 如果一个特定类型的问题发生的频率足够高,那么可能就值得将该问题的各个实例表述为一个简单语言中的句子.
 * 这样就可以构造一个解释器,该解释器通过解释这些句子来解决该问题;
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> expressionList = new ArrayList<>();
        expressionList.add(new TerminalExpression());
        expressionList.add(new NonterminalExpression());
        expressionList.add(new TerminalExpression());
        expressionList.add(new TerminalExpression());

        for (AbstractExpression abstractExpression : expressionList) {
            abstractExpression.interpret(context);
        }

    }
}
