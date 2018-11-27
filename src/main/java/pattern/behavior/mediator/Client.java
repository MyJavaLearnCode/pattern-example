package pattern.behavior.mediator;

/**
 * 中介者模式:用一个中介对象来封装一系列的对象交互.
 * 中介者使各个对象不需要显式地相互引用,从而使耦合松散,并且可以独立的改变它们直接的交互;
 * 中介者模式将对象间交互的复杂性集中到中介者一个类中
 */
public class Client {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleagueA concreteColleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB(mediator);

        mediator.setConcreteColleagueA(concreteColleagueA);
        mediator.setConcreteColleagueB(concreteColleagueB);

        concreteColleagueA.send("吃饭了吗?");
        concreteColleagueB.send("没有呢?");
    }
}
